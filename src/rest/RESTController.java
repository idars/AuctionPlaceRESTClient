/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import entities.Product;
import java.util.List;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientResponse;

/**
 * Class for managing the REST client methods and retrieve string 
 * representations of the results
 *
 * @author Idar
 */
public class RESTController {
    
    public static String get(String id, String mediaType) {
        AuctionPlaceClient client = new AuctionPlaceClient(mediaType);
        String text = "";
        
        if (id != null) {
            /*
            ClientResponse response = client.find(ClientResponse.class, id);
            if (response.getStatus() == 200) {
                Product p = (Product) response.getEntity(Product.class);
                if (p != null && p.getStatus() == Product.Status.PUBLISHED) {
                    text += p.toString();
                }
            }
            */
            String s = client.find(String.class, id);
            text += s;
        } else {
            /*
            ClientResponse response = client.findAll(ClientResponse.class);
            if (response.getStatus() == 200) {
                List<Product> list = response.getEntity(new GenericType<List<Product>>(){});
                for (Product p : list) {
                    if (p.getStatus() == Product.Status.PUBLISHED) {
                        text += p.toString();
                    }
                }
            }
            */
            String s = client.findAll(String.class);
            text += s;
        }
        
        client.close();
        return text;
    }
    
    public static <T> String post(Class<T> c) {
        // Not implemented
        return null;
    }
    
    public static <T> String put(Class<T> c) {
        // Not implemented
        return null;
    }
    
    public static String delete(String id) {
        // Not implemented
        return null;
    }
    
}
