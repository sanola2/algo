package programmers.ct;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        int[] numbers1 = {0, 1, 1};
        int[] numbers2 = {4, 5, 11};
        int[] result1 = solution(numbers1);
        int[] result2 = solution(numbers2);
        System.out.println(Arrays.toString(result1)); // [8, 1, 6]
        System.out.println(Arrays.toString(result2)); // [5, 4, 11]
    }

    public static int[] solution(int[] numbers) {
        String[] numberWords = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        Map<String, Integer> wordNumberMap = new HashMap<>();
        List<String> sortedNumbers = new ArrayList<>();

        for (int num : numbers) {
            String english = convertToEnglish(num, numberWords);
            wordNumberMap.put(english, num);
            sortedNumbers.add(english);
        }
        Collections.sort(sortedNumbers);

        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = wordNumberMap.get(sortedNumbers.get(i));
        }

        return result;
    }

    public static String convertToEnglish(int number, String[] numberWords) {
        StringBuilder english = new StringBuilder();
        for (char c : String.valueOf(number).toCharArray()) {
            english.append(numberWords[c - '0']);
        }
        return english.toString();
    }
}
