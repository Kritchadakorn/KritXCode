import java.util.Scanner;

public class DoubleArray {
    public static int[] copyArray(int arr[]) {
        int doubarr[] = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            doubarr[i] = arr[i];
        }
        return doubarr;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Amount : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        int arrcopy[] = copyArray(arr);
        System.out.print("{");
        for (int i = 0; i < arrcopy.length; i++) {
            System.out.print(arrcopy[i] + (i < arrcopy.length - 1 ? "," : ""));
        }
        System.out.print("}");
    }
}