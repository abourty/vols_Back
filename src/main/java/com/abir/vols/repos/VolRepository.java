package com.abir.vols.repos;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.abir.vols.entities.Pilote;
import com.abir.vols.entities.Vol;
@RepositoryRestResource(path = "rest")
public interface VolRepository extends JpaRepository<Vol, Long> {
	
	List<Vol> findByDestinationVol(String destination);

    List<Vol> findByDestinationVolContains(String destination);
    
    List<Vol> findByPiloteIdPil(Long id);
    
    List<Vol> findByOrderByDestinationVolAsc();
   
    List<Vol> findByPiloteNumeroLicensePil(String numeroLicensePil);

    
   

    @Query("select v from Vol v where v.destinationVol like %?1 and v.prixVol > ?2")
    List<Vol> findByDestinationPrix (String destination, Double prix);
 
   
    @Query("select v from Vol v where v.pilote = ?1")
    List<Vol> findByPilote (Pilote pilote); 
    
    
    @Query("select v from Vol v order by v.destinationVol ASC, v.prixVol DESC")
    List<Vol> trierVolsDestinationsPrix ();
     
   
	
}