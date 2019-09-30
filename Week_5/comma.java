import java.io.*;
import java.util.Scanner;
class comma
{
public static void main(String[] args)
{
String s;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter digits");
 s=sc.next();
 System.out.println(addcommas(s));
}

public static  String addcommas(String digits)
{
char ch;
//System.out.println(digits.length());
String result ="";
            int counter = 0;
            for (int i = digits.length()-1; i >= 0 ; i--)
            {
                 ch = digits.charAt(i);
                result = ch + result;
                counter++;
                if (counter % 3 == 0)
                {
                   result = "," + result;
              }
           }
  //         System.out.println(result);
            return result;
       
    }


}