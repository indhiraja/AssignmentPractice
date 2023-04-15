
public class Vowels {

	public static void main(String[] args) {

  
        int num = 0, numm = 0;  
        String strng = "I am indhiraja";  
        strng = strng.toLowerCase();  
          
      for(int i = 0; i < strng.length(); i++) {  
  
       if(strng.charAt(i) == 'a' || strng.charAt(i) == 'e' || strng.charAt(i) == 'i' || strng.charAt(i) == 'o' || strng.charAt(i) =='u') {  

            	num++;  
            }   
            else if(strng.charAt(i) >= 'a' && strng.charAt(i)<='z') {    
           
            	numm++;  
            }  
        }  
        System.out.println("Number of vowels: " + num);  
        System.out.println("Number of consonants: " + numm);  
    }  
}  