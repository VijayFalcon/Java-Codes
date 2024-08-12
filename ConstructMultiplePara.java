package ConstructMultiplePara;

public class ConstructMultiplePara 
{
	int modelYear;
	String modelName;
	double HP;
	String owner;
	public ConstructMultiplePara(int year,String name,double HP,String owner) {
		modelYear = year;
		modelName = name;
		this.HP = HP;
		this.owner = owner;
	}
	public static void main(String[] args) {
		int y = 1969;
		String n = "Dodge Charger R/T";
		String o = "Dominic Toretto";
		double HP = 950;
		ConstructMultiplePara c = new ConstructMultiplePara(y,n,HP,o);
		System.out.println(c.modelYear+" "+c.modelName);
		System.out.println("Owned by: "+c.owner+"\nDetroit V8 producing "+c.HP+" horsepower");
	}
}

