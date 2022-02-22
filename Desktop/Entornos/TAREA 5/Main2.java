import java.util.LinkedList;
import java.util.Scanner;

public class Main2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Contacto contacto=null;
		String opcion;
		String nombre;
		Agenda miAgenda=new Agenda("Mobiles de contacto");
		
		do {
			
			System.out.println("AGENDA: "+miAgenda.getNombre());
			System.out.println("1) A�adir Contactos");
			System.out.println("2) Buscar Contactos");
			System.out.println("3) Listar Contactos");
			System.out.println("4) Salir");
			opcion=Integer.parseInt(sc.nextLine());
			
			if (opcion==1)) {
			
				System.out.println("Alias del Contacto: ");
				
				contacto=new Contacto(nombre=sc.nextLine());
				miAgenda.addContacto(contacto);
				
			}
			
			if (opcion==2) {
				System.out.println("Alias del Contacto:");
				String nombre=sc.nextLine();
				
				LinkedList<Contacto> encontrados=miAgenda.findContacto(nombre);
				if (encontrados.isEmpty()) {
					System.out.println("No se ha encontrado a nadie!!!");
				}
				
				if (encontrados.size()==1) {
					contacto=encontrados.getFirst();
				}
				
				if (encontrados.size()>1) {
					
					int x=1;
					int n=0;
					for (Contacto c:encontrados) {
						System.out.println(x+") "+c.getNombre());
						x++;
					}
					
					boolean error=true;
					do {
						try {
							System.out.println("N� del contacto?");
							n = Integer.parseInt(sc.nextLine());
							if (n>0 &&  n <= encontrados.size()) {
								error=false;
							}
						} catch (NumberFormatException e) {
							System.out.println("N�mero incorrecto!!");
						} 
					} while (error);
					
					
					contacto=encontrados.get(n-1);
					
				}
				
				
			}
			
			if (opcion==3) {
				
				for (Contacto c:miAgenda.getContactos()) {
					System.out.println(c.getNombre());
					for (Informacion i:c.getInformaciones()) {
						System.out.println(" - "+i.getTipo()+": "+i.getInfo());
						
					}
				}
			}
			
			
			while (contacto!=null) {
				
				System.out.println("CONTACTO: "+contacto.getNombre());
				System.out.println("----------------------------------------------");
				System.out.println("DATOS:");
				int x=1;
				for (Informacion i:contacto.getInformaciones()) {
					System.out.println(x+" - "+i.getTipo()+": "+i.getInfo());
					x++;
				}
				System.out.println("----------------------------------------------");
				System.out.println("1) Cambiar Nombre");
				System.out.println("2) A�adir Info");
				System.out.println("3) Modificar Info");
				System.out.println("4) Eliminar Info");
				System.out.println("5) Eliminar Contacto");
				System.out.println("V) Volver al men� Principal");
				
				opcion=sc.nextLine();
				
				 
					if(opc�on.equals("1"){
						System.out.println("Nuevo Nombre:");
						contacto.update(sc.nextLine());
					}
					if(opcion.equals("2"){
						System.out.println("Tipo de informaci�n");
						String tipo=sc.nextLine();
						System.out.println("Valor de la informaci�n");
						String valor=sc.nextLine();
						
						Informacion i=new Informacion(tipo, valor);
						
						contacto.addInfo(i);
						
					}
					if (opcion.equals("3"){
						try {
							System.out.println("N� de la Informaci�n");
							int n=Integer.parseInt(sc.nextLine());
							
							if (n<=0 || n>contacto.getInformaciones().size()) {
								System.out.println("Incorrecto!!");
							} else {
								Informacion info=contacto.getInformaciones().get(n-1);
								System.out.println("Nuevo valor: ");
								info.update(sc.nextLine());
							}
						} catch (NumberFormatException e1) {
							System.out.println("Error");
						}
					}
					case "4":
						int n2;
						
						try {
							System.out.println("N� de la Informaci�n");
							n2 = Integer.parseInt(sc.nextLine());
							if (n2<=0 || n2>contacto.getInformaciones().size()) {
								System.out.println("Incorrecto!!");
							} else {
								contacto.delInfo(contacto.getInformaciones().get(n2-1));
							}
						} catch (NumberFormatException e) {
							System.out.println("Error");
						}
						
						
						break;
					case "5":
						System.out.println("Est�s seguro? (S/N)");
						if (sc.nextLine().equalsIgnoreCase("s")) {
							miAgenda.delContacto(contacto);
							contacto=null;
						}
					break;
					case "v":
						contacto=null;
						
					break;
				}
				
				
				
				
				
			}
			
		} while (!opcion.equalsIgnoreCase("s"));

	}

}
