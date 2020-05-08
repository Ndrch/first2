import javax.xml.parsers.FactoryConfigurationError;

public class Main {

	public static void main(String[] args) {
	System.out.println("Hello world!");
	System.out.println("поповни рахунок!");
	
	FirstClass f1 = new FirstClass();
	SecondClass s1 = new SecondClass();
	
	System.out.println(f1.getString("Nadia"));
	System.out.println("I am here");
	System.out.println(s1.getMassege("NAdia"));
	}
}
