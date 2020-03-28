package my.nmcuong.codility.kbtg;

import java.util.HashSet;
import java.util.Set;

public class TaskTwo {
	static public int solution(int A, int B, int C, int D) {
		// write your code in Java SE 8
		// 2 3 3 2
		// 12:38, 13:28, 18:23, 18:32, 21:38, 23:18
		int[] arr = { A, B, C, D };
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j != i && arr[i] * 10 + arr[j] < 24) {
					for (int k = 0; k < arr.length; k++) {
						if (k != i && k != j) {
							for (int h = 0; h < arr.length; h++) {
								if (h != i && h != j && h != k && arr[k] * 10 + h < 60) {
									set.add(arr[i]*1000 + arr[j]*100 + arr[k]* 10 + arr[h]);
								}
							}
						}
					}
				}
			}
		}
		return set.size();

	}
}
