package devops.b3.cicd;

public class Calculator 
{
        public int add(int a,int b)
        {
        	return a+b;
        }
        public int subtract(int a,int b)
        {
        	return a-b;
        }
	public static void main(String[] args)
	{
		Calculator Mycal = new Calculator();
		System.out.println(Mycal.add(20,10));
		System.out.println(Mycal.subtract(4,3));
	}

}
