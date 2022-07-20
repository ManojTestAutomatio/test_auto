package day2task;
import java.util.Scanner;
public class firstcap {
	public void cap(String s) {
		
		char[] c=s.toCharArray();
		boolean space=true;
		for(int i=0;i<c.length;i++) {
			if(Character.isLetter(c[i])) {
				if(space) {
		            c[i]=Character.toUpperCase(c[i]);
					space=false;
				}
			}else {
				space =true;
			}
		}
		
		System.out.print(c);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String s= sc.nextLine();
		firstcap ne= new firstcap();
		ne.cap(s);
		
		}
		
	
	}


