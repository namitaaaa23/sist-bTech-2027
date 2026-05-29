package practiceProblems;

public class SmallestSubarray {

    public static int minLength(int[] arr, int k) {

        int left = 0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;

        for(int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while(sum >= k) {

                ans = Math.min(ans,
                               right - left + 1);

                sum -= arr[left];
                left++;
            }
        }

        return ans == Integer.MAX_VALUE
                ? 0
                : ans;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,1,2,4,3};

        System.out.println(minLength(arr, 7));
    }
}
