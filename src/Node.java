import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import static java.lang.Math.*;

public class Node {
    HashSet<Edge> edgs=new HashSet<>();
    String name;
    Dimension coordents;
    int HW=20;
    public Node(String name) {
        this.name=name;
        this.coordents=new Dimension((int)(Math.random()*600)+100, (int)(Math.random()*700)+100);
    }


    public Dimension getCoordents() {
        return coordents;
    }

    public void setCoordents(Dimension coordents) {
        this.coordents = coordents;
    }
    public void setCoordents(int width,int hieght) {
        this.coordents = new Dimension(width,hieght);
    }

    public void print(Graphics g)
    {
        g.setColor(Color.blue);
        g.drawString(name,coordents.width,coordents.height);
        g.fillRoundRect(coordents.width,coordents.height,HW,HW,10,10);

    }

    public void addEdge(Edge edges)
    {
        edgs.add(edges);
    }
    public void addEdge(Node node ,Integer wieght)
    {
        edgs.add(new Edge(this,node,wieght));

    }


    public HashSet<Edge> GetEdges()
    {
        return edgs;
    }

}
