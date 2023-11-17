package Capitulo7.Ejmplos;

public class GraficoDeBarras_7_6 {
    public static void main(String[] args) {
        int[] arreglo = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.println("Distribución de calificaciones:");

        // para cada elemento del arreglo, imprime una barra del gráfico
        for (int i = 0; i < arreglo.length; i++) {
            // imprime etiqueta de la barra (“00-09: ”, ..., “90-99: ”, “100: ”)
            if (i == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            // imprime barra de asteriscos
            for (int estrellas = 0; estrellas < arreglo[i]; estrellas++)
                System.out.print("*");

            System.out.println();
        }
    }
}
