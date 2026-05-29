package practiceProblems;

import java.util.Arrays;
import java.util.HashMap;

public class SmartTrafficAnalysis {

    public static void main(String[] args) {

        int traffic[] =
                {10,0,25,30,0,15,20,5};

        System.out.println(
                "Original Traffic Data:");

        printArray(traffic);


        //Move zeros
        moveZeros(traffic);

        System.out.println(
                "\nAfter Moving Zeros:");

        printArray(traffic);


        //Pair Sum
        int target = 35;

        System.out.println(
                "\nChecking Pair Sum:");

        pairSum(traffic,target);


        //Sliding Window
        int k = 3;

        int maxTraffic =
                maxVehiclesInWindow(
                        traffic,k);

        System.out.println(
                "\nMaximum vehicles in "
                + k
                + " consecutive minutes: "
                + maxTraffic);

    }



    //Print Array
    static void printArray(int arr[]) {

        for(int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }



    //Move Zeros
    static void moveZeros(int arr[]) {

        int left = 0;

        for(int right=0;
            right<arr.length;
            right++) {

            if(arr[right] != 0) {

                int temp =
                        arr[left];

                arr[left] =
                        arr[right];

                arr[right] =
                        temp;

                left++;
            }
        }
    }



    //Pair Sum using HashMap
    static void pairSum(int arr[],
                        int target) {

        HashMap<Integer,Integer>
                map =
                new HashMap<>();

        for(int i : arr) {

            int diff =
                    target-i;

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

        System.out.println(
                "No Pair Found");
    }



    //Fixed Sliding Window
    static int maxVehiclesInWindow(
            int arr[],
            int k) {

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

        return maxSum;
    }

}
