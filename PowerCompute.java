import java.util.Scanner;

public class PowerCompute {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i, j, fivesum = 1, threesum = 1;
        for(i=1;i<=a;i++){
            fivesum = fivesum*5;
            }
        for(j=1;j<=b;j++){
            threesum = threesum*3;
        }
    System.out.println(fivesum+threesum);
    }
}
