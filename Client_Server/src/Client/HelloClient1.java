package Client;
import java.util.*;
import org.apache.xmlrpc.*;

public class HelloClient1 {
 public static void main (String [] args) {
  try {
   
   XmlRpcClient server = new XmlRpcClient("http://localhost/RPC2"); //
   
   Vector <String>params = new Vector();
   params.addElement("RV");
   
   Object result = server.execute("test.greet", params );
   
   System.out.println("The result is: "+result.toString());
   
  } catch (Exception exception) {
   System.err.println("JavaClient: " + exception);
   }
  }
}