
import java.util.Scanner;
public class Operators{
    
    public static void main(String[] args){
    int a = 0;
    int b = 0;
    int c = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter A: ");
    a = sc.nextInt();
    System.out.println("Enter B: ");
    b = sc.nextInt();
    System.out.println("Enter C: ");
    c= sc.nextInt();
    sc.close();
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    int resultMax = (a>b)?((a>c)?a:c):(b>c)? b:c;
    int resultMin = (a<b)?((a<c)?a:c):(b<c)? b:c;
    int resultMid = (a>b)?((a<c)?a:c):(b<c)? b:c;
    System.out.println("The high number is "+ resultMax);
    System.out.println("The smallest number is "+ resultMin);
    System.out.println("The middle number is "+ resultMid);
}
}