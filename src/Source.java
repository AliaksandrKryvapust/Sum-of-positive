import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] arr = new int[]{1,-2,3,4,5};
        System.out.println(sum(arr)==13);
    }
    public static int sum(int[] arr){
        return Arrays.stream(arr).map((i)-> (i>0)? i :0).sum();
    }
}
