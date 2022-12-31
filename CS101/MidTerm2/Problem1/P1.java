package CS101.MidTerm2.Problem1;

public class P1 {

    public static void main(String[] args) {
        int[] x = { 3, 2, 1, 5, 6 };
        int[] y = { -2, 2, 3, 5, 7 };
        int[] z = { 1, 2, 2, 3, 3, 4 };

        System.out.println(isSorted(x)); // Should print false
        System.out.println(isSorted(y)); // Should print true
        System.out.println(isSorted(z)); // Should print true
    }

    /**
     * Checks if a given integer array is in
     * non-decreasing order.
     * 
     * @param a an array
     * @return true if the array is sorted, false otherwise.
     */
    public static boolean isSorted(int[] a) {
        if (a == null || a.length <= 1) {
            return true;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
