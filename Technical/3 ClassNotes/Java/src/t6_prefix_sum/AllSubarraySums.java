package t6_prefix_sum;

public class AllSubarraySums {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;

        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                int sum;
                if (start == 0) {
                    sum = prefix[end];
                } else {
                    sum = prefix[end] - prefix[start - 1];
                }

                System.out.println(
                    "Subarray (" + start + "," + end + ") Sum = " + sum
                );
            }
        }
    }
}
