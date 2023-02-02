package oops;
import java.util.HashMap;

public class Task6 {
	public static void main(String[] args) 
	   {  
	      String input = "Epam Systems Pvt Ltd";  
	      int count;  
	      char string[] = input.toCharArray();  
	      System.out.println("Duplicate characters in the string: ");  
	      for(int i = 0; i <string.length; i++) 
	      {  
	          count = 1;  
	          for(int j = i+1; j <string.length; j++) 
	          {  
	              if(string[i] == string[j] && string[i] != ' ') 
	              {  
	                  count++;    
	                  string[j] = '0';  
	              }  
	          }  
	          if(count > 1 && string[i] != '0')  
	              System.out.println(string[i]);  
	      }  
	  }  
}

