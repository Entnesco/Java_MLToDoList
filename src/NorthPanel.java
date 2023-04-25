import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class NorthPanel extends JPanel implements MouseListener {

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
        toDoListName.addMouseListener(this);
        toDoListName.setOpaque(true);

        this.add(toDoListName);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        clicksOnToDoListName++;
        if(clicksOnToDoListName == 2)
        {
            toDoListName.setEditable(true);
            clicksOnToDoListName = 0;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
