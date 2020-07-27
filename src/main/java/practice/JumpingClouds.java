package practice;

import java.util.Arrays;
//import java.util.Scanner;

/**
 * El objetivo es imprimire el numero MINIMO de saltos para llegar al objetivo
 * evitando los 1s y solo brincar a los 0s, brincando de 2 en 2 o de 1 en 1
 *
 * @author jamsr
 */
public class JumpingClouds {

    static int jumpingOnClouds(int[] c) {

        int jumps = -1;
        if (c.length >= 2 && c.length <= 100) {

            // Loop que compara de 2 en 2 para brincar de 2 en 2 o de 1 en 1
            // Si el tercer espacio desde tu posición es 1 brinca de 1 en 1 
            for (int i = 0; i < c.length; i++, jumps++) {
                // Si el tercer espacio desde tu posición es = 0 brincamos de 2 en 2
                if (i < c.length - 2 && c[i + 2] == 0) {
                    i++; // i se encargará de movernos de 2 en 2 o de 1 en 1
                }
//                if (c[i - 1] < c[i]) {
//
            }

            System.out.println(jumps);
            System.out.println(Arrays.toString(c));
        }
        return jumps;
    }

    public static void main(String[] args) {
        JumpingClouds obj = new JumpingClouds();

        int c[] = {0, 0, 1, 0, 0, 1, 0};
        jumpingOnClouds(c);
    }
}
