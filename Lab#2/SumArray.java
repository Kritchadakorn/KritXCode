import java.util.Arrays;

public class SumArray {
    public int sumTwo(int arr[]) {
        int sumoffive = 0;
        for (int number : arr) {
            if (number == 5) {
                sumoffive += 5;
            }
        }
        return sumoffive;
    }

    static void main(String[] args) {
        SumArray sR = new SumArray();
        int arr[] = {5, 5, 3, 5, 0, 1, 2, 6};
        int sum = sR.sumTwo(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(sum);

    }
}
