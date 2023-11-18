package Capitulo7.Ejercicios;

public class Ejercicio_7_14 {

    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;

        System.out.println("Producto = " + producto(n1, n2));
        System.out.println("Producto = " + producto(n1, n2, n3));
        System.out.println("Producto = " + producto(n1, n2, n3, n4));
        System.out.println("Producto = " + producto(n1, n2, n3, n4, n5));
    }

    public static int producto(int... numeros) {
        int total = 1;
        for (int numero: numeros)
            total *= numero;
        return total;
    }
}
