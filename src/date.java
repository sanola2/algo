import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class date {
    public static void main(String[] args) {

    }
    static String timeConversion(String s) {
        String result = "";
        SimpleDateFormat simple = new SimpleDateFormat("hh:mm:ssa", Locale.ENGLISH);
        SimpleDateFormat simple2 = new SimpleDateFormat("HH:mm:ss");

        try {
            Date date = simple.parse(s);
            result = simple2.format(date);
        } catch (Exception e){

        }
        return result;
    }
}
