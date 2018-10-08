
import java.math.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        int[][] tests = {
                {0,3,4,2},
                {0,2,5,3},
                {14,4,98,2},
                {4523,8092,9419,8076},
                {43, 2, 70, 2}
        };
        String[] results = {
                "YES", "NO", "YES", "YES", "NO"
        };
        if (false) {
            for (int i = 0; i < tests.length; i++) {
                System.out.println(hello(tests[i], false) == results[i]);
            }
        } else {
            int i = 4;
            System.out.println(hello(tests[i], true));
        }
    }

    private static String hello(int[] input, boolean test) {
        int x1 = input[0],
            v1 = input[1],
            x2 = input[2],
            v2 = input[3];
        int strike = 0;
        int lastDistance = Math.abs(x1 - x2);
        while(true) {
            if (test) System.out.println(x1 + " " + x2 + " / " + (x1==x2));
            if (x1 == x2) return "YES";
            x2 += v2; x1 += v1;
            if (test) System.out.println(strike);
            if ((Math.abs(x1-x2)) - lastDistance >= 0) strike++;
            lastDistance = Math.abs(x1 - x2);
            if (strike > 10) return "NO";
        }
    }
}
