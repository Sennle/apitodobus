package pro.ruta.metodos;

import java.util.List;

import pro.ruta.dto.Bus;
import pro.ruta.dto.Detalle;
import pro.ruta.dto.Distrito;
import pro.ruta.dto.Paradero;
import pro.ruta.dto.Pasaje;
import pro.ruta.dto.Reporte;
import pro.ruta.dto.TipoReporte;
import pro.ruta.dto.Usuario;

public interface MetodosGET {
	
	
	public List<Distrito>listaDistrito() ;
	
	public List<TipoReporte>listaTipo() ;
	
	public List<Pasaje>listPasaje();
	
	public Usuario loginUsuario(String correo, String clave);
	
	public List<Reporte>listReporte(int tiporeporte) ;
	
	public List<Paradero>listParadero(String cod_bus) ;
	
	public Detalle ObtenerDetalle(String cod_bus);
	
	public List<Bus>ListaBus();

}
