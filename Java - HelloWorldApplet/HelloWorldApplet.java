import javax.swing.*;
import java.awt.*;

public class HelloWorldApplet extends JApplet 
{
   public void init()
   {
      JLabel label = new JLabel("Hello, World!");
      add(label);
   }
}