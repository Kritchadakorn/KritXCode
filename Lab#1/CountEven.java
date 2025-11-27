import java.util.Scanner;

public class CountEven {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, sum = 0;
        for(i=1;i<=n;i++){
            if(i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
