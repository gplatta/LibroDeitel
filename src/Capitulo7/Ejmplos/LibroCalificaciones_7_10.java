package Capitulo7.Ejmplos;

public class LibroCalificaciones_7_10 {
    private String nombreCurso;
    private int[] calificaciones;
    public static void main(String[] args) {
    }

    public LibroCalificaciones_7_10(String nombreCurso, int[] calificaciones) {
        this.nombreCurso = nombreCurso;
        this.calificaciones = calificaciones;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void procesarCalificaciones() {
        imprimirCalificaciones();

        System.out.printf("%nEl promedio de la clase es %.2f%n", obtenerPromedio());

        System.out.printf("La calificación más baja es %d%nLa calificación más alta es %d%n%n",
                obtenerMinima(), obtenerMaxima());

        imprimirGraficoBarras();
    }

    public int obtenerMinima() {
        int califBaja = calificaciones[0]; // asume que es la calificación más baja

        for (int calificacion: calificaciones) {
            if (calificacion < califBaja)
                califBaja = calificacion;
        }
        return califBaja;
    }

    public int obtenerMaxima() {
        int califAlta = calificaciones[0]; // asume que es la calificación más altaç

        for (int calificacion: calificaciones)
            if (calificacion > califAlta)
                califAlta = calificacion;
        return califAlta;
    }

    public double obtenerPromedio() {
        int total = 0;

        for (int calificacion: calificaciones)
            total += calificacion;
        return (double)total / calificaciones.length;
    }

    public void imprimirGraficoBarras() {
        System.out.println("Distribución de calificaciones:");

        // almacena la frecuencia de las calificaciones en cada rango de 10 calificaciones
        int[] frecuencia = new int[11];

        // para cada calificación, incrementa la frecuencia apropiada
        for (int calificacion: calificaciones)
            ++frecuencia[calificacion/10];

        // para cada frecuencia de calificación, imprime una barra en el gráfico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            // imprime etiqueta de barra ("00-09: ", ..., "90-99: ", "100: ")
            if (cuenta == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", cuenta * 10, cuenta * 10 + 9);

            // imprime la barra de asteriscos
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++)
                System.out.print("*");

            System.out.println();
        }
    }

    public void imprimirCalificaciones() {
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++)
            System.out.printf("Estudiante %2d: %3d%n", estudiante + 1, calificaciones[estudiante]);
    }
}
