package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream; 
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;

	public ExcelDataProvider() {
		File src = new File("./TestData/Data.xlsx");
		FileInputStream fis;
		try {

			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println("Unable to read excel file" + e.getMessage());

		}

	}

	
	public UserRegistration readUserRegistration()	{
		String email=wb.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
				String firstName=wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
				String lastName=wb.getSheetAt(0).getRow(1).getCell(2).getStringCellValue();
				String password=wb.getSheetAt(0).getRow(1).getCell(3).getStringCellValue();
				String company=wb.getSheetAt(0).getRow(1).getCell(4).getStringCellValue();
				String address1=wb.getSheetAt(0).getRow(1).getCell(5).getStringCellValue();
				String address2=wb.getSheetAt(0).getRow(1).getCell(6).getStringCellValue();
				String city=wb.getSheetAt(0).getRow(1).getCell(7).getStringCellValue();
				//double postalcode=wb.getSheetAt(0).getRow(1).getCell(8).getNumericCellValue();
				String country=wb.getSheetAt(0).getRow(1).getCell(8).getStringCellValue();
				String addinfo=wb.getSheetAt(0).getRow(1).getCell(9).getStringCellValue();
				double homephone=wb.getSheetAt(0).getRow(1).getCell(10).getNumericCellValue();
				double mobilephone=wb.getSheetAt(0).getRow(1).getCell(11).getNumericCellValue();
				String alias=wb.getSheetAt(0).getRow(1).getCell(12).getStringCellValue();
				
				UserRegistration register=new UserRegistration();
				
				register.setEmail(email);
				register.setFirstName(firstName);
				register.setLastName(lastName);
				register.setPassword(password);
				register.setCompany(company);
				register.setAddress1(address1);
				register.setAddress2(address2);
				register.setCity(city);
				//register.setPostalcode(postalcode);
				register.setCountry(country);
				register.setAddinfo(addinfo);
				register.setHomephone(homephone);
				register.setMobilephone(mobilephone);
                register.setAlias(alias);
				return register;
		
		
		
	}
	
	
}
