import java.awt.*;

public class Edge {
    Node LastNode;
    Node StartNode;
    Integer Wieght;
    Dimension coordinates;


    public Edge(Node lastNode, Node startNode, Integer wieght) {
        LastNode = lastNode;
        StartNode = startNode;
        Wieght = wieght;
        lastNode.addEdge(this);
        startNode.addEdge(this);
    }

    public Edge(Node lastNode, Node startNode, Integer wieght,Dimension coordinates) {
        LastNode = lastNode;
        StartNode = startNode;
        Wieght = wieght;
        lastNode.addEdge(this);
        startNode.addEdge(this);
    }

    public void setCoordinates(Dimension d)
    {
        coordinates=d;
    }
    public void setCoordents(int width,int hieght) {
        this.coordinates = new Dimension(width,hieght);
    }


    public void printedge(Graphics g)
    {
        g.setColor(Color.red);
        g.drawLine(StartNode.coordents.width+StartNode.HW/2,StartNode.coordents.height+StartNode.HW/2,
                LastNode.coordents.width+StartNode.HW/2,LastNode.coordents.height+StartNode.HW/2);
    }

}
