import java.util.Arrays;
import java.util.Scanner;

public class ShiftArray {
    public static int[] shiftRight(int[] arr) {
        int Size = arr.length;
        int newSize = Size + 1;
        int[] newArray = new int[newSize];
        System.arraycopy(arr, 0, newArray, 1, Size);
        return newArray;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Amount : ");
        int RSize = sc.nextInt();
        int arr1[] = new int[RSize];
        for(int i = 0 ; i < RSize ; i++){
            arr1[i] = sc.nextInt();
        }
        int[] shiftR = shiftRight(arr1);
        System.out.print("[");
        for (int i = 0; i < shiftR.length; i++) {
            System.out.print(shiftR[i] + (i < shiftR.length - 1 ? "," : ""));
        }
        System.out.print("]");
    }
}