package epam.hometask9;
import java.util.*;
public class CheckPalindrome {
	interface Palindrome{
			public List<String> pallist();
		}
		public static boolean check(String s)
		{
			int low = 0;
			int high = s.length() - 1;
			while (high > low) {
			    if (s.charAt(low) != s.charAt(high)) {
			        return false;
			    }
			    ++low;
			    --high;
			}
			return true;
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Palindrome p = ()->{
			System.out.println("Enter the number of Strings:");
			int n = sc.nextInt();
			List<String> strings = new ArrayList<>();
			System.out.println("Ask strings to be added");
			for(int i=0;i<n;i++)
			{
				strings.add(sc.next());
			}
			List<String> res=new ArrayList<>();
			for(int i=0;i<strings.size();i++)
			{
				String x=strings.get(i);
				if(check(x)==true)
					res.add(x);
			}
			return res;
		  };
		  System.out.println("Palindrome are:" +p.pallist());
		}
}
