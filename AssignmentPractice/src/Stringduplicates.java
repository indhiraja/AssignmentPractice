
public class Stringduplicates {
	 
	
	public static void main(String[] args) {
		
		String letters = "Indhira RajendraPrasad";  
	     int count;
	     char stringArr[] = letters.toCharArray();     
	     for(int i = 0; i <stringArr.length; i++) {  
	         count = 1;  
	         for(int j = i+1; j <stringArr.length; j++) {  
	             if(stringArr[i] == stringArr[j] && stringArr[i] != ' ') {  
	                 count++; 
	                 stringArr[j] = '0';  
	                }  
	            }   
	            if(count > 1 && stringArr[i] != '0')  
	                System.out.println(stringArr[i]); 
	            
	     }
}
}