import java.util.Arrays;

public class MultipleArray {
    public int[] multiple(int arr[], int n){
        int newArray[] = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            newArray[i] = arr[i] * n;
        }
        return newArray;
    }

    static void main(String[] args) {
        MultipleArray Multi = new MultipleArray();
        int arr[] = {2,4,6,8};
        int Mul[] = Multi.multiple(arr,10);
        System.out.println(Arrays.toString(Mul));
    }
}
