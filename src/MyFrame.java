import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setLayout(new BorderLayout(10,10));
        this.setVisible(true);

        NorthPanel northPanel = new NorthPanel();
        SouthPanel southPanel = new SouthPanel();
        WestPanel westPanel = new WestPanel();
        CenterPanel centerPanel = new CenterPanel();


        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(westPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
