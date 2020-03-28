package my.nmcuong.codility.time_complexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PermMissingElem {
	static public int solution(int[] A) {
		List<Integer> collect = Arrays.stream(A).boxed().collect(Collectors.toCollection(ArrayList::new));
		Collections.sort(collect);
		for (int i = 0; i < collect.size() - 1; i++) {
			if (collect.get(i + 1) - collect.get(i) > 1) {
				return collect.get(i) + 1;
			}
		}
		return -1; 
	}
}
