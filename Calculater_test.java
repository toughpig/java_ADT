package calculate;

import java.io.Console;
import java.util.Queue;

public class Calculater_test {
	@SuppressWarnings({ "rawtypes", "unused" })
	private static Queue takens=null;
	@SuppressWarnings({ "rawtypes", "unchecked", "null" })
	static Queue takenize(String input) throws TakenException{
		Queue q=null;
		String taken=new String("");
		for(int i=0;i<=input.length();i++){
			char cc=input.charAt(i);
			if(!(TakenOperator.isValid(cc)))
				taken+=cc;
			else{
				if(!taken.trim().equals(""))
					q.add(new TakenNumeric(taken.trim()));
				Character operator=new Character(cc);
				q.add(new TakenOperator(operator.toString()));
				taken=new String("");
			}
		}
		if(!taken.trim().equals(""))
			q.add(new TakenNumeric(taken.trim()));
		return q;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
