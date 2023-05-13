import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class NorthPanel extends JPanel{

    JTextField toDoListName;
    int clicksOnToDoListName = 0;
    
    NorthPanel(){
        this.setBackground(Color.cyan);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        toDoListName = new JTextField();
        toDoListName.setText("List title");
        toDoListName.setFont(new Font(null,Font.PLAIN, 30));
        toDoListName.setBackground(null);
        toDoListName.setBorder(null);
        toDoListName.setEditable(false);
        toDoListName.setForeground(Color.black);
        toDoListName.setPreferredSize(new Dimension(1200,90));
        toDoListName.setHorizontalAlignment(SwingConstants.CENTER);
        toDoListName.setOpaque(true);


        this.add(toDoListName);
    }


}
