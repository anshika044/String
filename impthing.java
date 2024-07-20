package string;
import java.util.*;

public class impthing {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str="abcd";
        // str += "xyz";
        // str +="r";
        // str += 10;
        System.out.println("abc"+ (10+10));
        System.out.println("abc"+"def");
        System.out.println("abc"+10+20);//pehle left to right perform hota hai
        System.out.println(10+20+"abs");

        //substring
        System.out.println(str.substring(0, 3));//end wale se ek kam ie abc
        System.out.println(str.substring(3));

        //ques
        String s="physics";
        for(int i=2; i<4;i++){
            System.out.println(s.substring(i));
        }
        System.out.println("ZZ");
        //question for substring
        for(int i=0; i<4; i++){
            for(int j=i+1; j<=4; j++){//ek kam count krta h tabhi 4 liya 
                System.out.println(str.substring(i, j));
            }
        }


        //interning
        String sp="hello";//space bachati h and ek hi hello hoga jisko dono point karenge
        String x="hello";
        x="mello";
        System.out.println(x);

        //immutability
        //you cannot change a particular string but can make new reference string
        String z="hello";
        z="mello";//simplly like this
        //or by doing this
        System.out.println(z.substring(0, 2)+ 'y' + z.substring(3));
        // to avoid interning coz if you make change in one string it'll change all the strings
        
        //equals to
        System.out.println(z.equals(x));//it checks the address and check all characters one by one
        
    }
    
}
