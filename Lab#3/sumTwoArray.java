import java.util.Arrays;

public class sumTwoArray {
    public int equalCount(int arr1[], int arr2[]) {
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                result++;
            }
        }
        return result;
    }

    static void main(String[] args) {
        sumTwoArray stA = new sumTwoArray();
        int arr1[] = {1, 2, 3, 1, 2};
        int arr2[] = {2, 2, 3, 4, 5};
        int sA = stA.equalCount(arr1, arr2);
        System.out.println(sA);
    }
}
