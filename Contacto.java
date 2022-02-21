import java.util.LinkedList;

public class Contacto implements Comparable<Contacto>{
	
	private String nombre;
	private LinkedList<Informacion> informaciones;
	
	public Contacto(String n) {
		this.nombre=n;
		this.informaciones=new LinkedList<Informacion>();
	}
	
	public void addInfo(Informacion i) {
		this.informaciones.add(i);
	}
	
	public void delInfo(Informacion i) {
		this.informaciones.remove(i);
	}
	
	public void update(String n) {
		this.nombre=n;
	}
	
	public Informacion findInfo(String t) {
		
		for (Informacion i:this.informaciones) {
			
			if (i.getTipo().equals(t)) return i;
			
		}
		
		return null;
		
	}

	public String getNombre() {
		return nombre;
	}
	
	public LinkedList<Informacion> getInformaciones(){
		return this.informaciones;
	}
	

	@Override
	public int compareTo(Contacto o) {
		return this.nombre.compareToIgnoreCase(o.getNombre());
	}
	
	
}
