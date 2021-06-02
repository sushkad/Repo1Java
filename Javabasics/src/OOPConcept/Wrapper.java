package OOPConcept;

public class Wrapper {

	public static void main(String[] args) {

		//Data conversion

		String x = "100" ;
		//System.out.println(x+20);

		//Data Conversion :String to Int
		int i = Integer.parseInt(x);
		System.out.println(i+20);

		//Integer,Double,Character,Boolean

		//String to Double
		String s = "12.13";

		double d = Double.parseDouble(s);
		System.out.println(d+10);

		//String to Boolean

		String v = "True";
		Boolean b = Boolean.parseBoolean(v);
		System.out.println(b);

		//int to String Conversion

		int j = 200;
		System.out.println(j+20);

		String h = String.valueOf(j);
		System.out.println(h+20); 

		//Qn. Convert String to Integer

		String u = "100A";

		int o = Integer.parseInt(u);  // give you NumberFormat Exception for inupt string

	}

}
