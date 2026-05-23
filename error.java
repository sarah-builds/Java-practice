import java.util.Scanner;
class myexp extends Exception{
    @Override
    public String getMessage() {
        return "invalid number message";
    }
}
public class CW_ps_error {
    public static void main(String[] args) throws myexp{
//        prb 1
       try{
           int a=999/0; 
       }
       catch (ArithmeticException e){
           System.out.println("hahah");
       }
       catch (IllegalArgumentException e){
           System.out.println("heheh");
       }
//        prb2
        boolean flag=true;
        int[]mar=new int[5];
        mar[0]=5;
        mar[1]=55;
        mar[2]=52;
        mar[3]=53;
        Scanner sc=new Scanner(System.in);
        int i=0;
        while (flag && i<5){
            try {
                System.out.println("value of index");
                int ind = sc.nextInt();
               System.out.println("the marks is"+mar[ind]);
                break;
            }
            catch (Exception e){
                System.out.println("invalid index");
                i++;
            }
        }
        if (i>=5){
            throw new ArithmeticException();
        }

//        prb 3


    }
}
