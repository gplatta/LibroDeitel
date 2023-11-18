package Capitulo7.Ejercicios;

public class Ejercicio_7_13 {
    public static void main(String[] args) {
        int[][] ventas = new int[3][5];

        for (int fila = 0; fila < ventas.length; fila++) {
            for (int col = 0; col < ventas[fila].length; col++) {
                ventas[fila][col] = 0;
                System.out.println("[" + fila + "][" + col + "] = " + ventas[fila][col]);
            }
        }
    }
}
