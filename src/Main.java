import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t, s, d, k;
        boolean a;

        Testcase checker = new Testcase();

        try {
            FileInputStream fileInputStream = new FileInputStream("cheeseburger_corollary_1_validation_input.txt");
            Scanner sc = new Scanner(fileInputStream);

            // Read the number of test cases
            t = sc.nextInt();

            for (int i = 1; i <= t; i++) {
                s = sc.nextInt();
                d = sc.nextInt();
                k = sc.nextInt();

                a = checker.testcase(s, d, k);
                if (a) {
                    System.out.println("Case #" + i + ": YES");
                } else {
                    System.out.println("Case #" + i + ": NO");
                }
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
