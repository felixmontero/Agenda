import java.util.Collections;
import java.util.LinkedList;

public class Agenda {

	private String nombre;
	private LinkedList<Contacto> contactos;
	
	public Agenda(String n) {
		this.nombre=n;
		this.contactos=new LinkedList<Contacto>();
	}
	 
	public void addContacto(Contacto c) {
		this.contactos.add(c);
		Collections.sort(this.contactos);
	}
	
	public void delContacto(Contacto c) {
		this.contactos.remove(c);
		
	}
	
	public LinkedList<Contacto> findContacto(String n) {
		
		LinkedList<Contacto> encontrados=new LinkedList<Contacto>();
		
		
		for (Contacto c:this.contactos) {
			if (c.getNombre().toLowerCase().startsWith(n.toLowerCase())){
				encontrados.add(c);
			}
		}
		
		return encontrados;
		
	}

	public String getNombre() {
		return nombre;
	}
	
	
	public LinkedList<Contacto> getContactos(){
		return this.contactos;
	}
	
	
	
	
}
