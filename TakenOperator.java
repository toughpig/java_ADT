package calculate;

public class TakenOperator {
	private static String OPERATORS="+-*/^()";
	private String taken;
	public TakenOperator(String str) throws TakenException{
		if (OPERATORS.indexOf(str)>=0)
			taken=str;
		else
			throw new TakenException("Invalid operator:"+str);
	}
	public static boolean isValid(char op){
		return(OPERATORS.indexOf(op)>=0);
	}
	public String toString(){
		return "operator:"+taken;
	}
	

}
