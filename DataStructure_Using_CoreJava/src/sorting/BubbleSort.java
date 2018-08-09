package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// taking size of the array from user
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();

		// initilizing array with Size
		int[] arr = new int[size];

		// inserting values into array from Scanner
		System.out.println("enter the elements");
		for (int i = 0; i <= size - 1; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Initial Array : ");
		printArray(arr);
		bubbleSort(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			System.out.print("After pass " + i + "  : ");
			// Printing array after pass
			printArray(arr);
		}
	}
}
