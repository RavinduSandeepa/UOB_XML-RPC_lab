package Server;
import org.apache.xmlrpc.*;

public class JavaServer { 
 public Integer sum(int x, int y) {
  return new Integer(x+y);
  }
 public static void main (String [] args) {
  try {
   WebServer server = new WebServer(80);
   server.addHandler("sample", new JavaServer());
   server.start();
  } catch (Exception exception) {
   System.err.println("JavaServer: " + exception);
   }
  }
 }
