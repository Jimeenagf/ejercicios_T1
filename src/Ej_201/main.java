package Ej_201;

public class main {

	public static void main(String[] args) {
		// El tipo más pequeño que admite cada valor: 365 no cabe en un byte
		// (rango -128..127), los demás sí
		short diasPorAnio = 365;
		byte horasPorDia = 24;
		byte minutosPorHora = 60;
		byte segundosPorMinuto = 60;

		// Calcular segundos totales (necesita long por la magnitud)
		long segundosPorAnio = (long) diasPorAnio * horasPorDia
				* minutosPorHora * segundosPorMinuto;

		System.out.println("Un año tiene: " + segundosPorAnio + " segundos");
	}
}

