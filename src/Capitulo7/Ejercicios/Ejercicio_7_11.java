package Capitulo7.Ejercicios;

public class Ejercicio_7_11 {
    public static void main(String[] args) {
        // a) Asignar cero a los 10 elementos del arreglo cuentas de tipo entero
        int[] cuentas = { 24, 34, 1, 4, 546, 78, 23, 62, 12, 642};
        for (int i = 0; i < cuentas.length; i++)
            cuentas[i] = 0;
        imprimirArreglo(cuentas);

        // b)

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
