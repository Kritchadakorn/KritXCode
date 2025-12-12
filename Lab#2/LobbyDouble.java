public class LobbyDouble {
    static void main(String[] args) {
        DoubleArray obj = new DoubleArray();
        int[] arr1 = {1, 2, 4};
        int[] arr = obj.copyArray(arr1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? "," : ""));
        }

    }
}
