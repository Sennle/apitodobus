package pro.ruta.dto;

import java.io.Serializable;
import java.util.List;

public class Paradero implements Serializable{

	/*
	 * cod_paradero int auto_increment,
cod_dist int,
cod_bus varchar(6),
descripcion varchar(100),
	 * 
	 * */
	
	private int cod_paradero;
	private int cod_dis;
	private String cod_bus;
	private String descripcion;
	private List<Bus> lstbus;
	public Paradero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Paradero(int cod_paradero, int cod_dis, String cod_bus, String descripcion) {
		super();
		this.cod_paradero = cod_paradero;
		this.cod_dis = cod_dis;
		this.cod_bus = cod_bus;
		this.descripcion = descripcion;
	}
	
	public Paradero(int cod_paradero, int cod_dis, String cod_bus, String descripcion, List<Bus> lstbus) {
		super();
		this.cod_paradero = cod_paradero;
		this.cod_dis = cod_dis;
		this.cod_bus = cod_bus;
		this.descripcion = descripcion;
		this.lstbus = lstbus;
	}
	
	
	
	public List<Bus> getLstbus() {
		return lstbus;
	}
	public void setLstbus(List<Bus> lstbus) {
		this.lstbus = lstbus;
	}
	public int getCod_paradero() {
		return cod_paradero;
	}
	public void setCod_paradero(int cod_paradero) {
		this.cod_paradero = cod_paradero;
	}
	public int getCod_dis() {
		return cod_dis;
	}
	public void setCod_dis(int cod_dis) {
		this.cod_dis = cod_dis;
	}
	public String getCod_bus() {
		return cod_bus;
	}
	public void setCod_bus(String cod_bus) {
		this.cod_bus = cod_bus;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
