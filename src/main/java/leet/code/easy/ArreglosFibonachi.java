package leet.code.easy;

import java.util.Arrays;

/**
 *
 * @author jamsr
 */
public class ArreglosFibonachi {

    public static void main(String[] args) {
        runningSum();
    }

    public static int[] runningSum() {
        int[] nums = new int[5];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

//        int temporal;
        int anterior = 0;
        int suma;
// FIBONACCI
//        for (int i = 0; i < nums.length; i++) {
//            int index = nums[i];
//            temporal = index;
//            suma = index + anterior;
//            anterior = temporal;
//            System.out.println(suma);
//        }
        int resultados[] = new int[nums.length];

        if (nums.length >= 1 && nums.length <= 1000) {

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] >= -10000000 && nums[i] <= 10000000) {
                    int index = nums[i];
                    suma = index + anterior;
                    anterior = suma;
                    resultados[i] = anterior;
                }
            }
            System.out.println(Arrays.toString(resultados));
        }
        return resultados;
    }
}
