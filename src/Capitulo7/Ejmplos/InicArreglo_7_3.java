package Capitulo7.Ejmplos;

public class InicArreglo_7_3 {
    public static void main(String[] args) {
        int[] arreglo =  {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        System.out.printf("%s%8s%n", "Indice", "Valor"); // Encabezados de columnas

        for (int i = 0; i < arreglo.length; i++)
            System.out.printf("%5d%8d%n", i, arreglo[i]);
    }
}
