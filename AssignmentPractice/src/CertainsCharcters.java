
public class CertainsCharcters {
	
	 public static int counts(String stg, char ch)
	    {
	        int gtval = 0;
	 
	        for (int i=0; i<stg.length(); i++)
	        {
	            if (stg.charAt(i) == ch)
	            	gtval++;
	        }
	        return gtval;
	    }

	    public static void main(String args[])
	    {
	        String strg= "Indhiraja";
	        char charc = 'e';
	        System.out.println(counts(strg, charc));
	    }
	}