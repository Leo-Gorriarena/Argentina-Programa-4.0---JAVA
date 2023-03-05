package clase_1_algoritmos;

public class Ejercicios_guia_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Utilizando la sentencia while, imprima todos los números entre 2 variables “a” y “b”*/
		System.out.println("Ejercicio 1.a\n");
		
		int numeroInicio = 1;
		int numeroFin = 10;
		
		while (numeroInicio <= numeroFin) {
			System.out.println(numeroInicio);
			numeroInicio++;
		}
		
		/*A lo anterior, solo muestre los números pares*/
		System.out.println("\nEjercicio 1.b\n");
		
		int numInicial= 5;
		int numFinal= 14;
		
		while (numInicial <= numFinal) {
			if (numInicial % 2 == 0) {
				System.out.println(numInicial);
			}
			numInicial++;
		}
		
		/*A lo anterior, con una variable extra, elija si se deben mostrar los números pares o impares*/
		System.out.println("\nEjercicio 1.c (pares o impares)\n");
		
		int a= 8;
		int b= 16;
		boolean esPar = false;
		
		while (a <= b) {
			
			if (a % 2 == 0 && esPar) {
				System.out.println(a);
			}
			
			if (a % 2 != 0 && !esPar) {
				System.out.println(a);
			}
			
			a++;
		}
		
		/*Utilizando la sentencia for, hacer lo mismo que en (b) pero invirtiendo el orden*/
		System.out.println("\nEjercicio 1.d (bucle for)\n");
		
		int numMenor= 5;
		int numMayor= 14;
		
		for (int i = numMayor; i>=numMenor; i--) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		/*Determinar si un hogar pertenece al segmento de ingresos altos*/
		System.out.println("\nEjercicio 2.d (Segmentación)");
		
		float ingresosMensualesTotales = 359300;
		int cantidadVehiculos = 2;
		int cantidadInmuebles = 3;
		boolean capacidadEconomicaPlena = false;
		
		if (ingresosMensualesTotales >= 489083 ||
			cantidadVehiculos >= 3 ||
			cantidadInmuebles >= 3 ||
			capacidadEconomicaPlena == true) {
			
			System.out.println("\nIngresos mensuales totales: $ " + ingresosMensualesTotales + "\nCantidad de vehículos: " + cantidadVehiculos + "\nCantidad Inmuebles: " + cantidadInmuebles + "\nEmbarcación, aeronave o títulos societarios: " + capacidadEconomicaPlena + "\n\nEl hogar pertenece al segmento de ingresos altos.");
				
		} else {
			
			System.out.println("\nEl hogar NO pertenece al segmento de ingresos altos.");
		}
		
		
		
	}

}
