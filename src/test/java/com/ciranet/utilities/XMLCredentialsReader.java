package com.ciranet.utilities;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.util.ArrayList;
import java.util.List;

public class XMLCredentialsReader {

    public static class userCredentials {
        private String username;
        private String password;

        public userCredentials(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

        @Override
        public String toString() {
            return "Username: " + username + ", Password: " + password;
        }
    }

    public static List<userCredentials> readCredentials(String filePath) {
        List<userCredentials> credentialsList = new ArrayList<>();
        try {
            // Create a DocumentBuilderFactory
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

            // Create a DocumentBuilder
            DocumentBuilder builder = factory.newDocumentBuilder();

            // Parse the XML file and load it into a Document
            Document document = builder.parse(filePath);

            // Normalize the XML structure
            document.getDocumentElement().normalize();

            // Get the list of <user> elements
            NodeList userList = document.getElementsByTagName("user");

            for (int i = 0; i < userList.getLength(); i++) {
                Node userNode = userList.item(i);

                if (userNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element userElement = (Element) userNode;

                    // Get the username and password elements
                    String username = userElement.getElementsByTagName("username").item(0).getTextContent();
                    String password = userElement.getElementsByTagName("password").item(0).getTextContent();

                    // Add the credentials to the list
                    credentialsList.add(new userCredentials(username, password));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return credentialsList;
    }
    
//    public static void main(String[] args) {
//        String filePath = "C:\\Users\\Admin\\git\\CiraFromMaster\\CiraAutomation\\src\\test\\java\\com\\ciranet\\testdata\\boardmembers.xml";
//        List<Credentials> credentialsList = readCredentials(filePath);
//
//        if (!credentialsList.isEmpty()) {
//            for (Credentials credentials : credentialsList) {
//                System.out.println(credentials);
//            }
//        } else {
//            System.out.println("Failed to read credentials from the XML file.");
//        }
//    }
}