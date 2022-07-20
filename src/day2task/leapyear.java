package day2task;
import java.util.Scanner;
public class leapyear {
   public void leap(int n) { 
	   if((n%4==0) && (n%100 !=0) ||(n%400==0) ) {
		   System.out.print(n +" is leap year");
	   }else {
		   System.out.print(n +" is not leap year");
	   }
   }
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   int m=sc.nextInt();
	   leapyear nw= new leapyear();
	   nw.leap(m);
   }
}
