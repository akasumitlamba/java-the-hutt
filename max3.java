import java.util.Scanner;
public class max3{
    public static void main(String[] args) {
        int k;
        Scanner sc=new Scanner(System.in); //object is created
        System.out.println("enter 3 number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
//    if (a>b){
//        if (a>c){
//            k=a;
//        } else
//            k=c;
//    }
//    else{
//        if(b>c){
//            k=b;
//        }
//        else{
//            k=c
//        }

        k=a>b?a>c?a:c:b>c?b:c;
        System.out.println("greatest is "+k);
    }
}
