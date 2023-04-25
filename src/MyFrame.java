import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {

    NorthPanel northPanel;
    SouthPanel southPanel;
    WestPanel westPanel;
    CenterPanel centerPanel;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setLayout(new BorderLayout(10,10));

        northPanel = new NorthPanel();
        southPanel = new SouthPanel();
        westPanel = new WestPanel();
        centerPanel = new CenterPanel();


        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(westPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);

        this.addMouseListener(this);

        this.setVisible(true);

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        northPanel.toDoListName.setEditable(false);
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
