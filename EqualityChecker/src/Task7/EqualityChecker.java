package Task7;

public class EqualityChecker {

    public static boolean checkEquality(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;  // Both strings are null, considered equal
        }
        if (str1 == null || str2 == null) {
            return false; // One string is null, considered not equal
        }
        return str1.equals(str2); // Compare the strings using equals() method
    }
}
