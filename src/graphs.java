import java.awt.*;
import java.util.ArrayList;

public class graphs {
    public ArrayList<Node> nodes;

    public static graphs graph;

    public static graphs getGraph() {
        return graph;
    }


    public static void setGraph(graphs graph) {
        graphs.graph = graph;
    }

    public graphs() {
        this.nodes = new ArrayList<>();
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void addNode(Node node)
    {
        nodes.add(node);
    }

    public void printgraph(Graphics g)
    {
        for(Node node:nodes)
        {

            for (Edge e:node.edgs)
            {
                e.printedge(g);
            }
            node.print(g);
        }
    }
}
