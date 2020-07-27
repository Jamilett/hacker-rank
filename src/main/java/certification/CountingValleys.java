package certification;

/**
 * A valley is a sequence of consecutive steps below sea level, starting with a
 * step down from sea level and ending with a step up to sea level.
 *
 * @author jamsr
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {

        char[] array = s.toCharArray();
        int valleys = 0;
        int level = 0;

        for (char c : array) {
            if (c == 'U') {
                ++level;
            }
            if (c == 'D') {
                --level;
            }
            if (level == 0 && c == 'U') {
                ++valleys;
            }
        }
        System.out.println(valleys);

        return valleys;

    }

    public static void main(String[] args) {
        countingValleys(8, "UDDDUDUU");
    }

}
