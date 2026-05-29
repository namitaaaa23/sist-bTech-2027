package t5_twoPointer_slidingWindow;

public class FixedWindow {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        int k = 3;

        int windowSum = 0;

        for(int i=0;i<k;i++)
            windowSum += arr[i];

        int maxSum = windowSum;

        for(int i=k;i<arr.length;i++) {

            windowSum =
                    windowSum
                    - arr[i-k]
                    + arr[i];

            maxSum =
                    Math.max(
                            maxSum,
                            windowSum);
        }

        System.out.println(
                "Maximum Sum: "
                + maxSum);
    }
}
