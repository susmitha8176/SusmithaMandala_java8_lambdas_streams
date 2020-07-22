package epam.hometask9;
import java.util.*;
public class FindAverage {
	interface average
	{
		public float avg();
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		average aveg = ()->{
			System.out.println("Enter the number of elements:");
			int n = sc.nextInt();
			ArrayList<Integer> arrlist=new ArrayList<Integer>();
			System.out.println("Enter the elements:");
			for(int i=0;i<n;i++)
			{
				arrlist.add(sc.nextInt());
			}
			int sum=0;
			for(Integer i:arrlist)
			{
				sum+=i;
			}
			float TotalAverage=(float)(sum)/arrlist.size();
			return TotalAverage;
		};
		System.out.println("Average of the list:"+aveg.avg());
		sc.close();
	}

}