package practice;

/**
 * HackerR LoopsII
 * @author jamsr
 */
public class Potencias {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        int n = 5;
        int result = a;
        System.out.println("Formula: (a + 2° * b + 2°1 *b + 2°3 * b + 2°n-1...)");
        for (int i = 0; i < n; i++) {
          // Hace la operación de elevación, multiplica por b, le suma resultado y se lo asigna a sí mismo
            result = result + (int) Math.pow(2, i) * b;
          // 5 = 5 + (1*3)    -> potencia(n)0 = 8
          // 8 = 8 + (2*3)    -> potencia(n)1 = 14
          // 14 = 14 + (4*3)  -> potencia(n)2 = 26
          // 26 = 26 + (8*3)  -> potencia(n)3 = 50
          // 50 = 50 + (16*3) -> potencia(n)4 = 98
          // 98 = 98          -> potencia(n)5
            System.out.print(result + " ");
        }

    }
}
