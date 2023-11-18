package Capitulo7.Ejercicios;

import java.util.Random;
public class Ejercicio_7_18_Gabriel {
    /*7.18 (Juego de Craps) Escriba una aplicación que ejecute 1,000,000 de juegos de Craps
(figura 6.8) y responda a las siguientes preguntas:
a) ¿Cuántos juegos se ganan en el primer tiro, en el segundo, …, en el vigésimo y después de éste?
b) ¿Cuántos juegos se pierden en el primer tiro, en el segundo, …, en el vigésimo y después de éste?
c) ¿Cuáles son las probabilidades de ganar en Craps? [Nota: debe descubrir que Craps es uno de los juegos
de casino más justos. ¿Qué cree usted que significa esto?].
d) ¿Cuál es la duración promedio de un juego de Craps?
e) ¿Las probabilidades de ganar mejoran con la duración del juego?

REGLAS:
Un jugador tira dos dados. Cada uno tiene seis caras, las cuales contienen uno, dos, tres cuatro, cinco
y seis puntos negros, respectivamente. Una vez que los dados dejan de moverse, se calcula la suma de
los puntos negros en las dos caras superiores. Si la suma es 7 u 11 en el primer tiro, el jugador gana. Si
la suma es 2, 3 o 12 en el primer tiro (llamado “Craps”), el jugador pierde (es decir, la “casa” gana).
Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte en el “punto” del jugador.
Para ganar, el jugador debe seguir tirando los dados hasta que salga otra vez “su punto” (es decir, que
tire ese mismo valor de punto). El jugador pierde si tira un 7 antes de llegar a su punto.
*/

        public static void main(String[] args) {
            final int NRO_JUEGOS = 100000;
            int[] arregloGanadores = new int[20];
            int[] arregloPerdedores = new int[20];

            for (int i = 0; i < NRO_JUEGOS; i++)
                jugegaCraps(arregloGanadores, arregloPerdedores);

            // a)
            System.out.println("Ganadores:");
            imprimirArreglo(arregloGanadores);

            System.out.println();

            // b)
            System.out.println("Perdedores");
            imprimirArreglo(arregloPerdedores);

            System.out.println("\n");

            // c)
            double sumaTotal = sumaTotalJuegosGanados(arregloGanadores);
            System.out.println("La probabilidad de ganar Craps es: " +  sumaTotal / NRO_JUEGOS);

            // Craps es un juego con alta probabilidad de ganar ya que existe casi la misma
            // probabilidad de ganar que de perder (50-50)

            // d)
            System.out.println("El promedio de tiros por juegos es: " + promedioTirosPorJuego(arregloGanadores, arregloPerdedores, NRO_JUEGOS));

            // e) La probabilidad de ganar disminuye cuando el juego se extiende,
            //    se puede observar en el arreglo de ganadores que va decrementando
            //    en cuanto aumenta la cantidad de tiros del dado
        }

        public static int tiraDados(){
            Random miAleatorio = new Random();
            return (miAleatorio.nextInt(6)+1 + miAleatorio.nextInt(6)+1);
        }

        public static int jugegaCraps(int[] ganadores, int[] perdedores) {
            int nroTiros = 0;
            int sumaDados = tiraDados();
            int miPuntoParaGanar = 0;
            boolean gana = false;
            boolean sigueJugando = false;
            switch (sumaDados){
                case 2:
                case 3:
                case 12:
                    gana = false;
                    ++perdedores[nroTiros];
                    break;
                case 7:
                case 11:
                    gana = true;
                    ++ganadores[nroTiros];
                    break;
                default:
                    sigueJugando = true;
                    System.out.println("Debes sacar " + sumaDados + " para ganar, si sale un 7 antes perderás!");
                    miPuntoParaGanar = sumaDados;
                    break;
            }

            nroTiros++;

            while (sigueJugando){
                sumaDados = tiraDados();
                if (sumaDados == 7){
                    gana = false;
                    sigueJugando = false;
                    ++perdedores[nroTiros];
                }else{
                    if (sumaDados == miPuntoParaGanar){
                        gana = true;
                        sigueJugando = false;
                        ++ganadores[nroTiros];
                    }
                }
                if (nroTiros < 19)
                    nroTiros++;
            }
            if (gana)
                System.out.println("Ganador");
            else
                System.out.println("Perdiste");

            return nroTiros;
        }

        public static int sumaTotalJuegosGanados(int[] arreglo) {
            int total = 0;
            for (int elemento: arreglo)
                total += elemento;
            return total;
        }

        public static double promedioTirosPorJuego(int[] ganadores, int[] perdedores, int nroJuegos) {
            int totalTiros = 0;
            for (int i = 0; i < ganadores.length; i++) {
                totalTiros += (i + 1) * (ganadores[i] + perdedores[i]);
            }

            return (double)(totalTiros / nroJuegos);
        }

        public static void imprimirArreglo(int[] arreglo) {
            System.out.print("[ ");
            for (int i = 0; i < arreglo.length; i++) {
             if (i < arreglo.length - 1)
                 System.out.print(arreglo[i] + ", ");
                else
                    System.out.print(arreglo[i] + " ]");
            }
        }
}
