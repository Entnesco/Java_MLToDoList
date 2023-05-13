import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener{

    NorthPanel northPanel;
    SouthPanel southPanel;
    WestPanel westPanel;
    CenterPanel centerPanel;

    JTextField toDoListName;

    MyTimer timer;

    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            for(int idPanel = 0; idPanel < centerPanel.quantityPanels; idPanel++) {
                if(westPanel.addButtonClicked > idPanel){
                    centerPanel.panels[idPanel].setVisible(true);
                }
                else {
                    centerPanel.panels[idPanel].setVisible(false);
                    centerPanel.panels[idPanel].listTitle.setText("Panel " + idPanel);
                }

            }
        }
    };

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280,720);
        this.setLayout(new BorderLayout(10,10));

        toDoListName = new JTextField();

        northPanel = new NorthPanel();
        southPanel = new SouthPanel();
        westPanel = new WestPanel();
        centerPanel = new CenterPanel();

        //Mouse Listeners
        toDoListName=northPanel.toDoListName;
        for(int idPanel = 0; idPanel < centerPanel.quantityPanels; idPanel++) {
            centerPanel.panels[idPanel].listTitle.addMouseListener(this);
            for(int idText = 0; idText < centerPanel.panels[idPanel].elements; idText++){
                centerPanel.panels[idPanel].text[idText].addMouseListener(this);
            }
        }
        this.addMouseListener(this);

        this.add(northPanel, BorderLayout.NORTH);
        this.add(southPanel, BorderLayout.SOUTH);
        this.add(westPanel, BorderLayout.WEST);
        this.add(centerPanel, BorderLayout.CENTER);


        toDoListName.addMouseListener(this);
        northPanel.addMouseListener(this);
        southPanel.addMouseListener(this);
        westPanel.addMouseListener(this);
        centerPanel.addMouseListener(this);


        this.setVisible(true);

        timer = new MyTimer(50, listener);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //Enable or Disable Editability of JTextsFields
        toDoListName.setEditable(e.getSource() == toDoListName);
        for(int idPanels = 0; idPanels < centerPanel.quantityPanels; idPanels++) {
            centerPanel.panels[idPanels].listTitle.setEditable(e.getSource()==centerPanel.panels[idPanels].listTitle);

            for(int idText = 0; idText < centerPanel.panels[idPanels].elements; idText++){
                centerPanel.panels[idPanels].text[idText].setEditable(e.getSource()==centerPanel.panels[idPanels].text[idText]);
            }
        }

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
