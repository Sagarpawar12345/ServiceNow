package com.ciranet.testdata;

import org.testng.annotations.DataProvider;

import com.ciranet.utilities.ExcelUtils;

import java.util.List;
import java.util.stream.Collectors;

public class RoleBasedDataProviders {

    @DataProvider(name = "internaluser")
    public Object[][] getAdminData() {
    	String internalUserPath = System.getProperty("user.dir")+ "\\src\\test\\java\\com\\ciranet\\testdata\\internalusers.xlsx";
    	return filterDataByRole(internalUserPath, "Sheet1", "internaluser");
    }

    @DataProvider(name = "boardmember")
    public Object[][] getUserData() {
    	String boardMemberPath = System.getProperty("user.dir")+ "\\src\\test\\java\\com\\ciranet\\testdata\\boardmembers.xlsx";
    	return filterDataByRole(boardMemberPath, "Sheet1", "boardmember");
        
    }

    private Object[][] filterDataByRole(String filePath, String sheetName, String role) {
        List<Object[]> allData = ExcelUtils.getDataFromExcel(filePath, sheetName);
        List<Object[]> filteredData = allData.stream()
                .filter(data -> data[2].equals(role))
                .collect(Collectors.toList());
        return filteredData.toArray(new Object[0][]);
    }
}
