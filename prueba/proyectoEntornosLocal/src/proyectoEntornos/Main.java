package proyectoEntornos;

import java.util.Arrays;

public class Main {

	static String contar(Serie[] arraySeries, Videojuego[] arrayVideojuegos) {

		int contSeries = 0;
		int contVideojuegos = 0;

		for (int i = 0; i < arrayVideojuegos.length; i++) {
			if (arraySeries[i].isEntregado == true) {
				contSeries++;

			}
			if (arrayVideojuegos[i].isEntregado == true) {
				contVideojuegos++;
			}
		}

		return ("La cantidad de series entregadas son: " + contSeries + "\nLa cantidad de videojuegos entregados son: "
				+ contVideojuegos);
	}

	static void videojuegoMasHoras(Videojuego[] arrayVideojuegos) {
		int[] aHoras = new int[5];
		Videojuego v = new Videojuego();
		int cont = 0;
		int maxHoras=0;

		for (int i = 0; i < arrayVideojuegos.length; i++) {

			if (cont == 0) {
				maxHoras = arrayVideojuegos[i].getHorasEstimadas();
				cont++;
			} else {
				if (arrayVideojuegos[i].getHorasEstimadas > maxHoras) {
					maxHoras = arrayVideojuegos[i].getHorasEstimadas();
					v= arrayVideojuegos[i];
					cont++;
					
				}
			}
			v.toString();

		}

	}
	
	static void serieMasTemporadas(Serie[] arraySeries) {
		int[] temporadas = new int[5];
		Serie s = new Serie();
		int cont = 0;
		int maxTemporada=0;

		for (int i = 0; i < arraySeries.length; i++) {

			if (cont == 0) {
				maxTemporada = arraySeries[i].getNTemp();
				cont++;
			} else {
				if (arraySeries[i].getNTemp > maxTemporada) {
					maxTemporada = arraySeries[i].getNTemp();
					s= arraySeries[i];
					
				}
			}
			s.toString();

		}

	}
	


	public static void main(String[] args) {
		Series[] arraySeries = new Series[5];
		Videojuego[] arrayVideojuegos = new Videojuego[5];

		for (int i = 0; i < arraySeries.length; i++) {
			arraySeries[i] = new Serie();
			arrayVideojuegos[i] = new Videojuego();
		}

		arraySeries[0].entregar();
		arrayVideojuegos[0].entregar();

	}

}
