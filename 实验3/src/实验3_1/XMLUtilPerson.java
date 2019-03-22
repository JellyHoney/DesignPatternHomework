package 实验3_1;

import javax.xml.parsers.*;
import org.w3c.dom.*;

import java.io.*;
public class XMLUtilPerson {
    public static String getPersonType()
    {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc=builder.parse(new File("./src/实验3_1/configPerson.xml"));
            NodeList nl = doc.getElementsByTagName("typeName");
            Node classNode=nl.item(0).getFirstChild();
            String st=classNode.getNodeValue().trim();
            return st;
        }
        catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}