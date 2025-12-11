import java.util.Arrays;
import java.util.Scanner;

public class GenerateArrayMath {
    public static double[] gen(int n) {
        if (n <= 0) {
            return new double[0];
        }
        double newArray[] = new double[n];
        for(int i = 0 ; i < n ; i++){
            newArray[i] = Math.random();
        }
        return newArray;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();
        double Double[] = gen(n);
        System.out.println("Gen(" + n + ") = " + Arrays.toString(Double));
    }
}