package Capitulo7.Ejmplos;

public class InicArreglo_7_2 {
    public static void main(String[] args) {
        int[] arreglo = new int[10];

        System.out.printf("%s%8s%n", "Indice", "Valor"); // Encabezados de columnas

        for (int i = 0; i < arreglo.length; i++)
            System.out.printf("%5d%8d%n", i, arreglo[i]);
    }
}
