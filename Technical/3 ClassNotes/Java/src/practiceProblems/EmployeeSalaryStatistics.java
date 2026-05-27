package practiceProblems;

import java.util.Arrays;

public class EmployeeSalaryStatistics {

    public static void main(String[] args) {

        int salary[] = {35000,45000,55000,25000,60000,45000};

        System.out.println("Employee Salaries:");
        printArray(salary);

        System.out.println("Highest Salary: "
                            + highestSalary(salary));

        System.out.println("Second Highest Salary: "
                            + secondHighestSalary(salary));

        double avg = averageSalary(salary);

        System.out.println("Average Salary: "
                            + avg);

        System.out.println("Employees earning above average: "
                            + countAboveAverage(salary, avg));

        Arrays.sort(salary);

        System.out.println("Sorted Salaries:");
        printArray(salary);

    }


    static void printArray(int arr[]) {

        for(int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }


    static int highestSalary(int arr[]) {

        int max = arr[0];

        for(int i : arr) {

            if(i > max)
                max = i;
        }

        return max;
    }


    static int secondHighestSalary(int arr[]) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i : arr) {

            if(i > largest) {

                second = largest;
                largest = i;
            }

            else if(i > second && i != largest)
                second = i;
        }

        return second;
    }


    static double averageSalary(int arr[]) {

        int sum = 0;

        for(int i : arr)
            sum += i;

        return (double)sum/arr.length;
    }


    static int countAboveAverage(int arr[],
                                 double average) {

        int count = 0;

        for(int i : arr) {

            if(i > average)
                count++;
        }

        return count;
    }

}
