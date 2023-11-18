package Capitulo7.Ejercicios;

import java.util.Random;

public class Ejercicio_7_17 {
    public static void main(String[] args) {
        Random miAleatorio1 = new Random();
        Random miAleatorio2 = new Random();
        int[] frecuencia = new int[11];

        for (int i = 0; i < 36000000; i++) {
            int sumaDados = miAleatorio1.nextInt(6) + 1 + miAleatorio2.nextInt(6) + 1;
            ++frecuencia[sumaDados - 2];
        }

        imprimirArreglo(frecuencia);
    }

    public static void imprimirArreglo(int[] arreglo) {
        System.out.print("[ ");
        for (int i = 0; i < arreglo.length; i++) {
            if (i < arreglo.length - 1)
                System.out.print(arreglo[i] + ", ");
            else
                System.out.print(arreglo[i] + " ]");
        }
    }
}
