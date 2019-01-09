package pkg2;

public class teacher 
{
	
		public void table(int b)
		{
			for (int i=1;i<=20;i++)
			{
				int c = mul(b,i); 
				System.out.println(b+"x"+i+"="+c);
			}
		}
		public int mul(int x1,int x2)
		{
			int x3;
			x3=x1*x2;
			return x3;
		}		
		public static void main(String[] args)
		{
			teacher t = new teacher();
			t.table(15);
		}
		
		
	    

}
