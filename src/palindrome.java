import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class palindrome {
    public static void main(String[] args) throws ParseException {
        List<Integer> asdd = new ArrayList(){{
            add(1);
            add(5);
            add(3);
            add(2);
        }};
        System.out.println(asdd.get(0));

    }
    public static int getLongestPalindrome(final String s) {
        int left = 0, right = 0;
        int result = 1;

        if(s.length() != 1) {
            for (int center = 1; center < s.length() - 1; center++) {
                left = center - 1;
                right = center + 1;
                while (left >= 0 && right <= s.length() - 1) {
                    if (s.charAt(left) != s.charAt(right))
                        break;

                    result = right - left + 1 > result ? right - left + 1 : result;
                    left--;
                    right++;
                }
            }

            for (int center = 0; center <= s.length() - 2; center++) {
                left = center;
                right = center + 1;
                while (left >= 0 && right <= s.length() - 1) {
                    if (s.charAt(left) != s.charAt(right))
                        break;
                    result = right - left + 1 > result ? right - left + 1 : result;
                    left--;
                    right++;
                }
            }
        }

        return result;
    }


}
