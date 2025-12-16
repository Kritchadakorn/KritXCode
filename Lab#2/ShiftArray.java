import java.util.Arrays;

public class ShiftArray {
    public int[] shiftRight(int arr[]) {
        int size = arr.length;
        int newSize = size + 1;
        int newArray[] = new int[newSize];
        System.arraycopy(arr, 0, newArray, 1, size);
        return newArray;
    }

    static void main(String[] args) {
        ShiftArray sA = new ShiftArray();
        int arr[] = {5, 4, 3, 2, 1};
        int shiftR[] = sA.shiftRight(arr);
        System.out.println(Arrays.toString(shiftR));
    }
}
