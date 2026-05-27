package t4_hashing;

import java.util.HashMap;

public class FrequencyMapDemo {

    public static void main(String[] args) {

        int arr[] = {1,2,1,3,2,4,1,5,2};

        HashMap<Integer,Integer> freq =
                        new HashMap<>();

        for(int i : arr) {

            if(freq.containsKey(i))
                freq.put(i, freq.get(i)+1);

            else
                freq.put(i,1);
        }

        System.out.println("Frequency:");

        for(Integer key : freq.keySet())
            System.out.println(key +
                    " -> " +
                    freq.get(key));
    }
}
