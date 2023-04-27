import javax.swing.*;
import java.awt.event.ActionListener;

public class MyTimer extends Timer {
    public MyTimer(int delay, ActionListener listener) {
        super(delay, listener);
        this.start();
    }
}
