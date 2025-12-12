public class GenerateArrayRandom {
    public double[] generateArray(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }
}
