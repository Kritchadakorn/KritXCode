public class SumTwo {
    public int sumTwo(int[] arr) {
        int sum = 0;
        for (int mirror : arr) {
            if (mirror == 5) {
                sum += 5;
            }
        }
        return sum;
    }
}
