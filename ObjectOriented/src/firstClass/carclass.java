package firstClass;

public class carclass {
	public String menufactName;
	public int engCC;
	public double fuel;
	private String passward;
	
	public carclass(){
		menufactName = new String("TOYOTA");
		engCC = 1200;
		fuel = 30.0;
	}
	public carclass(String name,int engCC,double fuel){
		menufactName = name;
		this.engCC = engCC;
		this.fuel = fuel;

	}
	
	public double amountfuel(){
		return fuel;
	}
	public boolean passMatch(String pass){
		return passward.equals(pass);
	}
	
}
