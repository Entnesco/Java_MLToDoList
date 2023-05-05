import javax.swing.*;
import java.awt.*;

public class ListPanel extends JPanel{

    JTextField listTitle;
    JTextField[] text;
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

        this.add(listTitle);

        text = new JTextField[elements];
        for(int id = 0; id<elements; id++) {
            text[id] = new JTextField("t");
            text[id].setEditable(false);
            text[id].setBorder(null);
            text[id].setFont(new Font(null, Font.PLAIN, 16));
            text[id].setPreferredSize(new Dimension(180, 30));
            text[id].setHorizontalAlignment(SwingConstants.CENTER);
            this.add(text[id]);
        }
        

    }

}
