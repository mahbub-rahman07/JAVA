package firstClass;

public class Subcar extends carclass { // by extends inheriting carclass
	public double chargeBettery;
	public String Color;
	public Subcar(){
		super();
	}
	public Subcar(String name,int engCC,double fuel,double charge,String Color){
		super(name,engCC,fuel); // assining inherited subcar 
		chargeBettery = charge;
		this.Color = Color;
	}
	
	
	public double getChargeBettery() {
		return chargeBettery;
	}
	public void setChargeBettery(double chargeBettery) {
		this.chargeBettery = chargeBettery;
	}


	public String getColor() {
		return Color;
	}


	public void setColor(String color) {
		Color = color;
	}
}
