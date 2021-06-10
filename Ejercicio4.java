import java.util.*;

public class Ejercicio4 {

	public static final  int TAMANIO = 20;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		int matriz[];
		int numeromayor;
		int numeromenor;
		matriz = new int[TAMANIO];

		for (int i = 0; i < matriz.length ; i++) {
			System.out.println("Ingrese la edad de la persona No. "+ (i+1));
			matriz[i] = scanner.nextInt();
		}

		numeromayor = matriz[0];
		for (int i = 0; i < matriz.length ; i++) {
			if (numeromayor<matriz[i]) {
				numeromayor = matriz[i];
			}
		}
		
		numeromenor = matriz[0];
		for (int i = 0; i < matriz.length ; i++) {
			if (numeromenor>matriz[i]) {
				numeromenor = matriz[i];
			}
		}
		System.out.println("La edad mayor que se ingreso es: "+numeromayor);
		System.out.println("La edad menor que se ingreso es: "+numeromenor);
	}


}

