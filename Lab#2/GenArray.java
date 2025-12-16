import java.util.Arrays;

public class GenArray {
    public int[] gen(int n, int i) {
        int newArray[] = new int[n];
        for (int j = 0; j < n; j++) {
            newArray[j] = i;
        }
        return newArray;
    }

    static void main(String[] args) {
        GenArray genA = new GenArray();
        int geno[] = genA.gen(10, 5);
        System.out.println(Arrays.toString(geno));
    }
}
