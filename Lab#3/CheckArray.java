import java.util.Arrays;

public class CheckArray {
    public boolean isEqual(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        CheckArray ChA = new CheckArray();
        int arr1[] = {1, 2, 4};
        int arr2[] = {4, 1, 2};
//      Arrays.sort(arr1);
//      Arrays.sort(arr2);
        boolean result = ChA.isEqual(arr1, arr2);
        System.out.println(result);
    }
}

