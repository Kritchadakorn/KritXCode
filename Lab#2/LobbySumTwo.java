import java.util.Arrays;

public class LobbySumTwo {
    static void main(String[] args) {
        SumTwo st = new SumTwo();
        int[] arr = {5, 5, 2, 1, 5};
        int arrsum = st.sumTwo(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arrsum);
    }
}
