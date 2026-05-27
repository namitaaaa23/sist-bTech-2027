package practiceProblems;

import java.util.*;

public class VotingSystemFrequencyCounter {

    public static void main(String[] args) {

        String votes[] = {
                "John",
                "Emma",
                "David",
                "John",
                "Emma",
                "John",
                "Alex",
                "David",
                "Emma",
                "Emma"
        };

        HashMap<String,Integer> voteMap =
                        new HashMap<>();


        //Frequency count
        for(String candidate : votes){

            voteMap.put(
                    candidate,
                    voteMap.getOrDefault(
                            candidate,
                            0)+1);
        }


        System.out.println(
                "Candidate Vote Count");

        for(String candidate :
                voteMap.keySet()){

            System.out.println(
                    candidate
                    + " -> "
                    + voteMap.get(candidate));
        }


        //Find Winner

        String winner = "";
        int maxVotes = 0;

        for(String candidate :
                voteMap.keySet()){

            if(voteMap.get(candidate)
                    > maxVotes){

                maxVotes =
                        voteMap.get(candidate);

                winner = candidate;
            }
        }


        System.out.println(
                "\nWinner : "
                + winner);

        System.out.println(
                "Votes : "
                + maxVotes);


        //Sorting by votes descending

        ArrayList<Map.Entry<String,Integer>>
                list =
                new ArrayList<>(
                        voteMap.entrySet());

        Collections.sort(
                list,
                (a,b)->
                b.getValue()-a.getValue());


        System.out.println(
                "\nSorted Vote Count");

        for(Map.Entry<String,Integer>
                entry : list){

            System.out.println(
                    entry.getKey()
                    + " -> "
                    + entry.getValue());
        }

    }
}
