package com.abir.vols;

import java.util.List;
import java.util.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abir.vols.entities.Pilote;
import com.abir.vols.entities.Vol;
import com.abir.vols.repos.VolRepository;

@SpringBootTest
class VolsApplicationTests {
	@Autowired
	private VolRepository volRepository;
	
	@Test
    public void testCreateVol() {
		Vol vo = new Vol("tunisaire",new Date(),"canada","tunisie",100.00);
		volRepository.save(vo);
	}
	

	@Test
	public void testFindVol()
	{
		
		Vol v = volRepository.findById(1L).get();
		System.out.println(v);
	}
	@Test
	public void testUpdateVol()
	{
		Vol v = volRepository.findById(1L).get();
		v.setDestinationVol("grece");
		volRepository.save(v);
	}

	@Test
	public void testDeleteVol()
	{
		volRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousVols()
	{
		List<Vol> vos = volRepository.findAll();
		for (Vol v : vos)
		{
			System.out.println(v);
		}
	}
	@Test
	public void testFindByDestinationVol()
	{
	 List<Vol> vo = volRepository.findByDestinationVol("france");
		for (Vol v : vo)
		{
			System.out.println(v);
		}
	}
	@Test
	public void testFindByDestinationVolContains () {
		List<Vol> vo = volRepository.findByDestinationVolContains("algerie");
		for (Vol v : vo) {
			System.out.println(v);
		}
	}
	
	

	@Test
	public void testfindByDestinationPrix()
	{
		List<Vol> vo = volRepository.findByDestinationPrix("France", 500.0);
		for (Vol v : vo)
		{
			System.out.println(v);
		}
	}
	
	
	@Test
	public void testfindByPilote()
	 {
	    Pilote pil = new Pilote();
	    pil.setIdPil(1L);
    	List<Vol> vo = volRepository.findByPilote(pil);
	      for (Vol v : vo)
	      {
	        System.out.println(v);
	      }
	 }

	@Test
	public void findByPiloteIdPil()
	{
	List<Vol> vo = volRepository.findByPiloteIdPil(1L);
	for (Vol v : vo)
	{
	  System.out.println(v);
	}
	 }
	
	@Test
	public void testfindByOrderByDestinationVoltAsc()
	{
	 List<Vol> vo = volRepository.findByOrderByDestinationVolAsc();
	  for (Vol v : vo)
	  {
	   System.out.println(v);
	  }
	}

	
	@Test
	public void testTrierVolsDestinationsPrix()
	{
	List<Vol> vo = volRepository.trierVolsDestinationsPrix();
	for (Vol v : vo)
	{
	System.out.println(v);
	}
	}






}
	
	
