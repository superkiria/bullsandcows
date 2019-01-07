package bullsandcows;

import static java.lang.Math.min;

public class BullsAndCows {

    public static int countBulls(String a, String b) {
        int count = 0;
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        for (int i = 0; i < min(a.length(), b.length()); i++) {
            if (arrayA[i] == arrayB[i]) {
                count++;
            }
        }
        return count;
    }

    public static int countCows(String a, String b) {
        int count = 0;
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (arrayA[i] == arrayB[j]) {
                    count++;
                }
            }
        }
        return count - countBulls(a, b);
    }
}
