package practiceProblems;

import java.util.HashMap;

public class MetroTicketSimulation {

    public static void main(String[] args) {

        int tickets[][] = {

                {101,1,5},
                {102,2,3},
                {103,1,4},
                {104,3,7},
                {105,2,2}

        };


        System.out.println(
                "Metro Ticket Records:");

        printMatrix(tickets);


        //Total Tickets
        int total =
                totalTickets(tickets);

        System.out.println(
                "\nTotal Tickets Sold: "
                + total);


        //Station with maximum tickets
        int station =
                maxTicketStation(tickets);

        System.out.println(
                "Station with Maximum Tickets: "
                + station);


        //String Compression
        String stations =
                "AAABBBCCDAA";

        System.out.println(
                "\nCompressed Stations: "
                + compress(stations));


        //Parsing
        String log =
                "101-Chennai-5";

        parseLog(log);

    }



    //Matrix Traversal
    static void printMatrix(
            int arr[][]) {

        for(int i=0;i<arr.length;i++) {

            for(int j=0;
                j<arr[i].length;
                j++) {

                System.out.print(
                        arr[i][j]
                        + " ");
            }

            System.out.println();
        }
    }



    //Total Tickets
    static int totalTickets(
            int arr[][]) {

        int total = 0;

        for(int i=0;i<arr.length;i++)
            total += arr[i][2];

        return total;
    }



    //Station with maximum tickets
    static int maxTicketStation(
            int arr[][]) {

        HashMap<Integer,Integer>
                map =
                new HashMap<>();

        for(int i=0;i<arr.length;i++) {

            int station =
                    arr[i][1];

            int count =
                    arr[i][2];

            map.put(
                    station,
                    map.getOrDefault(
                            station,
                            0)+count);
        }

        int maxStation = -1;
        int maxTickets = 0;

        for(Integer key :
                map.keySet()) {

            if(map.get(key)
                    > maxTickets) {

                maxTickets =
                        map.get(key);

                maxStation = key;
            }
        }

        return maxStation;
    }



    //String Compression
    static String compress(
            String str) {

        StringBuilder sb =
                new StringBuilder();

        int count = 1;

        for(int i=0;
            i<str.length()-1;
            i++) {

            if(str.charAt(i)
                    == str.charAt(i+1))

                count++;

            else {

                sb.append(
                        str.charAt(i));

                sb.append(count);

                count = 1;
            }
        }

        sb.append(
                str.charAt(
                        str.length()-1));

        sb.append(count);

        return sb.toString();
    }



    //Parsing
    static void parseLog(
            String log) {

        String parts[] =
                log.split("-");

        System.out.println(
                "\nParsed Log:");

        System.out.println(
                "Passenger ID: "
                + parts[0]);

        System.out.println(
                "City: "
                + parts[1]);

        System.out.println(
                "Tickets: "
                + parts[2]);
    }

}
