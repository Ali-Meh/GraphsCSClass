import javax.swing.*;
import java.awt.*;

public class panel extends JComponent {
    public panel() {
        setLayout(null);
        setSize(1200,900);
        repaint();
    }

    @Override
    protected void printComponent(Graphics g) {
        super.paintComponent(g);
        graphs.getGraph().printgraph(g);
    }

    @Override
    public void printAll(Graphics g) {
        super.printAll(g);
        graphs.getGraph().printgraph(g);

    }

    @Override
    public void print(Graphics g) {
        super.print(g);
        graphs.getGraph().printgraph(g);

    }
}
