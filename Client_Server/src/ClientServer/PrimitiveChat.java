package ClientServer;
import javax.swing.*;

public class PrimitiveChat {

// The procedure:
 public String printText(String str) {
    System.out.println( "Received: "+str);
    return "ok";
    }

 public static void main (String [] args) {
  String input;
  PrimitiveChat pc = new PrimitiveChat();

  do {
    input = JOptionPane.showInputDialog("Enter your message");
    if( input != null ) {
        pc.printText(input); // a local procedure call.
        }
    } while ( input != null );
  System.exit(0);
  }
}