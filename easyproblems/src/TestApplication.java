import java.util.Arrays;

public class TestApplication {
    public static void main(String[] args) {
        MaxConsecutiveOnes m1 = new MaxConsecutiveOnes();
        int[] num = new int[]{1, 1, 0, 1, 1, 1};
        System.out.println(m1.findMaxConsecutiveOnes(num));


        TwoSum t= new TwoSum();
        System.out.println(Arrays.toString(t.findSum(new int[]{2,7,11,15}, 9)));
    }
}
