import java.util.Arrays;

public class GenArrayMath {
    public double[] gen(int n) {
        double newArr[] = new double[n];
        for (int j = 0; j < n; j++) {
            newArr[j] = Math.random();
        }
        return newArr;
    }

    static void main(String[] args) {
        GenArrayMath genM = new GenArrayMath();
        double gMo[] = genM.gen(10);
        System.out.println(Arrays.toString(gMo));
    }
}



