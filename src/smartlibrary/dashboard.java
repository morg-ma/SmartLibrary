
package smartlibrary;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JPanel;

//dashboard photo

public class dashboard extends JLabel  {
            ImageIcon icon4 =new ImageIcon("dashboad.png");

 
   // static JLabel label;
    public dashboard(/*int x*/)
    {
        //numusers=x;
        
       
   
        
        this.setPreferredSize(new Dimension(1280, 550));
        this.setIcon(icon4);
        this.setBounds(0,0,1280,550);
    }
    
    
    public static void add()
    {
//        numusers++;
//        label.setText(String.valueOf(numusers));
//        System.out.println(numusers);
    }
    
    
    
    
    
    
    
    
    
    
    
}
