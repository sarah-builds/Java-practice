public class CW_loop {
    public static void main(String[] args) {
       int a=0;
       do {
           System.out.println(a);
           a++;
       }while (a<=5);

       int b=0;
       while (b<=5){
           System.out.println(b);
           b++;
       } 
int n=5;
       for (int i=0;i<=n;i++){
           System.out.println(2*i+1);
       }
       for (int i=5;i>0;i--){
           System.out.println(i);
       }

       break & continue
       for (int i=0;i<=5;i++){
           System.out.println(i);
           if (i==2){
               System.out.println("ends here");
               break;
           }
       }
       i++;
           if (i==2){
               System.out.println("ends here");
               break;
           }
       }while (i<=5);

        for (int i=0;i<=5;i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(i);
        }


    }
}

//        int i=0;
//        do {
//            System.out.println(i);
