public class CW_recursion {
    static int factorial(int n){
       if(n==1 || n==0){
           return 1;
       }
       else {
           return n*factorial(n-1);
       }
        int mu=1;
        for (int i=1;i<=n;i++){
            mu *=i;
        }
        return mu;
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // base case
        } else if (n == 1) {
            return 1; // base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive case
        }
    }
    public static void main(String[] args) {
        System.out.println("factorial of 5 is " + factorial(5));
//        System.out.println("fibonacci of 5 is " + fibonacci(5));
    }
}
