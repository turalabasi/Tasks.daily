package Task15;

public class Main {
    public static void main(String[] args) {
        String input = "qabaq";


        String reversed = reverseString(input);


        boolean isInverseSame = input.equals(reversed);

        if (isInverseSame) {
            System.out.println("tersi ile duzu eynidir : " + input);
        } else {
            System.out.println("tersi ile duzu ferqlidir.");
        }
    }


    public static String reverseString(String input) {
        char[] characters = input.toCharArray();
        int length = characters.length;

        for (int i = 0; i < length / 2; i++) {

            char temp = characters[i];
            characters[i] = characters[length - i - 1];
            characters[length - i - 1] = temp;
        }
        return new String(characters);
    }
}
