package firstClass;
// this is main CLASS

public class Learning_Class {
	static private carclass ourCar,ourAnother;
	public static void main(String[] args) {
		ourCar = new carclass("TOYOTA",1200,30.0);
		
		ourAnother = new carclass("Aoudi",2500,300.0);
		
		System.out.println("Manufacturer Name : "+ourCar.menufactName);
		System.out.println("EngCC : "+ourCar.engCC);
		System.out.println("Fuel : "+ourCar.fuel);
		
		System.out.println("   Our Sencond Card   ");
		
		System.out.println("Manufacturer Name : "+ourAnother.menufactName);
		System.out.println("EngCC : "+ourAnother.engCC);
		System.out.println("Fuel : "+ourAnother.fuel);
		
		Subcar OurSubcar= new Subcar("Mazda",2400,40,100,"BLACK");
		
		System.out.println("\n Our SubCar ");
		
		System.out.println("Manufacturer Name : "+OurSubcar.menufactName);
		System.out.println("EngCC : "+OurSubcar.engCC);
		System.out.println("Fuel : "+OurSubcar.fuel);
		System.out.println("Charge : "+OurSubcar.chargeBettery);
		System.out.println("Fuel : "+OurSubcar.Color);
		
	}

}
