import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WestPanel extends JPanel implements ActionListener{

    JButton addButton;
    JButton deleteButton;

    int addButtonClicked = 0;

    WestPanel(){
        this.setBackground(Color.yellow);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new FlowLayout(FlowLayout.TRAILING));

        addButton = new JButton("Add");
        addButton.setPreferredSize(new Dimension(90,40));
        deleteButton = new JButton("Delete");
        deleteButton.setPreferredSize(new Dimension(90,40));

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);

        this.add(addButton);
        this.add(deleteButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addButton){
            addButtonClicked++;
            if(addButtonClicked>5) addButtonClicked=5;
        }

        if(e.getSource()==deleteButton){
            addButtonClicked--;
            if(addButtonClicked<0) addButtonClicked=0;
        }
    }
}
