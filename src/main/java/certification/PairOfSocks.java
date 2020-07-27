package certification;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jamsr
 */
public class PairOfSocks {

    static int sockMerchant() {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int ar[] = new int[n];
        int contador = 0;

        if (n >= 1 && n <= 100) {
            for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(scanner.nextLine());
            }
        }
        
        Arrays.sort(ar);
        System.out.println("Arreglo 'ORDENADO'" + Arrays.toString(ar));
        
        for (int j = 1; j < n; j++) {
            if (ar[j - 1] == ar[j]) {
                contador++;
                j++;
            }
        }

        System.out.println(Arrays.toString(ar));
        System.out.println(contador);
        return contador;

    }

    public static void main(String[] args) {

        sockMerchant();

//        Scanner scanner = new Scanner(System.in);
//
//        int n = Integer.parseInt(scanner.nextLine());
//        int ar[] = new int[n];
//        int contador = 0;
//
//        if (n >= 1 && n <= 100) {
//            for (int i = 0; i < n; i++) {
//                ar[i] = Integer.parseInt(scanner.nextLine());
//            }
//        }
//        Arrays.sort(ar);
//
//        for (int j = 1; j < n; j++) {
//            if (ar[j - 1] == ar[j]) {
//                contador++;
//            }
//        }
//
//        System.out.println(contador);
    }

}
