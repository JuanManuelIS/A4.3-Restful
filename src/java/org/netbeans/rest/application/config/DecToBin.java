package org.netbeans.rest.application.config;


import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Stateless
@Path("/dectobin")
public class DecToBin {
    
    @GET
    public String dectobin(@QueryParam("decimal") String decimal){
        String binario = "";
        int decim = Integer.parseInt(decimal);
        while(decim > 0){
            int modulo = decim %2;
            binario = binario + String.valueOf(modulo);
            decim = decim / 2;
        }
        StringBuilder builder=new StringBuilder(binario);
        binario = builder.reverse().toString();
        return binario;
    }
}











