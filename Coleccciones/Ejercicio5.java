
public class Ejercicio5 {

	public static void main(String[] args) {
		int opcion = 0; 
		String nombreProducto = " "; 
		double precio = 0;
		int stock = 0;

		HashMap<String, Double> productos = new HashMap<String, Double>();

		Scanner read = new Scanner(System.in);

		do {
			System.out.println("Seleccione alguna de las siguientes opciones");
			System.out.println(" 1. Alta de producto");
			System.out.println(" 2. Baja de producto");
			System.out.println(" 3. Listar existencias ");
			System.out.println(" 0. Salir");

			opcion = read.nextInt();

			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre del producto");
				nombreProducto = read.next();

				System.out.println("Introduzca el precio del producto");
				precio = read.nextDouble();

				productos.put(nombreProducto, precio);

				System.out.println("Producto añadido correctamente");

				break;

			case 2:
				System.out.println("Introduzca el nombre del producto a dar de baja");
				nombreProducto = read.next();
				
				
				if (productos.containsKey(nombreProducto)) {
					
					productos.remove(nombreProducto);
				}else {
					System.out.println("El producto no se encuentra");
				}
				break;

			case 3:
				System.out.println("Productos" + productos);
				break;

			case 0:
				System.out.println("Saliendo del programa...");
				break;

			}
		} while (opcion != 0);

		read.close();

	}

}

	}

}
