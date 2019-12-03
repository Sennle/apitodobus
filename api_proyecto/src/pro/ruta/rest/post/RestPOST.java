package pro.ruta.rest.post;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import pro.ruta.dto.Reporte;
import pro.ruta.dto.Usuario;
import pro.ruta.metodos.MetodoPOST;
import util.Mysqldb;

@Path("/Enviar")
public class RestPOST implements MetodoPOST{

	
	// http://localhost:8080/api_proyecto/Enviar/registroUsuario
	
	@POST
	@Path("/registroUsuario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int registrarUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		Connection cn = null;
		PreparedStatement pst = null;
		int rs = 0;
		try {
			cn = Mysqldb.getConexion();
			String sql = "insert into tb_usuario values (null,?,?,?,?,?)";
			
			pst = cn.prepareStatement(sql);
			/**/
			pst.setString(1, usu.getNombre_usu());
			pst.setString(2, usu.getApePat_usu());
			pst.setString(3, usu.getApeMat_usu());
			pst.setString(4, usu.getCorreo_usu());
			pst.setString(5, usu.getClave_usu());
			
			rs = pst.executeUpdate();
			
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
		
		return rs;
	}

	// http://localhost:8080/api_proyecto/Enviar/registraReporte
	
	@POST
	@Path("/registraReporte")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int registrarReporte(Reporte report) {
		// TODO Auto-generated method stub
		Connection cn = null;
		PreparedStatement pst = null;
		int rs = 0;
		try {
			cn = Mysqldb.getConexion();
			String sql ="insert into tb_reporte values (null,?,?,?)";
			pst = cn.prepareStatement(sql);
			/**/
			pst.setInt(1, report.getCod_tipoReporte());
			pst.setInt(2, report.getCod_usu());
			pst.setString(3, report.getDescripcion());
			
			rs = pst.executeUpdate();
			
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
		
		return rs;
	}

}
