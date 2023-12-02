package com.abir.vols.entities;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Pilote {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPil;
    private String nomPil;
    private String numeroLicensePil;

    @JsonIgnore
    @OneToMany(mappedBy = "pilote")
    private List<Vol> vols;
    public Pilote() {}
    // TODO Auto-generated constructor stub
	public Pilote( String nomPil, String numeroLicensePil, List<Vol> vols) {
		super();
		
		this.nomPil = nomPil;
		this.numeroLicensePil = numeroLicensePil;
		this.vols = vols;
	}



	public Long getIdPil() {
		return idPil;
	}


	public void setIdPil(Long idPil) {
		this.idPil = idPil;
	}


	public String getNomPil() {
		return nomPil;
	}


	public void setNomPil(String nomPil) {
		this.nomPil = nomPil;
	}


	public String getNumeroLicensePil() {
		return numeroLicensePil;
	}


	public void setNumeroLicensePil(String numeroLicensePil) {
		this.numeroLicensePil = numeroLicensePil;
	}


	public List<Vol> getVols() {
		return vols;
	}


	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}
    
  

	}