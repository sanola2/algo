package naverweb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class p2 {
	public static void main(String[] args) {
		System.out.println(solution("abcxyasdfasdfxyabc"));
		System.out.println(solution("abcxyqwertyxyabc"));
		System.out.println(solution("abcabcabcabc"));
		System.out.println(solution("llttaattll"));
		System.out.println(solution("zzzzzz"));
		System.out.println(solution("abcdef"));
	}

	public static String[] solution(String s) {
		char[] str = s.toCharArray();
		List<String> frontStrs = new ArrayList<>();
		List<String> backStrs = new ArrayList<>();
		List<String> middleStrs = new ArrayList<>();

		StringBuffer frontStr = new StringBuffer();
		StringBuffer backStr = new StringBuffer();
		while (!String.valueOf(str).equals("")) {
			for (int i = 0; i < str.length / 2; i++) {
				frontStr.append(str[i]);
				backStr.insert(0, str[str.length - 1 - i]);

				if (frontStr.toString().equals(backStr.toString())) {
					frontStrs.add(frontStr.toString());
					backStrs.add(backStr.toString());

					frontStr = new StringBuffer();
					backStr = new StringBuffer();
					str = Arrays.copyOfRange(str, i + 1, str.length - 1 - i);
					i = -1;
				}
			}

			String middleValue = String.valueOf(str);
			if (!middleValue.equals("")) {
				middleStrs.add(String.valueOf(str));
			}
			str = new char[]{};
		}

		frontStrs.addAll(middleStrs);

		for (int i = 0; i < backStrs.size(); i++) {
			frontStrs.add(backStrs.get(backStrs.size() - 1 - i));
		}
		return frontStrs.toArray(new String[0]);
	}
}
