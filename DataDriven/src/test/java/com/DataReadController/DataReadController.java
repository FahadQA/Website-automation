package com.DataReadController;

import Xls_Reader_Package.Xls_Reader;

public class DataReadController {
	
Xls_Reader reader = new Xls_Reader("E:\\Andriod studio\\eclips 2019\\works\\DataDriven\\src\\test\\java\\com\\UserData\\UserInfoData.xlsx");
	
	

	
	public String Email()
	{
		return reader.getCellData("UserDataInfo", "User email", 2);
	}
	
	public String Password()
	{
		return reader.getCellData("UserDataInfo", "User Passsword", 2);
	}

}
