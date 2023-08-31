import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        class LoginProgram {
            // Static olaraq təyin olunmuş dəyərlər
            private static final String CORRECT_USERNAME = "istifadeci";
            private static final String CORRECT_PASSWORD = "sifre";
            private static final int MAX_ATTEMPTS = 3;

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
                    System.out.print("İstifadəçi adı: ");
                    String enteredUsername = scanner.nextLine();

                    System.out.print("Şifrə: ");
                    String enteredPassword = scanner.nextLine();

                    if (checkFields(enteredUsername, enteredPassword)) {
                        System.out.println("Xoş gəldiniz, '" + enteredUsername + "'!");
                        break;
                    } else {
                        System.out.println("İstifadəçi adı və ya şifrə yanlışdır.");
                        if (attempt < MAX_ATTEMPTS) {
                            System.out.println("Qalan cəhdlər: " + (MAX_ATTEMPTS - attempt));
                        } else {
                            System.out.println(" cəhdlərin sayı bitib. Sistemdən çıx.");
                        }
                    }
                }

                }
            private static boolean checkFields(String username, String password) {
                return username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD);
            }

            }}}
