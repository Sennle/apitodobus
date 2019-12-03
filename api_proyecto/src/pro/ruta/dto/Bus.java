package pro.ruta.dto;

import java.io.Serializable;

public class Bus implements Serializable{

	/*cod_bus varchar(6),
empresa varchar(100),*/
	
	private String cod_bus;
	private String empresa;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(String cod_bus, String empresa) {
		super();
		this.cod_bus = cod_bus;
		this.empresa = empresa;
	}
	public String getCod_bus() {
		return cod_bus;
	}
	public void setCod_bus(String cod_bus) {
		this.cod_bus = cod_bus;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
	
}
