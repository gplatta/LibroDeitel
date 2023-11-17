package Capitulo7.Ejmplos;

public class SumaArreglo_7_5 {
    public static void main(String[] args) {
        int[] arreglo = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        // suma el valor de cada elemento al total
        for (int i = 0; i < arreglo.length; i++)
            total += arreglo[i];
        System.out.printf("Total de los elementos del arreglo: %d%n", total);
    }
}
