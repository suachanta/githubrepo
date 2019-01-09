package pkg1;

public class student 
{
int a;//this is a variable a----13,14,15


public void sudha()
{
	
	System.out.println("Welcome to selenium..Dear Sudha");
}
public int sum (int x1,int x2)
{
	int x3;
	x3 = x1+x2;
	return x3;
}
public int sub(int x1,int x2)
{
	int x3;
	x3=x1-x2;
	return x3;
}
public int mul(int x1,int x2)
{
	int x3;
	x3=x1*x2;
	return x3;
}

 public int div (int x1, int x2)
 {
	 int x3;
	 x3=x1/x2;
	 return x3;
 }

  public static void main(String[] args) {
	student s=new student();
	s.sudha();
	s.a=s.sum(10,2);
	System.out.println(s.a);
	System.out.println("Subtraction:");
	int a1 = s.sub(10,2);
	System.out.println(a1);
	System.out.println("multiplication");
	int a2 = s.mul(10,2);
	System.out.println(a2);
	System.out.println("divison");
	int a3 = s.div(10,2);
	System.out.println(a3);
	
			
}
}