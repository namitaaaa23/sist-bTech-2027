package t5_twoPointer_slidingWindow;

import java.util.HashMap;

public class PairSum {

    public static void main(String[] args) {

        int arr[] = {2,7,11,15};
        int target = 9;

        HashMap<Integer,Integer> map =
                new HashMap<>();

        for(int i : arr) {

            int diff = target - i;

            if(map.containsKey(diff)) {

                System.out.println(
                        "Pair Found: "
                        + diff
                        + " "
                        + i);

                return;
            }

            map.put(i,1);
        }

        System.out.println("No Pair Found");
    }
}
