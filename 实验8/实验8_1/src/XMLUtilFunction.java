import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
public class XMLUtilFunction {
    public static String getFunctionType()
    {
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc=builder.parse(new File("实验8_1/src/configFunction.xml"));
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