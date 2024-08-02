// import java.io.*;
// import java.util.Scanner;
// public class stringreverse {
//     public static void main (String[] args) {
//         String nstr="";
//         char ch;
// 		Scanner scanner = new Scanner(System.in);
// 		String text = scanner.nextLine();
// 		char[] arr = text.toCharArray();
// 	for (int i=0; i<text.length(); i++)
// 	{
// 		ch= text.charAt(i); //extracts each character
// 		nstr= ch+nstr; //adds each character in front of the existing string
// 	}
// 	System.out.println(nstr);
// 	}
// }




// approach 2--------------------------------------------------------------------------
import java.io.*;
import java.util.Scanner;
public class stringreverse{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b="";
        int ptr=a.length()-1;
        while (ptr>=0){
            b=b+a.charAt(ptr);
            ptr--;
        }
        System.out.println(b);
    }
}
