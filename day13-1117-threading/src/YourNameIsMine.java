


public class YourNameIsMine {

    // Method to calculate the edit distance using simple recursion
    public static int editDistance(String name1, String name2) {
        // Call the recursive helper function with the lengths of both strings
        return editDistanceRecursive(name1, name2, name1.length(), name2.length());
    }

    // Recursive helper method
    private static int editDistanceRecursive(String name1, String name2, int m, int n) {
        // Base cases
        if (m == 0) {
            return n; // If name1 is empty, the cost is the length of name2 (insert all characters of name2)
        }
        if (n == 0) {
            return m; // If name2 is empty, the cost is the length of name1 (delete all characters of name1)
        }

        // If the last characters of both strings are the same, no operation is needed
        // Move to the next character in both strings
        if (name1.charAt(m - 1) == name2.charAt(n - 1)) {
            return editDistanceRecursive(name1, name2, m - 1, n - 1);
        }

        // If the last characters are different, consider all three possible operations:
        // 1. Insert (move left in name2)
        // 2. Delete (move left in name1)
        // 3. Substitute (move left in both strings)
        // Take the minimum of these operations and add 1 to the count
        int insert = editDistanceRecursive(name1, name2, m, n - 1);       // Insert
        int delete = editDistanceRecursive(name1, name2, m - 1, n);       // Delete
        int substitute = editDistanceRecursive(name1, name2, m - 1, n - 1); // Substitute

        return 1 + Math.min(insert, Math.min(delete, substitute));
    }

    // Main method for testing
    public static void main(String[] args) {
        String name1 = "horse";
        String name2 = "ros";

        int distance = editDistance(name1, name2);
        System.out.println("Edit Distance between \"" + name1 + "\" and \"" + name2 + "\" is: " + distance);
    }
}