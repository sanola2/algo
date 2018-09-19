package test;

public class regex {
    public static void main(String[] args) {
        String a = "Muziiasdasd";
        String b = "Muzi@asdas";
        String c = "s";
        String d = "muzi";
        String e = "qm1@muzi@2iai";
        a = a.toLowerCase();
        b = b.toLowerCase();

        System.out.println(a.matches("^muzi*"));
        System.out.println(b.matches("^[muzi]"));
        System.out.println(c.matches("^[0-9]*$"));
       // System.out.println(d.matches("^[[^a-zA-Z](muzi)[^a-zA-Z]]*$"));
        System.out.println(e.matches("^([^a-zA-Z]*)muzi([^a-zA-Z]*)"));
        System.out.println();
        System.out.println(a.toLowerCase().contains("Muzi".toLowerCase()));
        System.out.println(b.toLowerCase().contains("Muzi".toLowerCase()));
    }
}
