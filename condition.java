import java.util.Scanner;
public class CW_ps_conditional {
    public static void main(String[] args) {
//        int a;
//        System.out.println("enter a number");
//        Scanner sc=new Scanner(System.in);
//        a= sc.nextInt();
//        switch (a){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6-> System.out.println("saturday");
//        }
//          int m1,m2,m3;
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the marks of physics");
//        m1= sc.nextInt();
//        System.out.println("enter the marks of chemistry");
//        m2= sc.nextInt();
//        System.out.println("enter the marks of maths");
//        m3= sc.nextInt();
//        float avg=(m1+m2+m3)/3.0f;
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("youre pass");
//        }
//            else {
//            System.out.println("fail");
//        }
        String a;
        Scanner sc=new Scanner(System.in);
        System.out.println(("enter your website name"));
        a = sc.next();
        if (a.endsWith(".org")){
            System.out.println("organizational website");
        } else if (a.endsWith(".in")) {
            System.out.println("indian website");
        }
        else{
            System.out.println("commercial website");
        }
    }
}
