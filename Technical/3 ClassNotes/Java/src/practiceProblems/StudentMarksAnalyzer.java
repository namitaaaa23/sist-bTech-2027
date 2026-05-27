package practiceProblems;

import java.util.*;

public class StudentMarksAnalyzer {

    public static void main(String[] args) {

        // Step 1: Store student names
        ArrayList<String> students = new ArrayList<>();

        students.add("John");
        students.add("David");
        students.add("Emma");
        students.add("John");
        students.add("Alex");

        // Step 2: Store marks using HashMap
        HashMap<String,Integer> marks = new HashMap<>();

        marks.put("John",85);
        marks.put("David",92);
        marks.put("Emma",78);
        marks.put("Alex",88);

        // Step 3: Remove duplicates using HashSet
        HashSet<String> uniqueStudents = new HashSet<>(students);

        System.out.println("Unique Students:");
        System.out.println(uniqueStudents);

        // Step 4: Find highest mark

        String topper = "";
        int highest = Integer.MIN_VALUE;

        int total = 0;

        for(String student : marks.keySet()){

            int score = marks.get(student);

            total += score;

            if(score > highest){
                highest = score;
                topper = student;
            }
        }

        // Step 5: Average marks

        double average = (double) total / marks.size();

        // Step 6: Sort marks

        Integer[] scores = marks.values().toArray(new Integer[0]);

        Arrays.sort(scores);

        System.out.println("\nSorted Marks:");
        System.out.println(Arrays.toString(scores));
        
//        ArrayList<Integer> scoresList = new ArrayList<>(marks.values());
//
//        Collections.sort(scoresList);
//
//        System.out.println(scoresList);

        System.out.println("\nTopper: "
                            + topper
                            + " -> "
                            + highest);

        System.out.println("Average Marks: "
                            + average);

    }
}
