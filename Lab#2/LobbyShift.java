public class LobbyShift {
    static void main(String[] args) {
        ShiftArray sh = new ShiftArray();
        int[] arr = {1, 2, 3, 4};
        int[] shift = sh.shiftRight(arr);
        for (int i = 0; i < shift.length; i++) {
            System.out.print(shift[i] + (i < shift.length - 1 ? "," : ""));
        }
    }
}
