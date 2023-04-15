
public class Joiningmultiplestrings {

	public static void main(String[] args) {

		        String[] strings = {"Hello", "World", "Java", "Program"};
		        String delimiter = " ";
		        String joinedString = joinStrings(strings, delimiter);
		        System.out.println("Joined String: " + joinedString);
		    }

		   public static String joinStrings(String[] strings, String delimiter) {
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < strings.length; i++) {
		            sb.append(strings[i]);
		            if (i < strings.length - 1) {
		                sb.append(delimiter);
		            }
		        }
		        return sb.toString();
		    }
		}
	

