package Capitulo7.Ejercicios;

import java.util.Scanner;

/**
 * 7.19 (Sistema de reservaciones de una aerolínea) Una pequeña aerolínea acaba de comprar una computadora
 * para su nuevo sistema de reservaciones automatizado. Se le ha pedido a usted que desarrolle el nuevo sistema. Usted
 * escribirá una aplicación para asignar asientos en cada vuelo del único avión de la aerolínea (capacidad: 10 asientos).
 * Su aplicación debe mostrar las siguientes alternativas: Por favor escriba 1 para Primera Clase y Por favor
 * escriba 2 para Economico. Si el usuario escribe 1, su aplicación debe asignarle un asiento en la sección de primera
 * clase (asientos 1 a 5). Si el usuario escribe 2, su aplicación debe asignarle un asiento en la sección económica (asientos
 * 6 a 10). Su aplicación deberá entonces imprimir un pase de abordar, indicando el número de asiento de la persona y
 * si se encuentra en la sección de primera clase o clase económica.
 * Use un arreglo unidimensional del tipo primitivo boolean para representar la tabla de asientos del avión.
 * Inicialice todos los elementos del arreglo con false para indicar que todos los asientos están vacíos. A medida que se
 * asigne cada asiento, establezca el elemento correspondiente del arreglo en true para indicar que ese asiento ya no está
 * disponible.
 * Su aplicación nunca deberá asignar un asiento que ya haya sido asignado. Cuando esté llena la sección económica,
 * su programa deberá preguntar a la persona si acepta ser colocada en la sección de primera clase (y viceversa). Si
 * la persona acepta, haga la asignación de asiento apropiada. Si no, imprima el mensaje “El proximo vuelo sale en 3
 * horas”.
 */
public class Ejercicio_7_19 {
    public static void main(String[] args) {
        boolean[] asientos = { false, false, false, false, false, false, false, false, false, false};
        int cantReservas = 0;
        int nroAsiento;
        Scanner sc = new Scanner(System.in);

        while (cantReservas < asientos.length) {
            char entrada = 's';
            System.out.println();
            System.out.printf("Reserva nro: %d\n", cantReservas + 1);
            System.out.print("Por favor escriba 1 para Primera Clase y 2 para Economico: ");
            int clase = sc.nextInt();

            nroAsiento = asientoLibre(asientos, clase);

            if (nroAsiento == -1)
                switch (clase) {
                    case 1:
                        System.out.println("Sección de Primera llena, ¿Desea reservar en Económica? s/n");

                        // si -> asignaAsiento(asientos, nroAsiento) e incrementa cantReservas
                        // no -> mensaje el próximo vuelo parte en 3 horas, no increnenta cantReservas

                        entrada = sc.next().charAt(0);
                        if (entrada == 's') {
                            clase = 2;
                            nroAsiento = asientoLibre(asientos, clase);
                        }
                        else
                            System.out.println("El próximo vuelo parte en 3 horas");
                        break;
                    case 2:
                        System.out.println("Sección Económica llena, ¿Desea reservar en Primera? s/n");

                        // si -> asignarAsiento(asientos, nroAsiento) e incrementa cantReservas
                        // no -> mensaje el próximo vuelo parte en 3 horas, no incrementa cantReservas
                        entrada = sc.next().charAt(0);
                        if (entrada == 's') {
                            clase = 1;
                            nroAsiento = asientoLibre(asientos, clase);
                        }
                        else
                            System.out.println("El próximo vuelo parte en 3 horas");
                        break;
                }
            if (entrada == 's') {
                asignaAsiento(asientos, nroAsiento);
                imprimePase(nroAsiento + 1, clase);
                cantReservas++;
            }

            imprimieArreglo(asientos);
            System.out.println();
        }
    }

    public static int asientoLibre(boolean[] asientos, int clase) {
        int nro = 0;
        switch (clase) {
            case 1:
                for (int i = 0; i < 5; i++)
                    if (!asientos[i]) {
                        nro = i;
                        break;
                    }
                    else
                        nro = -1;
                break;
            case 2:
                for (int i = 5; i < 10; i++)
                    if (!asientos[i]) {
                        nro = i;
                        break;
                    }
                    else
                        nro = -1;
                break;
        }
        return nro;
    }
    public static void asignaAsiento(boolean[] asientos, int nroAsiento) {
        asientos[nroAsiento] = true;
    }

    public static void imprimePase(int nroAsiento, int clase) {
        System.out.println("-Su pase de abordar-");
        System.out.println("Nro Asiento: " + nroAsiento);
        if (clase == 1)
            System.out.println("Clase: Primera");
        else
            System.out.println("Clase: Económica");
        System.out.println("---------------------");
    }

    public static void imprimieArreglo(boolean[] arreglo) {
        System.out.print("[ ");
        for (int i = 0; i < arreglo.length; i++) {
            if (i < arreglo.length - 1)
                System.out.print(arreglo[i] + ", ");
            else
                System.out.print(arreglo[i] + " ]");
        }
    }
}
