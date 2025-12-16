import java.util.Arrays;

public class DoubleArray {
    public int[] copyArray(int arr[]) {
        int doublearray[] = new int[arr.length * 2];
        System.arraycopy(arr, 0, doublearray, 0, arr.length);
        return doublearray;
    }

    static void main(String[] args) {
        DoubleArray doub = new DoubleArray();
        int arr[] = {1, 2, 4};
        int copyarr[] = doub.copyArray(arr);
        System.out.println(Arrays.toString(copyarr));
    }
}
