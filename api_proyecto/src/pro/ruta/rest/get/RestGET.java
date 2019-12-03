package pro.ruta.rest.get;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pro.ruta.dto.Bus;
import pro.ruta.dto.Detalle;
import pro.ruta.dto.Distrito;
import pro.ruta.dto.Paradero;
import pro.ruta.dto.Pasaje;
import pro.ruta.dto.Reporte;
import pro.ruta.dto.TipoReporte;
import pro.ruta.dto.Usuario;
import pro.ruta.metodos.MetodosGET;
import util.Mysqldb;

@Path("/ObtenerData")
public class RestGET implements MetodosGET{

	
	@GET
	@Path("/distrito")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Distrito> listaDistrito(){
		// TODO Auto-generated method stub
		List<Distrito>list = new ArrayList<Distrito>();
		ResultSet rs = null;
		Connection cn = null;
		PreparedStatement pst = null;
		try {
			cn = Mysqldb.getConexion();
			String sql = "select * from tb_distrito";
			pst = cn.prepareStatement(sql);
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Distrito dis = new Distrito();
				
				dis.setCod_dist(rs.getInt(1));
				dis.setNom_dist(rs.getString(2));
				
				list.add(dis);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
			cn.close();
			pst.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}

	
	@GET
	@Path("/tipoReporte")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoReporte> listaTipo() {
		// TODO Auto-generated method stub
		List<TipoReporte> list = new ArrayList<TipoReporte>();
		ResultSet rs = null;
		Connection cn = null;
		PreparedStatement pst = null;
		
		try {
			cn = Mysqldb.getConexion();
			String sql = "select * from tb_tipoReporte";
			pst = cn.prepareStatement(sql);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				TipoReporte tipo = new TipoReporte();
				
				tipo.setCod_tipoReporte(rs.getInt(1));
				tipo.setReporte(rs.getString(2));
				
				list.add(tipo);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				cn.close();
				pst.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return list;
	}

	
	@GET
	@Path("/pasaje")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Pasaje> listPasaje() {
		// TODO Auto-generated method stub
		List<Pasaje>list = new ArrayList<Pasaje>();
		ResultSet rs = null;
		Connection cn = null;
		PreparedStatement pst = null;
		try {
			cn = Mysqldb.getConexion();
			String sql = "select * from tb_pasaje";
			pst = cn.prepareStatement(sql);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				Pasaje p = new Pasaje();
				p.setCod_pasaje(rs.getInt(1));
				p.setPasaje(rs.getDouble(2));
				
				list.add(p);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
	// http://localhost:8080/api_proyecto/ObtenerData/login/?/?

	@GET
	@Path("/login/{lcorreo}/{lclave}")
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario loginUsuario(@PathParam("lcorreo") String correo, @PathParam("lclave") String clave) {
		// TODO Auto-generated method stub
		Usuario usu = new Usuario();
		Connection cn = null;
		ResultSet rs = null;
		PreparedStatement pst = null;
		try {
			
			cn = Mysqldb.getConexion();
			String sql = "select * from tb_usuario where correo_usu = ? and clave_usu = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setString(1, correo);
			pst.setString(2, clave);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				usu = new Usuario();
				usu.setCod_usu(rs.getInt(1));
				usu.setNombre_usu(rs.getString(2));
				usu.setApePat_usu(rs.getString(3));
				usu.setApeMat_usu(rs.getString(4));
				usu.setCorreo_usu(rs.getString(5));
				usu.setClave_usu(rs.getString(6));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				cn.close();
				pst.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return usu;
	}
	
	// http://localhost:8080/api_proyecto/ObtenerData/reporte/?

	@GET
	@Path("/reporte/{rCodigo}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Reporte> listReporte(@PathParam("rCodigo") int tiporeporte) {
		// TODO Auto-generated method stub
		List<Reporte>list = new ArrayList<Reporte>();
		ResultSet rs = null;
		Connection cn = null;
		PreparedStatement pst = null;
		try {
			cn = Mysqldb.getConexion();
			String sql = "select * from tb_reporte where cod_tipoReporte = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setInt(1,tiporeporte);			
			
			rs = pst.executeQuery();
			while(rs.next()) {
				Reporte re = new Reporte();
				re.setCod_reporte(rs.getInt(1));
				re.setCod_tipoReporte(rs.getInt(2));
				re.setCod_usu(rs.getInt(3));
				re.setDescripcion(rs.getString(4));
				list.add(re);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				cn.close();
				pst.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return list;
	}

	// http://localhost:8080/api_proyecto/ObtenerData/paradero/?
	
	@GET
	@Path("/paradero/{pcodbus}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Paradero> listParadero(@PathParam("pcodbus") String cod_bus) {
		// TODO Auto-generated method stub
		List<Paradero>list = new ArrayList<Paradero>();
		ResultSet rs = null;
		Connection cn = null;
		PreparedStatement pst = null;
		try {
			
			cn = Mysqldb.getConexion();
			String sql = "select * from tb_paradero where cod_bus = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setString(1, cod_bus);
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				Paradero p = new Paradero();
				p.setCod_paradero(rs.getInt(1));
				p.setCod_bus(rs.getString(2));
				p.setCod_dis(rs.getInt(3));
				p.setDescripcion(rs.getString(4));
				list.add(p);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				cn.close();
				pst.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return list;
	}


	



	@Override
	@GET
	@Path("/bus")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bus> ListaBus() {
		// TODO Auto-generated method stub
		List<Bus>list = new ArrayList<Bus>();
		ResultSet rs = null;
		PreparedStatement pst = null;
		Connection cn = null;
		try {
			cn = Mysqldb.getConexion();
			String sql = "select * from tb_bus";
			
			pst = cn.prepareStatement(sql);
			
			rs = pst.executeQuery();
			while(rs.next()) {
				Bus b = new Bus();
				b.setCod_bus(rs.getString(1));
				b.setEmpresa(rs.getString(2));
				
				list.add(b);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				cn.close();
				pst.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		return list;
	}


	@Override
	@GET
	@Path("/detalle/{dcod}")
	@Produces(MediaType.APPLICATION_JSON)
	public Detalle ObtenerDetalle(@PathParam("dcod") String cod_bus) {
		// TODO Auto-generated method stub
		Connection cn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Detalle deta = null;
		try {
			List<Paradero> lst = listParadero(cod_bus);
			List<Pasaje> lista = listPasaje();
			cn = Mysqldb.getConexion();
			String sql = "select cod_detBus, d.cod_bus,imagen from tb_bus b inner join tb_detalleBus d on b.cod_bus = d.cod_bus where d.cod_bus = ?";
			pst = cn.prepareStatement(sql);
			
			pst.setString(1,cod_bus);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				deta = new Detalle();
				deta.setCod_detBus(rs.getInt(1));
				deta.setCod_bus(rs.getString(2));
				deta.setCod_pasaje(lista);
				deta.setImagen(rs.getString(3));
				deta.setLstparadero(lst);				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
		
		
		return deta;
	}

	
	
	
	
	
}
