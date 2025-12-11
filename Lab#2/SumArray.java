import java.util.Arrays;
import java.util.Scanner;

public class SumArray {
    public static int sumTwo(int arr[]){
        int fivesum = 0;
        for(int element : arr){
            if(element == 5){
                fivesum = fivesum + 5;
            }
        }
        return fivesum;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Amount : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("[");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }
        System.out.println("]");
        System.out.println("Sum of five = " + sumTwo(arr));
    }
}
