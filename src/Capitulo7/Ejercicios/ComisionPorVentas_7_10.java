package Capitulo7.Ejercicios;

public class ComisionPorVentas_7_10 {
    private int[] ventas;

    public ComisionPorVentas_7_10(int[] ventas) {
        this.ventas = ventas;
    }

    public int[] getVentas() {
        return ventas;
    }

    public void setVentas(int[] ventas) {
        this.ventas = ventas;
    }

    public void procesarComisionesPorVentas() {
        int[] contadores = new int[9];

        // por cada comisión incrementa la frecuencia apropiada
        for (int venta: ventas)
            if (calcularComisionSemanal(venta) < 1000)
                ++contadores[calcularComisionSemanal(venta)/100 - 2];
            else
                ++contadores[8];

        System.out.println("Cantidad de vendedores por rango de salario: ");

        System.out.printf("%s | %10s%n", "Salario(rango)", "Cant. Vendedores");  // imprimo el encabezado

        // compienzo en 2 para multiplicar * 100, así la cota inferior comienza en 200
        for (int cuenta = 2; cuenta < contadores.length + 2; cuenta++) {
            // imprime etiqueta de barra ("200-299: ", ... "900-999: ", "1000+: ")
            if (cuenta == 10)
                System.out.printf("   %4d+                ", 1000);
            else
                System.out.printf("   %02d-%d              ", cuenta * 100, cuenta * 100 + 99);

            System.out.print(contadores[cuenta-2]);

            /*
            // imprime la barra de asteriscos
            for (int estrellas = 0; estrellas < frecuencia[cuenta-2]; estrellas++)
                System.out.print("*");

             */

            System.out.println();
        }
    }

    public int calcularComisionSemanal(int montoVentas) {
        return (int)(200 + montoVentas * 0.09);
    }

    public void imprimirVentasPorVendedor() {
        System.out.println("Ventas totales por Vendedor:");
        for (int vendedor = 0; vendedor < ventas.length; vendedor++)
            System.out.printf("Vendedor %2d: $%3d%n", vendedor + 1, ventas[vendedor]);
    }

}
