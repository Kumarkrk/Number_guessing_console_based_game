import java.util.*;
public class NumberGuessing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int target=(int) (100*Math.random());
		System.out.println("welcome to number guessing game");
		while(true)
		{
			System.out.println("enter the guess number:");
			int guess=sc.nextInt();
			if(guess==target)
			{
				System.out.println("you entered the target number is"+target);
				break;
			}
			else if(guess<target)
			{
				System.out.println("entered number is smaller than the targeted value");
			}
			else
			{
				System.out.println("entered number is larger than the target value");
			}
		}
		sc.close();

	}

}
