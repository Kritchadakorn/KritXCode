import java.util.Scanner;

public class SumNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, sum = 0;
        for(i=1;i<=n;i++){
            sum = sum + (i*i);
        }
        System.out.println(sum);
    }
}
