package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
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
public class PrettyPrinter {
    
    public static String format(String input, String mediaType) {
        switch (mediaType) {
            case MediaType.APPLICATION_XML:
                return formatXML(input);
            case MediaType.APPLICATION_JSON:
                return formatJSON(input);
            default:
                return input;
        }
    }
    
    private static String formatXML(String input) {
        try {
            Source xmlInput = new StreamSource(new StringReader(input));
            StringWriter stringWriter = new StringWriter();
            StreamResult xmlOutput = new StreamResult(stringWriter);
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            transformerFactory.setAttribute("indent-number", 4);
            
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.transform(xmlInput, xmlOutput);
            return xmlOutput.getWriter().toString();
        } catch (TransformerException ex) {
            Logger.getLogger(PrettyPrinter.class.getName()).log(Level.SEVERE, null, ex);
            return input;
        }
    }
    
    private static String formatJSON(String input) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement json = new JsonParser().parse(input);
        return gson.toJson(json);
    }
    
}
