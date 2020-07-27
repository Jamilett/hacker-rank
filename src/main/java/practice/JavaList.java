package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jamsr
 */
public class JavaList {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Number of elements: ");
        int n = scan.nextInt();
        List L = new ArrayList();

        System.out.print("Describe the List: ");
        for (int i = 0; i < n; i++) {
            int values = scan.nextInt();
            L.add(values);
        }
        System.out.println("Actual List-> " + L);

        System.out.println("Number of queries:");
        int queries = scan.nextInt();

        for (int i = 0; i < queries; i++) {
            System.out.println("Insert or Delete:");
            String action = scan.next();
            if (action.equals("Insert")) {
                System.out.println("Insert values: x");
                int x = scan.nextInt();
                System.out.println("Insert values: y");
                int y = scan.nextInt();
                L.add(x, y);
            }
            if (action.equals("Delete")) {
                System.out.println("Insert value: x");
                int x = scan.nextInt();
                L.remove(x);
            }
        }
        // for(Object i : L)
        L.forEach((i) -> {
            System.out.print(i + " ");
        });

    }

}
