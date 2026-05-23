public class CW_ps_arr {
    public static void main(String[] args) {
//        problem 1
       float []marks= {40.f,45.2f,85.27f};
       float sum=0;
       for (float element:marks){
           sum=sum+element;
       }
       System.out.println(sum);

//        problem 2
       float []marks= {40.f,45.2f,85.27f};
       System.out.println("enter the number");
       Scanner sc=new Scanner(System.in);
       float num= sc.nextFloat();
//        float num=45.2f;
       boolean isinarray=false;
       for (float element:marks){
           if (num==element){
               isinarray =true;
               break;
           }
       }
       if (isinarray){
           System.out.println("present");
       }
       else {
           System.out.println("absent");
       }
 // problem 3
       float []marks= {40.f,45.2f,85.27f};
       float sum=0;
       for (float element:marks){
           sum=sum+element;
       }
       System.out.println(sum/ marks.length);

//        problem 5
       int [] arr={1,5,9,6,7};
       int l= arr.length;
       int temp;
       int n=Math.floorDiv(l,2);
       for (int i=0;i<n;i++){
  for (int i=0;i<n;i++){
           temp=arr[i];
           arr[i]=arr[l-1-i];
           arr[l-1-i]=temp;
       }
       for (int element:arr){
           System.out.println(element);
       }

//        problem 6
       int[]arr={44,58,65,98,105};
       int max=0;
       for (int e:arr){
           if(e>max) {
               max = e;
           }
       }
       System.out.println(max);

//        problem 7
       int[]arr={44,58,65,98,105};
       int min=Integer.MAX_VALUE;
       for (int e:arr){
           if (e<min){
               min=e;
           }
       }
       System.out.println(min);

    // problem 8
       int[]arr={44,5,65,98,105};
       boolean issorted=true;
       for (int i=0;i<arr.length-1;i++){
           if (arr[i]>arr[i+1]) {
               issorted=false;
               break;
           }
       }
if (issorted){
   System.out.println("sorted");
}
else {
   System.out.println("not sorted");
}
    }
}
