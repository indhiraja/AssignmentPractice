
public class Characterrepeats {
	
	  public static void RepeatStrings(String saw)
	  {
	    for (int i = 0; i < saw.length(); i++) {	 
	      if (saw.indexOf(saw.charAt(i), saw.indexOf(saw.charAt(i)) + 1) == -1) {
	        System.out.println("First non-repeating character is: "+ saw.charAt(i));
	        break;
	      }
	    }
	    return;
	  }
	  public static void main (String[] args) {
	    String charc = "All is well";
	    RepeatStrings(charc);
	  }
	}

	


