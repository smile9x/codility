package my.nmcuong.codility.sorting;

import java.util.Arrays;

public class Distinct {
	static public int solution(int[] A) {
		long count = Arrays.stream(A).distinct().count();
		return (int)count;
	}
}
