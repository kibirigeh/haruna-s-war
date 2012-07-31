import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution 
{

	/**
	 * @param args
	 */
	static TreeSet<String> S= new TreeSet<String>();
	static HashMap<BigInteger,String> answers=new HashMap<BigInteger,String>();
	static int N,Q,i;
	static String string;
   static  Iterator<String> value;
    
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		N=input.nextInt();
		for(i=0;i<N;i++)
		{
			string=input.next();
			process(string);
		}
		
		Q=input.nextInt();
		BigInteger query,queries[];
		queries=new BigInteger[Q];
		for(i=0;i<Q;i++)	
		{
			query=input.nextBigInteger();
			queries[i]=query;
			answers.put(query,"INVALID");
		}
		displayAnswers();
		for(i=0;i<Q;i++)
		{
			System.out.println(answers.get(queries[i])); 
		}
	}
	
	public static void process(String x)
	{
		int j,k,size=x.length();
		
		for (k = 0; k < size; k++) 
		{
            for (j = k; j < size; j++) 
            {
            	S.add(x.substring(k,j+1));
            }
		}
	}
	public static void displayAnswers()
	{
		value=S.iterator();
		int i=1;
		String answer;
		BigInteger key;
		for(i=1;i<=S.size();i++)
		{
			answer=value.next();
			key = new BigInteger(String.valueOf(i));
			if(answers.containsKey(key))
			{
				answers.put(key,answer);
			}
		}
	}
}
