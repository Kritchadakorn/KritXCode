import java.util.Scanner;

public class ComputeABS {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        if (a > b){
            sum = a - b;
        }else {
            sum = b - a;
        }
        System.out.println("ค่าสัมบูรณ์ = "+sum);
    }
}