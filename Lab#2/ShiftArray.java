public class ShiftArray {
    public int[] shiftRight(int[] arr) {
        int size = arr.length;
        int newsize = size + 1;
        int[] newArr = new int[newsize];
        System.arraycopy(arr, 0, newArr, 1, size);
        return newArr;
    }
}
