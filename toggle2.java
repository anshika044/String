package string;
import java.util.*;
public class toggle2 {
    //without string builder appraoch
    //poor performance code

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);

        //code
        for(int i=0; i<str.length(); i++){
            //check small or captial
            //we assume if its capital
            boolean flag=true;//capital
            char ch = str.charAt(i);//A
            int asci=(int) ch;//value 65
            if(asci>=97)flag=false;//small
            if(flag==true){
                asci+=32;
                char dh=(char)asci;
                str= str.substring(0, i)+ dh + str.substring(i+1);
            }else{
                asci-=32;
                char dh=(char)asci;
                str= str.substring(0, i)+ dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
    
}
