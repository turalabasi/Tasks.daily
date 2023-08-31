package Task10;

import java.util.Arrays;

public class Main {
    public static boolean isSorted(int a,int b,int c,int d) {
          int[] nums={a,b,c,d};
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[]args){
            System.out.println(isSorted(3, 1, 1, 9));
            System.out.println(isSorted(1, 1, 5, 9));
            System.out.println(isSorted(1, 3, 5, 9));


        }

    }
