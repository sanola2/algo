package test;

public class regex {
    public static void main(String[] args) {
        String a = "aapple";
        String b = "apple22";
        String c = "2apple2";
        String d = "a2apple2";
        String e = "a2apple2a";
        String f = "a2apple";
        String g = "apple";
        String regex = "[^a-zA-Z]?apple[^a-zA-Z]?";
        String regex2 = "(?<![a-zA-Z])?apple(?![a-zA-Z])?";

        System.out.println("false여야함 " + a.matches(regex));
        System.out.println("true여야함 " + b.matches(regex));
        System.out.println("true여야함 " + c.matches(regex));
        System.out.println("true여야함 " + d.matches(regex));
        System.out.println("true여야함 " + e.matches(regex));
        System.out.println("true여야함 " + f.matches(regex));
        System.out.println("true여야함 " + g.matches(regex));
        System.out.println();

        System.out.println("false여야함 " + a.matches(regex2));
        System.out.println("true여야함 " + b.matches(regex2));
        System.out.println("true여야함 " + c.matches(regex2));
        System.out.println("true여야함 " + d.matches(regex2));
        System.out.println("true여야함 " + e.matches(regex2));
        System.out.println("true여야함 " + f.matches(regex2));
        System.out.println("true여야함 " + g.matches(regex2));
    }
}
