package beans;

import javax.annotation.Resource;

import modelo.Apuesta;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class ApuestasDaoImpl {
	
	private String urlConexion ="";
	@Autowired
	private SessionFactory sessionFactory;
	
	// autowired indica a spring que coja otra bean disponible en el contenedor
	// del mismo tipo que la propriedad indicada
	@Autowired
	// una obcion generalmente mas segura es indicar la bean que queremos
	// por su id, para eso se usa @Resource
	
	//@Resource (name="idDeLaBeanQue se asigna a el private" + "UsuariosDaoImpl usuarioDaoImpl")
	private UsuariosDaoImpl usuariosDaoImpl;

	public void registrarApuestas(Apuesta apuesta){
		sessionFactory.getCurrentSession().save(apuesta);
	}
	
	
	public void cancelarApuesta(int id) {
		
		System.out.println("conectando: " + urlConexion);
		System.out.println("cancelar apuesta de id: " + id);
		System.out.println("devolviendo el dinero a quien apostó...");
		usuariosDaoImpl.devolverDineroApuesta(id, 13);
	}

	public String getUrlConexion() {
		return urlConexion;
	}

	public void setUrlConexion(String urlConexion) {
		this.urlConexion = urlConexion;
	}

	public UsuariosDaoImpl getUsuariosDaoImpl() {
		return usuariosDaoImpl;
	}

	public void setUsuariosDaoImpl(UsuariosDaoImpl usuariosDaoImpl) {
		this.usuariosDaoImpl = usuariosDaoImpl;
	}


	
}
