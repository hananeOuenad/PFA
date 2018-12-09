package com.gfa.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Entity
public class Vidange implements Serializable {
	@Id
	private int id;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private  int qteHuile;
	@ManyToOne
	@JoinColumn(name="CODE_Vehicule")
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	
	private Vehicule vehicule;
	
	public Vidange() {
		super();
		//test
	}
	public Vidange(int id, int qteHuile) {
		super();
		this.id = id;
		this.qteHuile = qteHuile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQteHuile() {
		return qteHuile;
	}
	public void setQteHuile(int qteHuile) {
		this.qteHuile = qteHuile;
	}
}
