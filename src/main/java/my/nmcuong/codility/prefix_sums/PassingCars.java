package my.nmcuong.codility.prefix_sums;

public class PassingCars {
	static public int solution(int[] A) {
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == 0 && A[j] == 1) {
					count++;
				}
			}
		}
		if (count >= 1000000000) {
			return -1;
		}
		return count;
	}
}
