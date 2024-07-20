package string;
import java.util.*;

public class stringcore {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str="hello";
        System.out.println(str);
        System.out.println(str.length());
        char ch= str.charAt(2);
        System.out.println(str.indexOf("e"));
        System.out.println(ch);
        String gtr="bello";
        System.err.println(str.compareTo(gtr));
        String ptr="anshika singh";
        System.out.println(ptr.contains("shi"));
        System.out.println(ptr.endsWith("gh"));
        System.out.println(ptr.startsWith("ans"));
        System.out.println(ptr.toLowerCase());
        System.out.println(ptr.toUpperCase());
        String s1="anshika";
        String s2="mohit";
        System.out.println(s1.concat(s2));
    }
}
