package my.nmcuong.codility;

import my.nmcuong.codility.orient.BinarySearch;
import my.nmcuong.codility.orient.QuickSort;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int arr[] = {10, 7, 8, 9, 1, 5};
		QuickSort.sort(arr, 0, arr.length - 1);
		printArray(arr);
		int indexResult = BinarySearch.binarySearch(arr, 0, arr.length - 1, 8);
		System.out.println(indexResult);
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
