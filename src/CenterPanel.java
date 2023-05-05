import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    ListPanel panel1;
    ListPanel panel2;
    ListPanel panel3;
    ListPanel panel4;
    ListPanel panel5;

    CenterPanel(){
        this.setBackground(Color.blue);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1 = new ListPanel("To Do");
        panel2 = new ListPanel("In Progress");
        panel3 = new ListPanel("Done");
        panel4 = new ListPanel("To Do Latter");
        panel5 = new ListPanel("Abandoned");

        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);
        this.add(panel5);
    }


}
