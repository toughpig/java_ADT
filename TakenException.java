package calculate;

@SuppressWarnings("serial")
public class TakenException extends Exception{
	public TakenException(){
		super("invalid taken");
	}
	public TakenException(String s){
		super(s);
	}

}
