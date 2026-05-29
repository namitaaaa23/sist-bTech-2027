package practiceProblems;

import java.util.*;

public class EvenOddBalance {
    public static int countBalancedSubarrays(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0)
                prefix += arr[i];
            else
                prefix -= arr[i];

            count += map.getOrDefault(prefix, 0);

            map.put(prefix,
                    map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,1,2};
        System.out.println(countBalancedSubarrays(arr));
    }
}
