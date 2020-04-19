package com.DataReadController;

import Xls_Reader_Package.Xls_Reader;

public class DataReadController {
	
static Xls_Reader reader = new Xls_Reader("E:\\peopleNtech\\WebAutomationGit\\Website-automation\\DataDriven\\src\\test\\java\\com\\UserData\\UserInfoData.xlsx");
	
	
  // =====get email & password data from excel file=====

    static int rowCount = reader.getRowCount("UserDataInfo");
    
    static int rowNum;
    
	
	public static void EmailandPassword()
	{
	      for (rowNum = 2; rowNum<=rowCount; rowNum++) 
	      {
	    	  String Email = reader.getCellData("UserDataInfo", "User email", rowNum);
	    	  System.out.println(Email);
	    	  String Password = reader.getCellData("UserDataInfo", "User Passsword", rowNum);
			  System.out.println(Password);
	    	 
		  
			
	      }
	  }

	public static int totalRow() {
		// TODO Auto-generated method stub
		System.out.println(rowCount);
		return  rowCount;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailandPassword();
		totalRow();
		
		

	}


}
