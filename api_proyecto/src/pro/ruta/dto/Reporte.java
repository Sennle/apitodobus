package pro.ruta.dto;

import java.io.Serializable;

public class Reporte implements Serializable{
	/*cod_reporte int auto_increment,
cod_tipoReporte int,
cod_usu int,
descripcion varchar(50),*/

	
	private int cod_reporte;
	private int cod_tipoReporte;
	private int cod_usu;
	private String descripcion;
	public Reporte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Reporte(int cod_reporte, int cod_tipoReporte, int cod_usu, String descripcion) {
		super();
		this.cod_reporte = cod_reporte;
		this.cod_tipoReporte = cod_tipoReporte;
		this.cod_usu = cod_usu;
		this.descripcion = descripcion;
	}
	public int getCod_reporte() {
		return cod_reporte;
	}
	public void setCod_reporte(int cod_reporte) {
		this.cod_reporte = cod_reporte;
	}
	public int getCod_tipoReporte() {
		return cod_tipoReporte;
	}
	public void setCod_tipoReporte(int cod_tipoReporte) {
		this.cod_tipoReporte = cod_tipoReporte;
	}
	public int getCod_usu() {
		return cod_usu;
	}
	public void setCod_usu(int cod_usu) {
		this.cod_usu = cod_usu;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
