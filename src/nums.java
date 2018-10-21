import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class nums {
    public static void main(String[] args) {

    }

    public static void harshadNum() {
        int x = 10;
        System.out.println(x%String.valueOf(x).chars().map(Character::getNumericValue).sum()==0?true:false);

    }
    public void minmax() {
        int m=12, n=3;
        int max =1, min =0;
        int b = (m>n?m:n);
        int s = (m>n?n:m);

        for(int i=2; i<= s; i++) {
            if(n%i==0 && m%i==0 && i>max){
                max = i;
            }
        }

        min = (m*n)/max;
        System.out.println(max + " " + min);
    }

    public void longToString() {
        long n = 118372;
        String temp = String.valueOf(n);
        int[] intArray = temp.chars().sorted().map(Character::getNumericValue).toArray();
        String result = "";

        for(int i=0; i< intArray.length; i++) {
            result += String.valueOf(intArray[intArray.length-1-i]);
        }
        System.out.println(Long.valueOf(result));
    }

    public void reverseNumToArray() {
        long n = 12345;
        StringBuffer temp = new StringBuffer(String.valueOf(n));

        temp.reverse().chars().map(Character::getNumericValue).toArray();
    }

    public void eachNumIntSum() {
        int n = 123;

        String temp = String.valueOf(n);
        Integer a = temp.chars().map(Character::getNumericValue).sum();

        int h = '1';
        System.out.println(h);
        System.out.println(a);
    }
}
