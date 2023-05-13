import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main(String[] args) {

        MyFrame myFrame = new MyFrame();
        new MyTimer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myFrame.getContentPane().revalidate();
                myFrame.getContentPane().repaint();
            }
        });

    }

}