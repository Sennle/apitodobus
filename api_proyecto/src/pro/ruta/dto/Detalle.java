package pro.ruta.dto;

import java.io.Serializable;
import java.util.List;

public class Detalle implements Serializable{
//Detallese del Bus
	
	
	/*cod_detBus int auto_increment,
cod_bus varchar(6),
cod_dist int,
cod_paradero int,
cod_pasaje int,
imagen varchar(8),*/
	
	
	private int cod_detBus;
	private String cod_bus;
	private int cod_paradero;
	private List<Pasaje> cod_pasaje;
	private String imagen;
	private List<Paradero>lstparadero;
	public Detalle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Detalle(int cod_detBus, String cod_bus, int cod_paradero, List<Pasaje> cod_pasaje, String imagen,
			List<Paradero> lstparadero) {
		super();
		this.cod_detBus = cod_detBus;
		this.cod_bus = cod_bus;
		this.cod_paradero = cod_paradero;
		this.cod_pasaje = cod_pasaje;
		this.imagen = imagen;
		this.lstparadero = lstparadero;
	}
	public int getCod_detBus() {
		return cod_detBus;
	}
	public void setCod_detBus(int cod_detBus) {
		this.cod_detBus = cod_detBus;
	}
	public String getCod_bus() {
		return cod_bus;
	}
	public void setCod_bus(String cod_bus) {
		this.cod_bus = cod_bus;
	}
	public int getCod_paradero() {
		return cod_paradero;
	}
	public void setCod_paradero(int cod_paradero) {
		this.cod_paradero = cod_paradero;
	}
	public List<Pasaje> getCod_pasaje() {
		return cod_pasaje;
	}
	public void setCod_pasaje(List<Pasaje> cod_pasaje) {
		this.cod_pasaje = cod_pasaje;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public List<Paradero> getLstparadero() {
		return lstparadero;
	}
	public void setLstparadero(List<Paradero> lstparadero) {
		this.lstparadero = lstparadero;
	}
	

	
}
