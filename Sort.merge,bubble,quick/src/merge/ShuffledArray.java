package merge;

import java.util.Random;

    public class ShuffledArray {
        public static void main(String[] args) {
            int[] numbers = new int[100];

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = i + 1;
            }


            shuffleArray(numbers);

            System.out.println("Shuffled Array:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }

        public static void shuffleArray(int[] arr) {
            Random rand = new Random();
            for (int i = arr.length - 1; i > 0; i--) {
                int j = rand.nextInt(i + 1);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


    }

