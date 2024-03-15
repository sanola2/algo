package programmers;

import java.util.HashMap;
import java.util.Map;

public class PaperStrip {
    public static int minPieces(int[] original, int[] desired) {
        Map<Integer, Integer> desiredPositions = new HashMap<>();
        for (int i = 0; i < desired.length; i++) {
            desiredPositions.put(desired[i], i);
        }

        int start = 0;
        int pieces = 0;
        while (start < original.length) {
            int originalNumber = original[start];
            int end = start + 1;
            int desiredPositionForOriginalNumber = desiredPositions.get(originalNumber) + 1;

            while (desiredPositionForOriginalNumber < desired.length && end < original.length && desired[desiredPositionForOriginalNumber] == original[end]) {
                desiredPositionForOriginalNumber++;
                end++;
            }

            pieces++;
            start = end;
        }

        /*int pieces = 0;
        int start = 0;
        while (start < original.length) {
            int end = start + 1;
            int expectedPosition = desiredPositions.get(desired[start]);

            // Find the continuous sequence of elements in desired sequence that are in their correct positions
            while (end < desired.length && desiredPositions.get(desired[end]) == expectedPosition + 1) {
                expectedPosition++;
                end++;
            }

            // Cut the strip if the sequence is not continuous
            if (end - start > 1) {
                pieces++;
            }

            start = end;
        }*/

        return pieces;
    }

    public static void main(String[] args) {
        int[] original = new int[]{1, 4, 3, 2};
        int[] desired = new int[]{1, 4, 3, 2};
        System.out.println(PaperStrip.minPieces(original, desired)); // Output: 3
    }
}