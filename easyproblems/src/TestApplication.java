public class TestApplication {
    public static void main(String[] args) {
        MaxConsecutiveOnes m1= new MaxConsecutiveOnes();
        int[] num = new int[]{1,1,0,1,1,1};
        System.out.println(m1.findMaxConsecutiveOnes(num));
    }
}
