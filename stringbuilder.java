package string;
import java.util.*;
public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        str.append("world");//add any string or char
        System.out.println(str);
        str.setCharAt(0, 'm');//to change any character
        System.out.println(str);

        //insert
        str.insert(0, 'a');
        System.out.println(str);
        //deletecharat
        str.deleteCharAt(0);
        System.out.println(str);
        //reverse
        str.reverse();
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        //delete(i,j)
       str.delete(2, 5);
       System.out.println(str);
    }
    
    
}
