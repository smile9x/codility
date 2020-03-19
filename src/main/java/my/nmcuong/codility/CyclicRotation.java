package my.nmcuong.codility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {
	public static int[] solution(int[] A, int K) {
		List<Integer> collect = Arrays.stream(A).boxed().collect(Collectors.toList());
		Collections.rotate(collect, K);
		int[] result = collect.stream().mapToInt(i -> i).toArray();
		return result;
	}
}
