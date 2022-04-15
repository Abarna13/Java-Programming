
public class Logical_Operators {

	public static void main(String[] args)
	{
		
		int a = 5, b = 3;
		
		//AND Operator - &&
	    System.out.println((a > b) && (a > b));  
	    System.out.println((a > b) && (a < b));
	    
	    //OR Operator - ||
	    
	    System.out.println((a < b) || (a > b));  
	    System.out.println((a > b) || (a < b));  
	    System.out.println((a < b) || (a < b)); 
	    
	   //NOT Operator - !
	    System.out.println(!(a == b)); 
	    System.out.println(!(a > b));  
	   
		

	}

}
