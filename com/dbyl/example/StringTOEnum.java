package com.dbyl.example;

public class StringTOEnum {

	public enum Color{    
	    RED,BLUE,BLACK,YELLOW,GREEN    
	}  
	
	public static void main(String[] args) {

	            Color color = Color.BLACK;  
	              
	            System.out.println(color);  
	            System.out.println(color.ordinal()); //用于枚举 转int  
	              
	            int i= color.compareTo(Color.RED);  // Black 和 Red 的顺序之差  
	              
	            System.out.println("Black 和 Red 的顺序之差:"+i);  
	              
	            color = Enum.valueOf(Color.class,"YELLOW"); //String 转枚举  
	                      
	            System.out.println(color);  
	            System.out.println(color.ordinal());  
	              
	            //遍历枚举  
	            for(Color c:Color.values()){  
	                System.out.println(c);  
	            }  
 
	}

}
