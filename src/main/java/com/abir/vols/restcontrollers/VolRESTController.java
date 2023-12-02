package com.abir.vols.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.abir.vols.entities.Vol;
import com.abir.vols.service.VolService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class VolRESTController {
	@Autowired
	VolService volService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Vol> getAllVols() {
		return volService.getAllVols();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Vol getVolById(@PathVariable("id") Long id) {
		return volService.getVol(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public Vol createVol(@RequestBody Vol vol) {
		return volService.saveVol(vol);
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Vol updateVol(@RequestBody Vol vol) {
		return volService.updateVol(vol);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteVol(@PathVariable("id") Long id)
	{
		volService.deleteVolById(id);
	}

	/*@RequestMapping(value ="/vopil/{idPil}", method = RequestMethod.GET)
	public List<Vol> getVolsByPilId(@PathVariable("idPil") Long idPil) {
		return volService.findByPiloteIdPil(idPil);
		}
	*/
	
	
	
	
	
	@RequestMapping(value="/vopil/{idPil}",method = RequestMethod.GET)
	public List<Vol> getVolsByPilId(@PathVariable("idPil") Long idPil) {
		return volService.findByPiloteIdPil(idPil);
	 }
	
	@RequestMapping(value = "/voByDestination/{destination}", method = RequestMethod.GET)
	public List<Vol> findByDestinationVolContains(@PathVariable("destination") String destination) {
		return volService.findByDestinationVolContains(destination);
	}

}