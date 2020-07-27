package leet.code.easy;

//import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jamsr
 */
public class KidsCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int totalCandies;
        int finalCandies[] = new int[candies.length];

        for (int kid = 0; kid < candies.length; kid++) {
            totalCandies = candies[kid] + extraCandies;
            finalCandies[kid] = totalCandies;
        }
        System.out.println(Arrays.toString(candies));
        System.out.println(Arrays.toString(finalCandies));

        int mayor = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > mayor) {
                mayor = candies[i];
            }
        }
        System.out.println(mayor);

        Boolean banderas[] = new Boolean[finalCandies.length];

        for (int kid = 0; kid < finalCandies.length; kid++) {
            if (finalCandies[kid] >= mayor) {
                banderas[kid] = true;
            } else {
                banderas[kid] = false;
            }
        }
        System.out.println(Arrays.toString(banderas));
        return Arrays.asList(banderas);
    }

    public static void main(String[] args) {
        KidsCandies obj = new KidsCandies();

        int kids[] = {4, 1, 4, 8, 9, 6, 4};

        obj.kidsWithCandies(kids, 1);

    }
}
