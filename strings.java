import java.sql.DataTruncation;

public class CW_strings {
    public static void main(String[] args) {
        String name="Sarah";
        
       int value=name.length();
       System.out.println(value);

       String lstr = name.toLowerCase();
       System.out.println(lstr);

       String up = name.toUpperCase();
       System.out.println(up);

       String me ="     sarah    ";
       System.out.println(me);
       String you=me.trim();
       System.out.println(you);
       System.out.println(name.substring(2 , 4));
       System.out.println(name.replace('a' , 'p'));
       System.out.println(name.replace("ara" , "para"));
       System.out.println(name.startsWith("Sa"));
       System.out.println(name.charAt(2));
       System.out.println(name.indexOf("Sa"));   gives index of first occurance
        String modified= "harryrry";
//        System.out.println(modified.indexOf("rry" , 4));  start giving index of given number
//        System.out.println(modified.lastIndexOf("rry"));   gives index of last occurance
//        System.out.println(name.equals("Sarah"));
//        System.out.println(name.equalsIgnoreCase("sarah"));   ignore type of case

    }
}
