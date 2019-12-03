package pro.ruta.dto;

import java.io.Serializable;

public class Pasaje implements Serializable{
	
	private int cod_pasaje ;
	private double pasaje;
	public Pasaje() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pasaje(int cod_pasaje, double pasaje) {
		super();
		this.cod_pasaje = cod_pasaje;
		this.pasaje = pasaje;
	}
	public int getCod_pasaje() {
		return cod_pasaje;
	}
	public void setCod_pasaje(int cod_pasaje) {
		this.cod_pasaje = cod_pasaje;
	}
	public double getPasaje() {
		return pasaje;
	}
	public void setPasaje(double pasaje) {
		this.pasaje = pasaje;
	}
	
	
	

}
