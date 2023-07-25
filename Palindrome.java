import java.util.Scanner;
public class Palindrome {
	Scanner sc;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k,c,n,rev=0;
		System.out.println("enter no to check=");
		n=sc.nextInt();
		k=n;
		do {
			c=k%10;
			rev=(rev*10)+c;
			k=k/10;
		
			
		}
		while(k!=0);
		if(n==rev)
			System.out.println("number is palindrome");
		else
			System.out.println("not palindrome");
		sc.close();
	}

}



