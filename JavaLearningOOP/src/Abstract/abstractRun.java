package Abstract;

public class abstractRun {

	public static void main(String[] args) {
		
		
		abstractsub ab = new abstractsub();
		
		ab.getfirstName();
		
		ab.firstName="Tom";
		
		System.out.println(ab.firstName);
		
		ab.getaddress();

	}

}
