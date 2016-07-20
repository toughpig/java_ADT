package calculate;

public class TakenNumeric {
	private double num=0.0;
	public TakenNumeric(double num){
		this.num=num;
	}
	public TakenNumeric(String s){
		try{
			num=Double.valueOf(s).doubleValue();
		}catch(NumberFormatException e){
			try {
				throw new TakenException("Invalid number format:"+s);
			} catch (TakenException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	public double getNumber(){
		return num;
	}
	public String toString(){
		return String.valueOf(num);
	}

}
