package Capitulo7.Ejercicios;

public class Ejercicio_7_16 {
    public static void main(String[] args) {
        double sumatoria = 0;
        for (String elemento: args)
            sumatoria += Double.parseDouble(elemento);

        System.out.println("Sumatoria = " + sumatoria);
    }
}
