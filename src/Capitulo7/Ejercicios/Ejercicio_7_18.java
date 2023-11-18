package Capitulo7.Ejercicios;

import java.security.SecureRandom;
import java.util.Random;

public class Ejercicio_7_18 {
    public static void main(String[] args) {
        /**
         * Un jugador tira dos dados. Cada uno tiene seis caras, las cuales contienen uno, dos, tres cuatro, cinco
         * y seis puntos negros, respectivamente. Una vez que los dados dejan de moverse, se calcula la suma de
         * los puntos negros en las dos caras superiores. Si la suma es 7 u 11 en el primer tiro, el jugador gana. Si
         * la suma es 2, 3 o 12 en el primer tiro (llamado “Craps”), el jugador pierde (es decir, la “casa” gana).
         * Si la suma es 4, 5, 6, 8, 9 o 10 en el primer tiro, esta suma se convierte en el “punto” del jugador.
         * Para ganar, el jugador debe seguir tirando los dados hasta que salga otra vez “su punto” (es decir, que
         * tire ese mismo valor de punto). El jugador pierde si tira un 7 antes de llegar a su punto.
         */
        int[] juegosGanadores = new int[20];
        int[] juegosPerdedores = new int[20];

        for (int i = 0; i < 1000000; i++)
            juegoCraps(juegosGanadores, juegosPerdedores);
    }

    public static void juegoCraps(int[] ganadores, int[] perdedores) {
        Random caraSupDado1 = new SecureRandom();
        Random caraSupDado2 = new SecureRandom();
    }
}
