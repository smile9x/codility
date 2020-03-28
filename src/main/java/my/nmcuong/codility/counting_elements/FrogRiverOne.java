package my.nmcuong.codility.counting_elements;

import java.util.SortedMap;
import java.util.TreeMap;

public class FrogRiverOne {
	static public int solution(int X, int[] A) {
		SortedMap<Integer, Boolean> map = new TreeMap<>();
		int count = 0;
		for (int i = 0; i < A.length ; i ++) {
			Boolean had = map.get(A[i]);
			if (had == null) {
				map.put(A[i], true);
				count ++;
				if (count == X) {
					return i;
				}
			}
		}
		return -1;
	}
}
