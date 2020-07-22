package epam.hometask9;
import java.util.*;
import java.util.stream.Collectors;
public class Letters {
	interface aletter
	{
		public List<String> search();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			aletter l = ()->{
				System.out.println("Enter the no.of strings to be entered:");
				int n = sc.nextInt();
				System.out.println("Strings to be added in List");
				List<String> alist = new ArrayList<>();
				for(int i=0;i<n;i++)
					alist.add(sc.next());
				return alist.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
			};
			System.out.println("Strings starting with 'a'letter and of size 3:"+l.search());
	}

}