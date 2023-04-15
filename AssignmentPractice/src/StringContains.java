
public class StringContains {
	public static boolean testdigits(String digit_string) {
	       for (int i = 0; i < digit_string.length(); i++) {
	           if (!Character.isDigit(digit_string.charAt(i))) {
	               return false;
	           }
	       }
	       return true;
	   }

	public static void main(String[] args) {
		String digitStg = "12345324rtyh";
        String digits = "54321456";
        System.out.println("First string:");
       System.out.println(digitStg);
       boolean result1 = testdigits(digitStg);
        System.out.println(result1);
        System.out.println("Second string:");
       System.out.println(digits);
        boolean result2 = testdigits(digits);
        System.out.println(result2);                                
 }
     
}