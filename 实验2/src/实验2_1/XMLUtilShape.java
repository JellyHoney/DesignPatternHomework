package 实验2_1;

import javax.xml.parsers.*;
import org.w3c.dom.*;

import java.io.*;
public class XMLUtilShape {
    public static String getShapeType()
    {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc=builder.parse(new File("./src/实验2_1/configShape.xml"));
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