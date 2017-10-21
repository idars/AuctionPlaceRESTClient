package util;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;


/**
 *
 * @author Idar
 */
public class StringFormatter {
    
    public static String format(String input, int indent, String mediaType) {
        switch (mediaType) {
            case MediaType.APPLICATION_XML:
                return formatXML(input, indent);
            case MediaType.APPLICATION_JSON:
                return formatJSON(input, indent);
            default:
                return input;
        }
    }
    
    private static String formatXML(String input, int indent) {
        try {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", indent);
            
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (TransformerException ex) {
            Logger.getLogger(StringFormatter.class.getName()).log(Level.SEVERE, null, ex);
            return input;
        }
    }
    
    
    private static String formatJSON(String input, int indent) {
        // Not implemented (yet)
        return input;
    }
    
}
