import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel {

    JLabel toDoListName;
    
    NorthPanel(){
        this.setBackground(Color.red);
        this.setPreferredSize(new Dimension(100,100));
        
        toDoListName = new JLabel("List name");
        toDoListName.setBounds(0,0,100,50);
        toDoListName.setBackground(Color.red);
        toDoListName.setOpaque(true);

        this.add(toDoListName);
    }
}
