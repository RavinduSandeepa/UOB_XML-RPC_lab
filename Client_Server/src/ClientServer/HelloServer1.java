package ClientServer;
import org.apache.xmlrpc.*;

public class HelloServer1 { 

 public String hello() {
  return "Hello RV";
  }
  
  public String greet(String name){
	  return "Hello Mr."+name;
  }
  
 public static void main (String [] args) {
  try {
	  uk.co.wilson.xml.MinML.xmlinfo = true;
	 System.out.println("Starting Server..."); 
   WebServer server = new WebServer(80);
   server.addHandler("test", new HelloServer());
   server.start();
  } catch (Exception exception) {
   System.err.println("JavaServer: " + exception);
   }
  }
 }