import java.util.*;

class Factorials {
	static int f(int n) {
		if(n>=1) 
			return n*f(n-1);
		else 
			return 1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer to calculate its factorial:");
		int n=sc.nextInt();
		int res=f(n);//withargandreturn
		System.out.print(res);
		
  
	}

}
