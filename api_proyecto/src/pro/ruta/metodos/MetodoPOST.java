package pro.ruta.metodos;

import pro.ruta.dto.Reporte;
import pro.ruta.dto.Usuario;

public interface MetodoPOST {
	
	public int registrarUsuario(Usuario usu);
	
	public int registrarReporte(Reporte report);
	
	

}
