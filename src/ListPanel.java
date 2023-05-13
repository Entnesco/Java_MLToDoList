import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListPanel extends JPanel implements ActionListener{

    JTextField listTitle;
    JTextField[] text;
    JButton plusButton;
    JButton minusButton;
    int nrElements=0;

    int elements = 11;
    ListPanel(String name){
        this.setPreferredSize(new Dimension(200,450));
        this.setVisible(false);
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        listTitle = new JTextField(name);
        listTitle.setEditable(false);
        listTitle.setFont(new Font(null,Font.PLAIN, 16));
        listTitle.setPreferredSize(new Dimension(180,30));
        listTitle.setHorizontalAlignment(SwingConstants.CENTER);

        plusButton = new JButton("Add");
        minusButton = new JButton("Delete");

        plusButton.addActionListener(this);
        minusButton.addActionListener(this);

        this.add(listTitle);
        this.add(plusButton);
        this.add(minusButton);

        text = new JTextField[elements];
        for(int id = 0; id<elements; id++) {
            text[id] = new JTextField("");
            text[id].setEditable(false);
            text[id].setFont(new Font(null, Font.PLAIN, 16));
            text[id].setPreferredSize(new Dimension(180, 30));
            text[id].setHorizontalAlignment(SwingConstants.CENTER);
            text[id].setVisible(false);
            this.add(text[id]);
        }
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==plusButton){
            nrElements++;
            if(nrElements>11) nrElements=11;
        }

        if(e.getSource()==minusButton){
            nrElements--;
            if(nrElements<0) nrElements=0;
        }
        for(int id = 0; id<elements; id++) {
            if(nrElements>id) {
                text[id].setVisible(true);
            }
            else{
                text[id].setText("");
                text[id].setVisible(false);
            }

        }

    }

}
