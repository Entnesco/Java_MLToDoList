import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener, ActionListener{

    NorthPanel northPanel;
    SouthPanel southPanel;
    WestPanel westPanel;
    CenterPanel centerPanel;

    JTextField toDoListName;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setLayout(new BorderLayout(10,10));

        toDoListName = new JTextField();

        northPanel = new NorthPanel();
        southPanel = new SouthPanel();
        westPanel = new WestPanel();
        centerPanel = new CenterPanel();

        westPanel.addButton.addActionListener(this);
        westPanel.deleteButton.addActionListener(this);
        toDoListName=northPanel.toDoListName;
        centerPanel.panel1.listTitle.addMouseListener(this);
        centerPanel.panel2.listTitle.addMouseListener(this);
        centerPanel.panel3.listTitle.addMouseListener(this);
        centerPanel.panel4.listTitle.addMouseListener(this);
        centerPanel.panel5.listTitle.addMouseListener(this);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(westPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);

        this.addMouseListener(this);
        toDoListName.addMouseListener(this);

        this.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        toDoListName.setEditable(e.getSource() == toDoListName);
        centerPanel.panel1.listTitle.setEditable(e.getSource()==centerPanel.panel1.listTitle);
        centerPanel.panel2.listTitle.setEditable(e.getSource()==centerPanel.panel2.listTitle);
        centerPanel.panel3.listTitle.setEditable(e.getSource()==centerPanel.panel3.listTitle);
        centerPanel.panel4.listTitle.setEditable(e.getSource()==centerPanel.panel4.listTitle);
        centerPanel.panel5.listTitle.setEditable(e.getSource()==centerPanel.panel5.listTitle);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==westPanel.addButton){
            westPanel.addButtonClicked++;
            if(westPanel.addButtonClicked>5) westPanel.addButtonClicked=5;
        }

        if(e.getSource()==westPanel.deleteButton){
            westPanel.addButtonClicked--;
            if(westPanel.addButtonClicked<0) westPanel.addButtonClicked=0;
        }

        centerPanel.panel1.setVisible(westPanel.addButtonClicked >= 1);
        centerPanel.panel2.setVisible(westPanel.addButtonClicked >= 2);
        centerPanel.panel3.setVisible(westPanel.addButtonClicked >= 3);
        centerPanel.panel4.setVisible(westPanel.addButtonClicked >= 4);
        centerPanel.panel5.setVisible(westPanel.addButtonClicked >= 5);



    }
}
