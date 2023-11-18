package Capitulo7.Ejercicios;

public class Ejercicio_7_15 {
    public static void main(String[] args) {
        int longitudArreglo = 0;

        if (args.length == 0)
            longitudArreglo = 10;
        else
            longitudArreglo = Integer.parseInt(args[0]);

        int[] arreglo = new int[longitudArreglo];

        for (int i = 0; i < arreglo.length; i++)
            arreglo[i] = 0;

        imprimirArreglo(arreglo);
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
