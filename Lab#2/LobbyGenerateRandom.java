import java.util.Arrays;

public class LobbyGenerateRandom {
    static void main(String[] args) {
        GenerateArrayRandom gen2 = new GenerateArrayRandom();
        double[] arr1 = gen2.generateArray(5);
        System.out.println(Arrays.toString(arr1));
    }
}
