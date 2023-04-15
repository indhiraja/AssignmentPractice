
public class Findingthecharacter {

	public static void main(String[] args) {
	
				String str = "temple1234";
				System.out.println(str);
				System.out.println(str.length());
				System.out.println("char = "+str);
				String digit="";
				
				for (int i = 0; i < str.length(); i++) {
					char ch = str.charAt(i);
					if (ch >= 48 && ch <= 57) {
						digit+=ch;
					}
				}
				System.out.println(digit);
				System.out.println(digit.length());
					//System.out.println(digit);
					if (digit.length()==str.length())
						System.out.println("String contains digits only");
					else
						System.out.println("String contains all unicode characters");
				
			}


			

	}


