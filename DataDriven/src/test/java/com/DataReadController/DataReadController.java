package com.DataReadController;

import Xls_Reader_Package.Xls_Reader;

public class DataReadController {
	
Xls_Reader reader = new Xls_Reader("E:\\peopleNtech\\WebAutomationGit\\Website-automation\\DataDriven\\src\\test\\java\\com\\UserData\\UserInfoData.xlsx");
	
	
  // =====get email & password data from excel file=====

    int rowCount = reader.getRowCount("UserDataInfo");
    
    
    
	
//	public String Email()
//	{
//	  for(int rowNum = 2; rowNum<=rowCount; rowNum++)
//	  {
//		  String Email = reader.getCellData("UserDataInfo", "User email", rowCount);
//		  
//	  }
//	   return Email();
//	  
//	  }
//	
//	public String Password()
//	{
//	  for(int rowNum = 2; rowNum<=rowCount; rowNum++)
//	  {
//		  String Passsword = reader.getCellData("UserDataInfo", "User Passsword", rowCount);
//	  }
//	return Password();
//	  
//	  }
//	
//
//	public String Password() {
//		// TODO Auto-generated method stub
//		return  reader.getCellData("UserDataInfo", "User Passsword", rowCount);
//	}
//	

	public int totalRow() {
		// TODO Auto-generated method stub
		return  rowCount;
	}

}
