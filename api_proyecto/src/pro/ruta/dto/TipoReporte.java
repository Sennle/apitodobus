package pro.ruta.dto;

import java.io.Serializable;

public class TipoReporte implements Serializable{
	
	
	/*cod_tipoReporte int auto_increment,
reporte varchar(50),*/

	private int cod_tipoReporte;
	private String reporte;
	public TipoReporte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TipoReporte(int cod_tipoReporte, String reporte) {
		super();
		this.cod_tipoReporte = cod_tipoReporte;
		this.reporte = reporte;
	}
	public int getCod_tipoReporte() {
		return cod_tipoReporte;
	}
	public void setCod_tipoReporte(int cod_tipoReporte) {
		this.cod_tipoReporte = cod_tipoReporte;
	}
	public String getReporte() {
		return reporte;
	}
	public void setReporte(String reporte) {
		this.reporte = reporte;
	}
	
	
	
	
}
