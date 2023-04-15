
public class Removingwhitespaces {

	public static void main(String[] args) {
		        String indhira = "This is a simple program with white spaces";
		        String mohana = removeWhitespace(indhira);
		        System.out.println("Enter the string: " + indhira);
		        System.out.println("output: " + mohana);
		    }

		    public static String removeWhitespace(String indhira) {
		        // Using regular expression to match and replace all white spaces
		        String mohana = indhira.replaceAll("\\s", "");
		        return mohana;
		    }
		}

	


