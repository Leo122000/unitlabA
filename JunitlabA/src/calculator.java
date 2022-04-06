
public class calculator { 
	
	int num1,num2;
	String strConnectString;
	
	
	calculator(int num1, int num2)
	{
		System.out.println("In the constructor");
		this.num1 = num1;
		this.num2 = num2;
		
	}
	int Add()
	{
		System.out.println("In the Addition method");
		return num1+num2;
	}
	
	int Subtract()
	{
		System.out.println("In the Subtract method");
		return num1 - num2;
		
	}
	int Divide()
	{
		System.out.println("In the Divide method");
		return num1/num2;
		
	}
	int Multiply()
	{
		System.out.println("In the Multiply mehtod");
		return num1 * num2;
		
	}
	boolean validate()
	{
		System.out.println("In the Validate method ");
		if(num1 >0 && num2>0)
			return true;
		else
			return false;
		
	}
	void ReleaseObject()
	{
		System.out.println("Release object");
	}
	void OpenDBcConnection()
	{
		System.out.println("Open Database connection");
	}
	void closeDBcConnection()
	{
		System.out.println("Close Database connection");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
