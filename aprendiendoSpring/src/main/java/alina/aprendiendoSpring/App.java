package alina.aprendiendoSpring;

import modelo.Apuesta;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.ApuestasDaoImpl;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {

		// vamos a aprender spring
		// spring se basa en el uso de un contenedor de instancias
		// dicho contenedor se le llama contexto de spring

		// la forma mas comun de crear ese contenedor es diciendo al spring por
		// un
		// xml, que objetos va a tener el contenedor.
		// Dicho xml se le suele llamar applicationContext.xml
		
		
		// crear un contenedor con todo lo que este puesto en el applicationContext.xml
		// ese contenedor sera reutilizado a lo largo de la aplicación
		
		ClassPathXmlApplicationContext contenedor =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// ahora cuando queramos un objeto al contenedor, lo pedimos asi:
		
		ApuestasDaoImpl dao = contenedor.getBean("apuestasDaoImpl", ApuestasDaoImpl.class); 
		Apuesta a = new Apuesta();
		a.setNombre("nombre de la apuesta");
		a.setCampo1("valor campo1");
		dao.registrarApuestas(a);

	}
}
