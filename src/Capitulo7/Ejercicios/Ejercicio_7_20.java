package Capitulo7.Ejercicios;

/**
 * 7.20 (Ventas totales)Use un arreglo bidimensional para resolver el siguiente problema: una compañía tiene cuatro
 * vendedores (1 a 4) que venden cinco productos distintos (1 a 5). Una vez al día, cada vendedor pasa una nota por cada
 * tipo de producto vendido. Cada nota contiene lo siguiente:
 * a) El número del vendedor
 * b) El número del producto
 * c) El valor total en dólares de ese producto vendido en ese día
 * Así, cada vendedor pasa entre 0 y 5 notas de venta por día. Suponga que está disponible la información sobre
 * todas las notas del mes pasado. Escriba una aplicación que lea toda esta información para las ventas del último mes y
 * que resuma las ventas totales por vendedor, y por producto. Todos los totales deben guardarse en el arreglo bidimensional
 * ventas. Después de procesar toda la información del mes pasado, muestre los resultados en formato tabular, en
 * donde cada columna represente a un vendedor específico y cada fila simbolice un producto. Saque el total de cada fila
 * para obtener las ventas totales de cada producto durante el último mes. Calcule el total de cada columna para sacar las
 * ventas totales de cada vendedor durante el último mes. Su impresión tabular debe incluir estos totales cruzados a la
 * derecha de las filas totalizadas, y en la parte inferior de las columnas totalizadas.
 */
public class Ejercicio_7_20 {
    public static void main(String[] args) {
        // Representa las ventas totales mensuales de cada producto por vendedor (filas: productos; columnas: vendedores)
        int[][] ventas = {{500, 381, 620, 130},
                          {120, 440, 115, 710},
                          {351, 118, 368, 901},
                          {110, 268, 400, 300},
                          {563, 210, 650, 105}};

    }
}