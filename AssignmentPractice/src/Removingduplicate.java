
public class Removingduplicate {
public static void main(String[] args) {
		                String str = "indhira rajendraprasad";
				        String result = "";
				        
				        for (int i = 0; i < str.length(); i++) {
				            char c = str.charAt(i);
				            if (result.indexOf(c) < 0) {
				                result += c;
				            }
				        }
				        
				        System.out.println(result);
				    }
				

			}
	


