package demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.dbyl.libarary.utils.ReadExcelUtil;

public class ReadExcelDemo {
  @Test
  public void f() throws IOException {
	  String[][] locatorMap;
	  String Path ="./src/自动化测试用例集.xls";
      System.out.println("获取Excel信息......");
      locatorMap = ReadExcelUtil.getLocatorMap(Path);
      System.out.println("获取UI库元素信息");
		for(int i=0;i<locatorMap.length;i++){
			for(int j=0;j<locatorMap[i].length;j++){
				if(j!=locatorMap[i].length-1){
					System.out.print("locatorMap["+i+"]["+j+"]="+locatorMap[i][j]+",");
				}
				else{
					System.out.print("locatorMap["+i+"]["+j+"]="+locatorMap[i][j]);
				}
				
			}
			System.out.println();
		}
  }
}
