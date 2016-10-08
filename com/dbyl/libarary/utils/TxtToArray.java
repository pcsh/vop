package com.dbyl.libarary.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TxtToArray {



	/**
	 * 读取文件
	 * @param filePath
	 * @return
	 */
	public static  List  readTxtFile(String filePath) {
		List<String> list = new ArrayList<String>();
		try {
			String encoding = "UTF-8";
			File file = new File(filePath);
			if (file.isFile() && file.exists()) { 
				InputStreamReader read = new InputStreamReader(
						new FileInputStream(file), encoding);
				BufferedReader bufferedReader = new BufferedReader(read);
				String lineTxt = null;
				while ((lineTxt = bufferedReader.readLine()) != null) {
					//if (!lineTxt.startsWith("#"))
						list.add(lineTxt);
				}
				read.close();
			} else {
				System.out.println("找不到文件");
			}
		} catch (Exception e) {
			System.out.println("出错了");
			e.printStackTrace();
		}
		return list;

	}
	
	/**
	 * 创建二维数组
	 * @param list
	 * @return
	 */
	public static String[][] createArray(String filePath){
		List<String> list = readTxtFile(filePath);
		String array[][] = new String[list.size()][];
		for(int i=0;i<list.size();i++){
			array[i] = new String[4];
			String linetxt=list.get(i);
			String[] myArray = linetxt.split(",");//replaceAll("\\s+", "@").
			for(int j=0;j<myArray.length;j++){
				if(j<4){
					array[i][j]=myArray[j];
				}
			}
		}
		return array;
	}
	
	/**
	 * 打印数组
	 * @param array
	 */
	public static void printArray(String array[][]){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				if(j!=array[i].length-1){
					System.out.print("array["+i+"]["+j+"]="+array[i][j]+",");
				}
				else{
					System.out.print("array["+i+"]["+j+"]="+array[i][j]);
				}
				
			}
			System.out.println();
		}
	}


/*	example:	
 * public static void main(String args[]) {
		String array[][] = createArray("./src/UILibrary.txt");
		printArray(array);
	}*/
	
	
	
	
}
