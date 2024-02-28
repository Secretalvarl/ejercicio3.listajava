package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.mesDtos;

class inicioiAplicacion {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		List<mesDtos> listaMeses = new ArrayList<>();

		for (int i = 1; i <= 12; i++) {
			System.out.print("Introduce el nombre del mes para el número " + i + ": ");
			String nombreMes = scanner.nextLine();

			if (i >= 1 && i <= 12) {
				listaMeses.add(new mesDtos(i, nombreMes));
			} else {
				System.out.println("Número de mes fuera del rango. Introduce un número entre 1 y 12.");
				i--;
			}
		}

		while (true) {
			System.out.print("Introduce un número de mes (0 para salir): ");
			int numeroSeleccionado = scanner.nextInt();

			if (numeroSeleccionado == 0) {
				System.out.println("Saliendo del programa.");
				break;
				
			} else if (numeroSeleccionado >= 1 && numeroSeleccionado <= 12) {
				
				for (mesDtos mes : listaMeses) {
					if (mes.getNumeroMes() == numeroSeleccionado) {
						System.out.println("El nombre del mes es: " + mes.getNombreMes());
						break;
					}
				}
			} else {
				System.out.println("Número de mes fuera del rango. Introduce un número entre 1 y 12.");
			}
		}

	}

}
