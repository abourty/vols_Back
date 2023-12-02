package com.abir.vols.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



@Entity
public class Vol {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVol;
    private String compagnieAerienneVol;
    private String origineVol;
    private String destinationVol;
    private Date dateDep;
    private Double prixVol;
    
    
    @ManyToOne
    private Pilote pilote;

public Vol() {
    super();

}





public Vol(String compagnieAerienneVol, Date dateDep,String destinationVol,String origineVol,  
		Double prixVol) {
	super();
	
	this.compagnieAerienneVol = compagnieAerienneVol;
	this.origineVol = origineVol;
	this.destinationVol = destinationVol;
	this.dateDep = dateDep;
	this.prixVol = prixVol;
	
	
	
	
	
	
}





public Long getIdVol() {
	return idVol;
}





public void setIdVol(Long idVol) {
	this.idVol = idVol;
}





public String getCompagnieAerienneVol() {
	return compagnieAerienneVol;
}





public void setCompagnieAerienneVol(String compagnieAerienneVol) {
	this.compagnieAerienneVol = compagnieAerienneVol;
}





public String getOrigineVol() {
	return origineVol;
}





public void setOrigineVol(String origineVol) {
	this.origineVol = origineVol;
}





public String getDestinationVol() {
	return destinationVol;
}





public void setDestinationVol(String destinationVol) {
	this.destinationVol = destinationVol;
}





public Date getDateDep() {
	return dateDep;
}





public void setDateDep(Date dateDep) {
	this.dateDep = dateDep;
}





public Double getPrixVol() {
	return prixVol;
}





public void setPrixVol(Double prixVol) {
	this.prixVol = prixVol;
}





public Pilote getPilote() {
	return pilote;
}





public void setPilote(Pilote pilote) {
	this.pilote = pilote;
	
}





@Override
public String toString() {
	return "Vol [idVol=" + idVol + ", compagnieAerienneVol=" + compagnieAerienneVol + ", origineVol=" + origineVol
			+ ", destinationVol=" + destinationVol + ", dateDep=" + dateDep + ", prixVol=" + prixVol + "]";
}



}
