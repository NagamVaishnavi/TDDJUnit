import java.util.ArrayList;
public class Task {
	public static void main(String args[]) 
	{
		ArrayList<String> h = new ArrayList<String>();
		
		h.add("ABCD");
		h.add("AACD");
		h.add("BACD");
		h.add("AABAA");
		h.add("BBAA");
		
		
		System.out.println(h);
		
		
		for(String s:h)
		{
			int n=s.length();
			String res="";
			String r=s.substring(2,n);
			String p=s.substring(0,2);
			
			res=p.replace("A","");
			
			System.out.println(res+r);
			
			
		}
		
		
		
	}
	

}