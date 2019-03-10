import java.util.*;

public class GestorContactos {
	
	private static Scanner scan = new Scanner(System.in);
	private static List<Contacto> contactos = new ArrayList<>();

	public static void main(String[] args) {

		int opcion;
		do {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			System.out.println("+-------- Gestor de contactos --------+");
			System.out.println("|                                     |");
			System.out.println("| Seleccione una opción:              |");
			System.out.println("| 1) Crear contacto                   |");
			System.out.println("| 2) Eliminar contacto                |");
			System.out.println("| 3) Mostrar todos los contactos      |");
			System.out.println("| 4) Filtrar por nombre               |");
			System.out.println("| 0) Salir                            |");
			System.out.println("|                                     |");
			System.out.println("+-------------------------------------+");
			opcion = scan.nextInt();
			switch (opcion) {
				case 1:
					crearContacto();
					break;
				case 2:
					eliminarContacto();
					break;
				case 3:
					//mostrarTodos();
					break;
				case 4:
					//mostrarFiltrados();
					break;
				case 0:
					System.out.println("\n\nBye ;)");
					return;
				default:
					System.err.println("Opción inválida\n\n\n");
			}
		} while(opcion != 0);
	}

	private static void crearContacto() {

		

		String nombre, apellido,fechaNacimiento, telefono;
		int opcion=0;
		while(opcion!=2){
		Contacto contact = new Contacto();
		System.out.println("Ingrese nombre: ");
		nombre = scan.next();
		contact.setNombre(nombre);

		System.out.println("Ingrese apellido: ");
		apellido = scan.next();
		contact.setApellido(apellido);

		System.out.println("Ingrese fecha de nacimiento: ");
		fechaNacimiento = scan.next();
		scan.next();
		
		contact.setFechaNacimiento(fechaNacimiento);

		System.out.println("Ingrese numero de telefono: ");
		telefono = scan.next();
		contact.setTelefono(telefono);
		
		contactos.add(contact);

		System.out.println("Ingresar nuevo contacto? (1 = si, 2 = no");
		opcion = scan.nextInt();
		}

	}

	private static void eliminarContacto() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\u00BFQu\u00E9 n\u00FAmero quisiera eliminar?");
		String numeroEliminar = scanner.next();
        Contacto b = new Contacto();
        b.setTelefono(numeroEliminar);
        if(contactos.contains(b)) {
            contactos.remove(b);
        } else {
			System.out.println("N\u00FAmero no encontrado: " + numeroEliminar);
		}
	}

	private static void mostrarTodos() {}

	private static void mostrarFiltrados() {}

}