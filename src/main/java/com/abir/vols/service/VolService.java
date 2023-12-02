package com.abir.vols.service;

import java.util.List;

import com.abir.vols.entities.Pilote;
import com.abir.vols.entities.Vol;

public interface VolService {
	Vol saveVol(Vol v);
    Vol updateVol(Vol v);
    void deleteVol(Vol v);
    void deleteVolById(Long id);
    Vol getVol(Long id);
    List<Vol> getAllVols();
    
    List<Vol>findByDestinationVol(String destination);
    List<Vol> findByDestinationVolContains(String destination);
    List<Vol> findByDestinationPrix(String destination, Double prix);
    List<Vol> findByPilote(Pilote pilote);
    List<Vol> findByPiloteIdPil(Long id);
    List<Vol> findByOrderByDestinationVolAsc();
    List<Vol> trierVolsDestinationsPrix(); 


}
