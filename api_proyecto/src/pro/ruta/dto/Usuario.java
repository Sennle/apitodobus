package pro.ruta.dto;

import java.io.Serializable;

public class Usuario implements Serializable{
	
	/*cod_usu  int auto_increment,
nombre_usu varchar(15),
apePat_usu varchar(25),
apeMat_usu varchar(25),
correo_usu  varchar(45) not null,
clave_usu    varchar(50),*/
	
	private int cod_usu;
	private String nombre_usu;
	private String apePat_usu ;
	private String apeMat_usu;
	private String correo_usu;
	private String clave_usu;
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Usuario(int cod_usu, String nombre_usu, String apePat_usu, String apeMat_usu, String correo_usu,
			String clave_usu) {
		super();
		this.cod_usu = cod_usu;
		this.nombre_usu = nombre_usu;
		this.apePat_usu = apePat_usu;
		this.apeMat_usu = apeMat_usu;
		this.correo_usu = correo_usu;
		this.clave_usu = clave_usu;
	}
	public int getCod_usu() {
		return cod_usu;
	}
	public void setCod_usu(int cod_usu) {
		this.cod_usu = cod_usu;
	}
	public String getNombre_usu() {
		return nombre_usu;
	}
	public void setNombre_usu(String nombre_usu) {
		this.nombre_usu = nombre_usu;
	}
	public String getApePat_usu() {
		return apePat_usu;
	}
	public void setApePat_usu(String apePat_usu) {
		this.apePat_usu = apePat_usu;
	}
	public String getApeMat_usu() {
		return apeMat_usu;
	}
	public void setApeMat_usu(String apeMat_usu) {
		this.apeMat_usu = apeMat_usu;
	}
	public String getCorreo_usu() {
		return correo_usu;
	}
	public void setCorreo_usu(String correo_usu) {
		this.correo_usu = correo_usu;
	}
	public String getClave_usu() {
		return clave_usu;
	}
	public void setClave_usu(String clave_usu) {
		this.clave_usu = clave_usu;
	}
	
	
	

}
