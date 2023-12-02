package com.abir.vols.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.abir.vols.entities.Pilote;
import com.abir.vols.repos.PiloteRepository;
@RestController
@RequestMapping("/api/pil")
@CrossOrigin("*")
public class PiloteRESTController {
	
         @Autowired
         PiloteRepository piloteRepository;
         
   @RequestMapping(method=RequestMethod.GET)
   public List<Pilote> getAllPilotes()
  {
     return piloteRepository.findAll();
  }
   
   
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Pilote getPiloteById(@PathVariable("id") Long id) {
return piloteRepository.findById(id).get();
}
}