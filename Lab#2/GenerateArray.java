import java.util.Arrays;
import java.util.Scanner;

public class GenerateArray {
    public static int[] gen(int n,int i){
        if(n <= 0){
            return new int[0];
        }
        int[] newArray = new int[n];
        for (int j = 0; j < n; j++) {
            newArray[j] = i;
        }
        return newArray;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n : ");
        int n = sc.nextInt();
        System.out.print("Input i : ");
        int i = sc.nextInt();
        int[] result = gen(n, i);
        System.out.print("Gen(" + n + "," + i + ") = " + Arrays.toString(result));
    }
}

