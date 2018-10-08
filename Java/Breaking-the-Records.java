
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        int[][] tests = {
                {10, 5, 20, 20, 4, 5, 2, 25, 1},
                {3, 4, 21, 36, 10, 28, 35, 5, 24, 42}
        };
        String[] results = {
                "2 4",
                "4 0"
        };
        if (true) {
            for (int i = 0; i < tests.length; i++) {
                System.out.println(hello(tests[i], false).equals(results[i]));
            }
        } else {
            int i = 0;
            System.out.println(hello(tests[i], true));
        }
    }

    private static String hello(int[] input, boolean test) {
        int min = input[0], max=input[0], minn = 0, maxn = 0;
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
                minn++;
            }
            if (input[i] > max) {
                max = input[i];
                maxn++;
            }
        }
        return maxn + " " + minn;
    }


}
