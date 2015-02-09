/**
 * Project Euler assorted problems 
 * @author Parthk
 *
 */
public class ProjectEuler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Method 1: " + firstQuestion());
		System.out.println("Method 2: " + evenFib());
		//System.out.println("Method 4: " + smallestMultiple());
		//System.out.println("Method 5: " + highestPalindrome());
		//System.out.println("Method 6: " + collatzSequence());
//hello world

	}
	
	public static int firstQuestion(){
		int sum = 0;
		for(int i=2; i< 998; i++){
			if (i%3 == 0 || i%5 ==0)
				sum+= i;
		}
		return sum;
	}
	
	public static int evenFib()
	{
		int sum = 0;
		int next = 1;
		int last = 1;
		int temporary = 0; 
		while (next < 4000000) {
			temporary = next;
			next = next + last;
			last = temporary;
		    if (next % 2 == 0) 
				sum += next;
			
		}
		return sum;
	}
	
	////public static long largestPrimeFactor()
	//{
		//long number = 600851475143;
		//int currentD = 2;
		//int largestD = 0;
		//if (number % currentD == 0)
		//{
		//	number = number/ currentD;
		//	largestD = currentD;
		//}
	//}
	
	public static int smallestMultiple()
	{
		int num = 2520;
		int count = 0;
		boolean correctNumber = false;
		while (correctNumber == false)
		{
			for(int i = 1; i< 21; i++)
			{
				if(num % i == 0)
				{
					count++;
				}
			}
			if (count != 20)
			{
				correctNumber = false;
				count = 0;
				num++;
			}
			else{
				correctNumber = true;
			}
		}
		return num;
	}
	
	public static int highestPalindrome()
	{
		int fin = 0;
		int numm = 998001;
		int dig = 0;
		int n = 0;
		int rev = 0;
		int num = 0;
		boolean isPalindrome = false;
		while (isPalindrome == false)
		{
			n = numm;
			rev = 0;
			while (num > 0)
			{
			     dig = num % 10;
			     rev = rev * 10 + dig;
			     num = num / 10;
			}
			if (num == numm)
			{
				isPalindrome = true;
			}
			else{
				numm--;
			}
		}
		return numm;
//		for (int i = 100; i < 1000; i++)
//		{
//			if (numm % i == 0)
//				fin = numm;
//		}
//		return fin;
	}
	
	public static int highestPalindrome()
	{
		int maxNum = 998001;
		for (int i = maxNum; i > 10000; i--)
		{
			String str = i.toString();
			
		}
				
	}
	
	public static int collatzSequence()
	{
		int max = 0;
		int maxN = 0;
		for (int i = 100000; i < 1000000; i++)
		{
			int count = 0;
			int temp= i;
			while (temp != 1)
			{
				if (temp % 2 == 0)
				{
					temp = temp/2;
				}
				else{
					temp = 2*temp + 1;
				}
				count++;
			}
			if (count > max){
				max = count;
				maxN = i;
			}
		}
		return maxN;
	}
	
}
