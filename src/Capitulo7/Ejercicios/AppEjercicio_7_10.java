package Capitulo7.Ejercicios;

public class AppEjercicio_7_10 {
    public static void main(String[] args) {
        int[] arregloVentas = { 3000, 5500, 5100, 4300, 6010, 7800, 5100, 5000, 8300, 7020, 1050, 10500, 1500, 1350 };

        Ejercicio_7_10 comisionPorVentas = new Ejercicio_7_10(arregloVentas);
        comisionPorVentas.imprimirVentasPorVendedor();
        System.out.println();
        comisionPorVentas.procesarComisionesPorVentas();
    }
}
