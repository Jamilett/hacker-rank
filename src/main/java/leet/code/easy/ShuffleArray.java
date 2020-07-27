package leet.code.easy;

import java.util.Arrays;

/**
 * Ordenar el arreglo x1, y1, x2, y2, x3, y3, ..., xn, yn
 *
 * @author jamsr
 */
public class ShuffleArray {

    public int[] shuffle(int[] nums, int n) {

        int resultado[] = new int[n * 2];

        int x = 0;
        int y = n;

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = nums[x];
            x++;
            resultado[i + 1] = nums[y];
            y++;
            i++;
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(resultado));

        return resultado;

    }

    public static void main(String[] args) {

        ShuffleArray obj = new ShuffleArray();
        int nums[] = {1,1,2,2};
        obj.shuffle(nums, 2);

    }

}
