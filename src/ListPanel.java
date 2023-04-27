import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ListPanel extends JPanel{

    JTextField textField;
    ListPanel(String name){
        this.setPreferredSize(new Dimension(200,450));
        this.setVisible(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        textField = new JTextField(name);
        textField.setEditable(false);
        textField.setFont(new Font(null,Font.PLAIN, 16));
        textField.setPreferredSize(new Dimension(180,30));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(textField);
    }

}
