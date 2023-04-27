import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WestPanel extends JPanel{

    JButton addButton;
    JButton editButton;
    JButton deleteButton;

    int addButtonClicked = 0;

    WestPanel(){
        this.setBackground(Color.yellow);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new FlowLayout(FlowLayout.TRAILING));

        addButton = new JButton("Add");
        addButton.setPreferredSize(new Dimension(90,40));

        editButton = new JButton("Edit");
        editButton.setPreferredSize(new Dimension(90,40));
        deleteButton = new JButton("Delete");
        deleteButton.setPreferredSize(new Dimension(90,40));

        this.add(addButton);
        this.add(editButton);
        this.add(deleteButton);
    }

}
