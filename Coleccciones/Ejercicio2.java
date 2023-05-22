
public class Ejercicio2 {

	public static void main(String[] args) {
		LinkedHashSet<String> collection = new LinkedHashSet<String>();

		String palabra = ""; 
		
		Scanner read = new Scanner(System.in);

		
		System.out.println("Introduzca palabras. ");
		System.out.println("Los resultados serán mostrados al introducir la palabra fin");
		palabra = read.next();
		read.nextLine();

		
		while (!palabra.equals("fin")) {
			collection.add(palabra);
			palabra = read.next();
			read.nextLine();
		}

		
		System.out.println(collection);
	}

}