package string;
import java.util.*;
public class ispalindrome {

    public static void main(String[] args) {
         String str="abcdyba";//string
        // StringBuilder gtr= new StringBuilder(str);//we can add string to stringbuilder but not viceversa
        // gtr.reverse();
        // //coverting gtr into string
        // String s = gtr+" ";//hack for string and stringbuilder 
        // if(str.equals(s)){
        //     System.out.println("palindrome");
        // }else{
        //     System.out.println("not palindrome");
        // }
     

        //two pointer approach
        int i=0;
        int j=str.length()-1;
        boolean flag=true;//true=palindrome
        while(i<j){
        if(str.charAt(i)!=str.charAt(j)){
           flag=false;
            break;
        }
        i++;
        j--;
    }
    if(flag==true){
        System.out.println("palindrome");
    }else{
        System.out.println("not palindrome");
    }
        
    

        
    }
    
}

