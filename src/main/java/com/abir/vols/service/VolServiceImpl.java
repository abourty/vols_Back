package com.abir.vols.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abir.vols.entities.Pilote;
import com.abir.vols.entities.Vol;
import com.abir.vols.repos.VolRepository;

@Service
public class VolServiceImpl implements VolService {

	@Autowired
	VolRepository volRepository;
	@Override
	public Vol saveVol(Vol v) {
		return volRepository.save(v);
	}

	@Override
	public Vol updateVol(Vol v) {
		return volRepository.save(v);
	}

	@Override
	public void deleteVol(Vol v) {
		volRepository.delete(v);
	}

	@Override
	public void deleteVolById(Long id) {
		volRepository.deleteById(id);
	}

	@Override
	public Vol getVol(Long id) {
		return volRepository.findById(id).get();
	}

	@Override
	public List<Vol> getAllVols() {
		return volRepository.findAll();
	}

	@Override
	public List<Vol> findByDestinationVol(String destination) {
		// TODO Auto-generated method stub
		return volRepository.findByDestinationVol(destination);
	}

	@Override
	public List<Vol> findByDestinationVolContains(String destination) {
		// TODO Auto-generated method stub
		return volRepository.findByDestinationVolContains(destination);

	}

	@Override
	public List<Vol> findByDestinationPrix(String destination, Double prix) {
		// TODO Auto-generated method stub
		return volRepository.findByDestinationPrix(destination, prix);

	}

	@Override
	public List<Vol> findByPilote(Pilote pilote) {
		// TODO Auto-generated method stub
		return volRepository.findByPilote(pilote);
	}

	@Override
	public List<Vol> findByPiloteIdPil(Long id) {
		// TODO Auto-generated method stub
		return volRepository.findByPiloteIdPil(id);

	}

	@Override
	public List<Vol> findByOrderByDestinationVolAsc() {
		// TODO Auto-generated method stub
		return volRepository.findByOrderByDestinationVolAsc();
	}

	@Override
	public List<Vol> trierVolsDestinationsPrix() {
		// TODO Auto-generated method stub
		return volRepository.trierVolsDestinationsPrix();
	}
	}