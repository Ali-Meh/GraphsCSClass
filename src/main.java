import javafx.embed.swing.JFXPanel;

import javax.swing.*;

public class main {


    public static void main(String[] args) {
        graphs graphs=new graphs();
        Node a=new Node("a");
        Node b=new Node("b");
        Node c=new Node("b");
        Node d=new Node("d");
        a.addEdge(b,5);
        b.addEdge(d,10);
        c.addEdge(d,8);
        Math.abs(123);

        graphs.addNode(a);
        graphs.addNode(d);
        graphs.addNode(b);
        graphs.addNode(c);

        for(Node n:graphs.getNodes())
        {
            for(Edge e:n.GetEdges())
            {
                System.out.println(n.name+"\t"+e);
            }
        }
        graphs.setGraph(graphs);
        JFrame jf=new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(1200,900);
        jf.getContentPane().add(new panel());
        jf.setVisible(true);










    }
}
