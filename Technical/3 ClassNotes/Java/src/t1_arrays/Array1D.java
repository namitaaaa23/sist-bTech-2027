package t1_arrays;

import java.util.Scanner;

public class Array1D {
	public static void main(String[] args) {
			
		
		Array1D obj = new Array1D();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size");
		int a1[] = obj.getArray(scan.nextInt());
		
		System.out.println("Enter the size");
		int a2[] = obj.getArray(scan.nextInt());
	
		System.out.println("Array1: ");
		obj.printArray(a1);
		
		System.out.println("Array2: ");
		obj.printArray(a2);
		
		
		int max[] = new int[10];
		
		max[0] = obj.max(a1);
		max[1] = obj.max(a2);
		
		System.out.println("Max of max: " + obj.max(max));

	    int arr[] = {10,45,30,45,20};

	    System.out.println("Array:");
	    obj.printArray(arr);

	    System.out.println("Maximum : "
	                        + obj.max(arr));

	    System.out.println("Second Largest : "
	                        + obj.secondLargest(arr));

	    String s1 = "madam";

	    if(obj.isPalindrome(s1))
	        System.out.println(s1 + " is Palindrome");
	    else
	        System.out.println(s1 + " is not Palindrome");

	    String s2 = "Placement";

	    System.out.println("Substring : "
	            + obj.subString(s2,2,7));
	    
	    scan.close();
	
	}


	public int[] getArray(int size) {
		
		Scanner scan = new Scanner(System.in);
		int array[] = new int[size];
		
		System.out.println("Enter " + size + " elements");
		
		for(int i=0; i<size; i++)
			array[i] = scan.nextInt();
		
		return array;
	}
	
	public void printArray(int array[]) {
		
		for(int i:array)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public int max(int array[]) {
		
		int max = array[0];
		
		for(int i:array) {
			
			if(i>max)
				max = i;
		}
		
		return max;			
	}
	
	void insert(int array[], int size, int pos, int value) {
		
		if(ifFull(array, size))
			System.out.println("Array is Full");
		else {
			//Shifting
			for(int i=size; i>pos; i--)
				array[i] = array[i-1];
			
			array[pos] = value;
		}
	}
	
	boolean ifFull(int array[], int size) {
		if(array.length == size)
			return true;
		else
			return false;
	}
	
	void delete(int array[], int size, int value) {
		if(isEmpty(size))
			System.out.println("Array is Empty");
		
		else {
			int pos = search(array, value, size);
			
			if(pos == -1)
				System.out.println(value + " is not found");
			else {
				for(int i=pos; i<=size-2; i++)
					array[i] = array[i+1];
				
				array[size-1] = 0;
				size--;
			}
		}			
	}
	
	boolean isEmpty(int size) {
		return size==0?true:false;
	}
	
	int search(int array[], int value, int size) {
		
		for(int i=0; i<size; i++) {
			if(array[i] == value)
				return i;		
		}
		
		return -1;
	}
	
	void leftRotation(int array[], int times) {
		int temp;
		while(times>0) {
			temp = array[0];
			
			for(int i=0; i<array.length-1; i++) 
				array[i] = array[i+1];
			
			array[array.length-1] = temp;			
			times--;
		}
	}
	
	void rightRotation(int array[], int times) {
		int temp;
		while(times>0) {
			temp = array[array.length-1];
			
			for(int i = array.length-1; i>0; i--)
				array[i] = array[i-1];
			
			array[0] = temp;
			times--;
		}
	}
	
	//Find second largest element
	int secondLargest(int array[]) {

	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;

	    for(int i : array) {

	        if(i > largest) {
	            secondLargest = largest;
	            largest = i;
	        }

	        else if(i > secondLargest && i != largest) {
	            secondLargest = i;
	        }
	    }

	    return secondLargest;
	}


	//Palindrome check
	boolean isPalindrome(String str) {

	    int left = 0;
	    int right = str.length()-1;

	    while(left < right) {

	        if(str.charAt(left) != str.charAt(right))
	            return false;

	        left++;
	        right--;
	    }

	    return true;
	}


	//Custom substring implementation
	String subString(String str, int start, int end) {

	    String result = "";

	    for(int i=start; i<end; i++)
	        result += str.charAt(i);

	    return result;
	}
}



