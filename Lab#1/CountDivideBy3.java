import java.util.Scanner;

public class CountDivideBy3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int sum = 0;
        for(i = 1;i <= n; i++){
            if(i % 3 == 0){
                sum = sum + 1;
            }
        }
        System.out.println(sum);
    }
}
