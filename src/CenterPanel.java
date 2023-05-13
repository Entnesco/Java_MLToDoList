import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    ListPanel[] panels;
    int quantityPanels = 5;

    CenterPanel(){
        this.setBackground(Color.blue);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        panels = new ListPanel[quantityPanels];
        for(int idPanel = 0; idPanel < quantityPanels; idPanel++){
            panels[idPanel]=new ListPanel("Panel " + idPanel);
            this.add(panels[idPanel]);
        }
    }


}
