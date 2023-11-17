package Capitulo7.Ejmplos;

import java.security.SecureRandom;

public class TirarDado_7_7 {
    public static void main(String[] args) {
        SecureRandom numerosAleatorios = new SecureRandom();
        int[] frecuencia = new int[7]; // arreglo de contadores de frecuencias

        // tira el dado 6.000.000 veces; usa el valor del dado como índice de frecuencas
        for (int tiro = 1; tiro <= 6000000; tiro++)
            ++frecuencia[1 + numerosAleatorios.nextInt(6)];

        System.out.printf("%s%10s%n", "Cara", "Frecuencia"); // Encabezado

        // imprime el valor de cada elemento del arreglo
        for (int cara = 1; cara < frecuencia.length; cara++)
            System.out.printf("%4d%10d%n", cara, frecuencia[cara]);
    }
}
