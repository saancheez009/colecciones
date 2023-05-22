
public class Ejercicio1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> coleccion = new LinkedHashSet<Integer>() ;
		
		int numero=0; 
	
		while( coleccion.size() <20) {
			//Generamos el número aleatorio
			numero = (int)(Math.random()*101);
			//añadimos el numero a la coleccion
			coleccion.add(numero);
		}

		
		
		System.out.println(coleccion);
	}

}

	}

}
