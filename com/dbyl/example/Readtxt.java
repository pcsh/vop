package com.dbyl.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readtxt {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("abc.txt"));
  
            while (in.hasNextLine()) {
                String str = in.nextLine();
                splitt(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
     
    public static String[] splitt(String str){
        String strr = str.trim();
        String[] abc = strr.split("[\\p{Space}]+");
        //说明：“\p{Space}”匹配空白字符，前面加个反斜线字符，是为了转义。转义后，加了个中括号，是分了分组，不加中括号也没事，只是给清楚点，后面的加号是“一次或多次”的意思
        String str1 = abc[0];
        String str2 = abc[1];
        System.out.println(str1);
        System.out.println(str2);
        return abc;
    }
}
