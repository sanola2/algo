import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class invoke {
    public static void main(String[] args) {
        haha a = new haha();
        Method method = null;
        try {
            method = Class.forName("haha").getMethod("a", String.class);
        } catch (Exception e) {

        }
        System.out.println(method);
        int[] ww = new int[] {1,2,3,4,5};
        Arrays.stream(ww).map(x->x+1).toArray();

        try {
            method.invoke(a, "asaads");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //  a.a("asd");
    }
}

class haha {
    public void a(String h) {
        a(null, h);
    }
    public void a(List a, String h) {
      //  if(a != null && a.size() > 0)
            System.out.println(h +a);
    }
}