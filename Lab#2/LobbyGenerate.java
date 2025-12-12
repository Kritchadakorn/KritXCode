import java.util.Arrays;

public class LobbyGenerate {
    static void main(String[] args) {
        GenerateArray obj = new GenerateArray();
        int[] gen = obj.generateArray(6);
        System.out.println(Arrays.toString(gen));
    }
}
