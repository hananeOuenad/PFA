package com.gfa.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
@JsonAutoDetect(fieldVisibility = Visibility.ANY)
@Entity
public class Vehicule implements Serializable {
	@Id
private int id;
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int matricule;
private String marque;
private String genre;
private Collection<Vidange> vidanges;

public int getId() {
	//kjkjlkjkkj
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMatricule() {
	return matricule;
}
public void setMatricule(int matricule) {
	this.matricule = matricule;
}
public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public Vehicule(int matricule, String marque, String genre) {
	super();
	this.matricule = matricule;
	this.marque = marque;
	this.genre = genre;
}
public Vehicule() {
	super();
}



}
