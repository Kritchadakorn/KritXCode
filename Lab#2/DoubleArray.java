public class DoubleArray {
    public int[] copyArray(int[] arr) {
        int[] doublearr = new int[arr.length * 2];
        System.arraycopy(arr, 0, doublearr, 0, arr.length);
        return doublearr;
    }
}

