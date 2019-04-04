import javax.xml.parsers.*;
import org.w3c.dom.*;

import java.io.*;
public class XMLUtilButton {
    public static String getButtonType()
    {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc=builder.parse(new File("实验2_2/src/configButton.xml"));
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