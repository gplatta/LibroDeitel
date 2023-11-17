package Capitulo7.Ejmplos;

public class AppPruebaLibroCalificaciones {
    public static void main(String[] args) {
        int[] arregloCalif = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };

        LibroCalificaciones_7_10 miLibroCalificaciones = new LibroCalificaciones_7_10(
                "CS101 Introduccion a la programacion en Java", arregloCalif);

        System.out.printf("Bienvenido al libro de calificaciones para%n%s%n%n",
                miLibroCalificaciones.getNombreCurso());

        miLibroCalificaciones.procesarCalificaciones();
    }
}
