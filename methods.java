public class CW_methods{
     int logic(int x,int y){
        int z;
        if(x>y){
            z=x+y;
        }
        else {
             z=(x+y)*5;
        }

        return z;
    }
    public static void main(String[] args) {
//        logic(5,6);
        CW_methods obj=new CW_methods();
//        2 method

int a=5;
int b=7;
int c=obj.logic(a,b);
        System.out.println(c);

int a1=2;
int b1=1;
int c1=obj.logic(a1,b1);
        System.out.println(c1);

    }
}
