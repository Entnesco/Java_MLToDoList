import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    public static void main(String[] args) {

        new MyFrame();
        new MyTimer(20, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

}