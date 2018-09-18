// Brittanie Pham

package module1Test;

import java.util.ArrayList;

/**
 * This class runs the Module1Test
 * 
 * @author Brittanie Pham
 *
 */
public class Module1Test {
	/**
	 * main method to run the app
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * variable "birds" is an ArrayList of Strings
		 */
		ArrayList<String> birds = new ArrayList<String>();
		
		birds.add("parrot");
		birds.add("pigeon");
		birds.add("dove");
		birds.add("hummingbird");
		birds.add("owl");
		birds.add("albatross");
		birds.add("Penguin");
		birds.add("toucan");
		birds.add("crane");
		System.out.println("This is the birdString output \n" + birdString(birds));
		System.out.println("");
		System.out.println("This is the birdSB output \n" + birdSb(birds));
	}
	
	/**
	 * method named birdString that returns a String and takes in an ArrayList as a parameter
	 * @param birds arrayList passed in as a parameter to be used inside the method
	 * @return new String of each of the birds separated by a "-"
	 */
	public static String birdString(ArrayList<String> birds) {
		/**
		 * variable "result" is a new String
		 */
		String result = new String(); 
		/**
		 * variable i is used to increment a number to work as a conditional know when to end the string from the "if statement"
		 */
		int i = 0;
		
		for(String bird : birds) {
			if(i < birds.size() - 1) {
				result += bird;
				result += '-';
				i++;
			} else {
				result += bird;
			}
		}
		return new String(result); 
	}
	
	/**
	 * method named birdSb that returns a StringBuilder and takes in an ArrayList as a parameter
	 * @param birds arrayList passed in as a parameter to be used inside the method
	 * @return stringBuilder named sb that contains each of the birds separated by a "-"
	 */
	public static StringBuilder birdSb(ArrayList<String> birds) {
		/**
		 * variable sb is a new StringBuilder
		 */
		StringBuilder sb = new StringBuilder();
		
		/**
		 * variable i is used to increment a number to work as a conditional know when to end the string from the "if statement"
		 */
		int i = 0;
		for(String bird : birds) {
			if(i < birds.size() - 1) {
				sb.append(bird + "-");
				i++;
			} else {
				sb.append(bird);
			}
		}
		return sb;
	}
}
