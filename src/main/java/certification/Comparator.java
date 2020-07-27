package certification;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jamsr
 */
public class Comparator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        // ENTEROS
//        int a = Integer.parseInt(scanner.nextLine());
//        int b = Integer.parseInt(scanner.nextLine());
//
//        if (a >= 0 && b <= 10000000) {
//            if (a == b) {
//                System.out.println("Same");
//            } else {
//                System.out.println("Different");
//            }
//        } else {
//            System.out.println("Error");
//        }
//
//        // STRING
//        String a2 = scanner.nextLine();
//        String b2 = scanner.nextLine();
//
//        if (1 <= a && b <= 2000) {
//            if (a2.equals(b2)) {
//                System.out.println("Same");
//            } else {
//                System.out.println("Different");
//            }
//        } else {
//            System.out.println("Error");
//        }
        // ARREGLO
        int arrayA[];
        int arrayB[];
        System.out.println("Ingresa tamaño de arreglo a: ");
        int lengthA = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa tamaño de arreglo b: ");
        int lengthB = Integer.parseInt(scanner.nextLine());

        arrayA = new int[lengthA];
        arrayB = new int[lengthB];

        // Logica para obtener valores y validaciones iniciales
        if (arrayA.length >= 0 && arrayB.length <= 10) {
            if (arrayA.length == arrayB.length) {
                int i;
                int j;
                for (i = 0; i < lengthA; i++) {
                    System.out.println("Ingresa el valor [" + i + "] del arrayA : ");
                    arrayA[i] = Integer.parseInt(scanner.nextLine());
                    System.out.println("arrayA[" + i + "]" + " = " + arrayA[i]);
                }
                for (j = 0; j < lengthB; j++) {
                    System.out.println("Ingresa el valor [" + j + "] del arrayB : ");
                    arrayB[j] = Integer.parseInt(scanner.nextLine());
                    System.out.println("arrayB[" + j + "]" + " = " + arrayB[j]);
                }

            } else {
                System.out.println("Different");
            }

        } else {
            System.out.println("Error");
        }

        System.out.println("Arreglo A: " + Arrays.toString(arrayA));
        System.out.println("Arreglo B: " + Arrays.toString(arrayB));

        boolean arraySame[] = new boolean[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] == arrayB[i]) {
                arraySame[i] = true;
            } else {
                arraySame[i] = false;
            }
        }

        System.out.println("Arreglo de booleanos: " + Arrays.toString(arraySame));

        String different = "";
        for (int i = 0; i < arraySame.length; i++) {
            if (arraySame[i] == false) {
                different = "Different";
                System.out.println(different);
                break;
            }
        }

        if (different.isEmpty()) {
            System.out.println("Samme");
        }
    }
}
