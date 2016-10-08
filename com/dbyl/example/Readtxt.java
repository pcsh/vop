package com.dbyl.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Readtxt {
    public static void main(String[] args) throws IOException {
    	String array[][] = new String[0][4];
    	array = Read();
    	for(int i=0;i<array.length;i++){
    		for(int j=0;j<4;j++){
    			System.out.println(array[i][j]);
    		}
    	}
    	
    }
     
    public static String[] splitt(String str){
        String strr = str.trim();
        String[] abc = strr.split(",");//("[\\p{Space}]+");
        //说明：“\p{Space}”匹配空白字符，前面加个反斜线字符，是为了转义。转义后，加了个中括号，是分了分组，不加中括号也没事，只是给清楚点，后面的加号是“一次或多次”的意思
        String str1 = abc[0];
        String str2 = abc[1];
        System.out.println(str1);
        System.out.println(str2);
        return abc;
    }
    
    @SuppressWarnings("resource")
	public static String[][] Read() throws IOException{
    	File file = new File("./src/UILibrary.txt");
    	FileReader fileReader = null;
    	BufferedReader bufferedReader = null;
    	fileReader = new FileReader(file);
    	bufferedReader=new BufferedReader(fileReader);
    	String s;
    	String array[][]=new String[0][4];
    	int line=0;
    	while(bufferedReader.readLine()!=null){
    		line++;
    	}
    	array=new String[line][4];
    	int currentLine=0;
    	while((s=bufferedReader.readLine())!=null){
    		String s1[]=s.split(",");
    		array[currentLine][0]=s1[0];
    		array[currentLine][1]=s1[1];
    		array[currentLine][2]=s1[2];
    		array[currentLine][3]=s1[3];
    		currentLine++;
    	}
    	for(int i=0;i<array.length;i++){
    		for(int j=0;j<4;j++){
    			System.out.println(array[i][j]);
    		}
    	}
    	return array;
    }
}
