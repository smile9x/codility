package my.nmcuong.codility.kbtg;

import java.util.Stack;

public class TaskOne {
	static public String solution(String S) {
        // write your code in Java SE 8
		String[] arrays = S.split("");
		Stack<String> stack = new Stack<String>();
		boolean caplock = false;
		for (int i = 0 ; i < arrays.length ; i ++) {
			if (arrays[i].equals("C")) {
				caplock = !caplock;
				continue;
			}
			if (arrays[i].equals("B")) {
				if (!stack.empty()) {
					stack.pop();
				}
				continue;
			}
			if (caplock == true) {
				stack.push(arrays[i].toUpperCase());
			} else {
				stack.push(arrays[i]);
			}
		}
		return String.join("", stack);
    }
}
