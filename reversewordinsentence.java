package string;

public class reversewordinsentence {

    public static void main(String[] args) {
        String str="I am bob the builder";
        String ans=" ";
        StringBuilder sb= new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder("");//sb empty or delete
            }
        }
        System.out.println(sb);//builder reverse nhi hua
        sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
    
}
