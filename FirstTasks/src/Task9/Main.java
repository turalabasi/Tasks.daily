package Task9;

public class Main {
    public static boolean checkEquality(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] num1 = {2,3,3,5};
        System.out.println(checkEquality(num1));
        int [] num2 = {2,3,4,5};
        System.out.println(checkEquality(num2));

    }}
