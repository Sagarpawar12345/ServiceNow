package com.ciranet.testdata;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.ciranet.utilities.XMLCredentialsReader;

public class RoleBasedDataProvidersFromXml {
	
	@DataProvider(name = "boardMemberProvider")
    public Object[][] credentialsProvider() {
        // String filePath = "path/to/credentials.xml";
		String boardmemberUserPath = System.getProperty("user.dir")+ "\\src\\test\\java\\com\\ciranet\\testdata\\boardmembers.xml";
        List<XMLCredentialsReader.userCredentials> credentialsList = XMLCredentialsReader.readCredentials(boardmemberUserPath);

        Object[][] data = new Object[credentialsList.size()][1];
        for (int i = 0; i < credentialsList.size(); i++) {
            data[i][0] = credentialsList.get(i);
        }
        return data;
    }
	
	@DataProvider(name = "internalUserProvider")
    public Object[][] credentialsInternalUserProvider() {
        // String filePath = "path/to/credentials.xml";
		String internalUserPath = System.getProperty("user.dir")+ "\\src\\test\\java\\com\\ciranet\\testdata\\internalusers.xml";
        List<XMLCredentialsReader.userCredentials> credentialsList = XMLCredentialsReader.readCredentials(internalUserPath);

        Object[][] data = new Object[credentialsList.size()][1];
        for (int i = 0; i < credentialsList.size(); i++) {
            data[i][0] = credentialsList.get(i);
        }
        return data;
    }

}
