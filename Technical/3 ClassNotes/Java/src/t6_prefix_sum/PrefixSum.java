package t6_prefix_sum;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int n = arr.length;

        int[] prefix = new int[n];

        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Print prefix array
        for (int i = 0; i < n; i++) {
            System.out.print(prefix[i] + " ");
        }
    }
}
