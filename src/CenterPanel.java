import javax.swing.*;
import java.awt.*;

public class CenterPanel extends JPanel {

    JPanel panel1;
    JPanel panel2;
    CenterPanel(){
        this.setBackground(Color.blue);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(200,450));

        panel2 = new JPanel();
        panel2.setPreferredSize(new Dimension(200,450));

        this.add(panel1);
        this.add(panel2);
    }


}
