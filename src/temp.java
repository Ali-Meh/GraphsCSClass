import javax.swing.*;
import java.awt.*;

public class temp {
    public static void main(String[] args) {
        graphs graphs=new graphs();
        Node a=new Node("a");
        Node b=new Node("b");
        Node c=new Node("c");
        Node d=new Node("d");
//        a.addEdge(b,5);
        b.addEdge(d,10);
        c.addEdge(d,8);
//        c.addEdge(a,45);
        Math.abs(123);

        graphs.addNode(a);
        graphs.addNode(d);
        graphs.addNode(b);
        graphs.addNode(c);

        for(Node n:graphs.getNodes())
        {
            for(Edge e:n.GetEdges())
            {
                System.out.println(n.name+"\t"+e.StartNode.name+"==>"+e.LastNode.name);
            }
        }

        graphs.setGraph(graphs);






        pn frame=new pn();
//        while (true)
//        {
//            frame.doThings();
//        }



    }


}
