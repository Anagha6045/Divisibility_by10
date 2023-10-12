package sample_super_divisibility;


public class Check_divisibility extends Addition{
	

	public Check_divisibility()
	{
		addInputValues();
		divisibility(sum);
	}
	public static void main(String[] args) 
	{
		new Check_divisibility();
	}
	public void divisibility(double sum)
	{
		super.sum=sum;
		System.out.println("Sum is : "+sum);
		if(sum%10==0)
		{
			System.out.println("Sum is divisble by 10");
		}
		else
		System.out.println("Sum is not divisible by 10");
	}

}
