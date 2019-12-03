package pro.ruta.dto;

import java.io.Serializable;

public class Distrito implements Serializable{
	
	
	private int cod_dist;
	private String nom_dist;
	
	
	public Distrito(int cod_dist, String nom_dist) {
		super();
		this.cod_dist = cod_dist;
		this.nom_dist = nom_dist;
	}
	public Distrito() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCod_dist() {
		return cod_dist;
	}
	public void setCod_dist(int cod_dist) {
		this.cod_dist = cod_dist;
	}
	public String getNom_dist() {
		return nom_dist;
	}
	public void setNom_dist(String nom_dist) {
		this.nom_dist = nom_dist;
	}
	
	

}
