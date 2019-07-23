package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double d, double d1) throws IllegalArgumentException {
		
		
		
		double dd= d/d1;
		if (d1==0.0) {
			throw new  IllegalArgumentException();
			
			
		}
		return dd;
		
		
	}
	
	
	
	public String    reverse(String s) throws IllegalStateException{
		
		if(s.isEmpty()) {
			
			throw new IllegalStateException();
		}
		
		String output= "";
		for(int i=s.length()-1; i>-1;i--) {
			
		output += s.charAt(i);
			
		}
		
		
		return output;	
		
	
	
	}
}
