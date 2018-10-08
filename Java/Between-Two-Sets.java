
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        int[][][] tests = {
                {{2,4}, {16,32,96}},
                {{3,4}, {24,48}}
        };
        int[] results = {
                3, 2
        };
        if (false) {
            for (int i = 0; i < tests.length; i++) {
                System.out.println(hello(tests[i], false) == results[i]);
            }
        } else {
            int i = 0;
            System.out.println(hello(tests[i], true));
        }
    }

    private static int hello(int[][] input, boolean test) {
        int[] a = input[0];
        int[] b = input[1];
        int largestA=0, smallestB=Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0; i < a.length; i++ ) if (largestA < a[i]) largestA = a[i];
        for (int i = 0; i < b.length; i++ ) if (smallestB > b[i]) smallestB = b[i];
        if (test) System.out.println(largestA + " " + smallestB);
        for (int i = largestA; i < smallestB+1; i++) {
            if (test) System.out.println(i + " | " + canDivide(i, a) + " " + isMultiplied(i, b));
            if (canDivide(i, a) && isMultiplied(i, b)) result++;
        }
        return result;
    }

    private static boolean canDivide(int what, int[] input) {
        for (int i : input) {
            if (what%i != 0) return false;
        }
        return true;
    }

    private static boolean isMultiplied(int what, int[]input) {
        for (int i : input) {
            if (i%what != 0) return false;
        }
        return true;
    }

}
