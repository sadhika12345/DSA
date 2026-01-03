import java.util.*;

class Solution{
    public static String mergeAlternately(String word1, String word2)
    {
        String ans="";
		String ss="";
		
		if(word1.length()==word2.length())
		{
			for(int i=0;i<word2.length();i++)
				ans=ans+word1.charAt(i)+word2.charAt(i);     
		}
        else
		{
			if(word1.length()<word2.length())
			{
				for(int i=0;i<word1.length();i++)
				ans=ans+word1.charAt(i)+word2.charAt(i);
				ss=word2.substring(word1.length());
				ans+=ss;
			}
			else
			{
				for(int i=0;i<word2.length();i++)
				ans=ans+word1.charAt(i)+word2.charAt(i);
				ss=word1.substring(word2.length());
				ans+=ss;
			}
			
		}
		return ans;
        
    }
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String w1=s.nextLine();
		String w2=s.nextLine();
		System.out.println(mergeAlternately(w1,w2));
	}
}