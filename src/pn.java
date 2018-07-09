import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
enum States{AddNode,AddEdge,MoveNode}
public class pn extends JFrame {
    Node ChNode=null;
    States state;
    public pn() throws HeadlessException {
        setSize(900,900);
        setLayout(null);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
                if(ChNode!=null&&state==States.MoveNode)
                {
                    ChNode.setCoordents(e.getX(), e.getY());
                    repaint();

                }


            }
        });
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                ChNode=null;
                requestFocus();
                switch (e.getButton())
                {
                    case MouseEvent.BUTTON1:
                        state=States.MoveNode;
                        break;
                    case MouseEvent.BUTTON2:
                        state=States.AddNode;
                        break;
                    case MouseEvent.BUTTON3:
                        state=States.AddEdge;
                        break;
                }
                if(state!=States.AddNode)
                {
                    for(Node n:graphs.graph.nodes)
                    {
                        if((n.coordents.width<e.getX()&&n.coordents.width+n.HW>e.getX())
                                &&(n.coordents.height<e.getY()&&n.coordents.height+n.HW>e.getY()))
                        {
                            ChNode=n;
                        }
                    }
                }
                else
                {
                    String nodeNAme=JOptionPane.showInputDialog("please Provide a Unique name");
//                    JOptionPane.
                    Node n=new Node(nodeNAme);
                    n.setCoordents(e.getX(),e.getY());
                    graphs.graph.addNode(n);
                }




//

                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                if(ChNode!=null)
                {
                    ChNode.setCoordents(e.getX(), e.getY());
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                if(ChNode!=null&&e.getButton()==MouseEvent.BUTTON1)
                {
                    ChNode.setCoordents(e.getX(), e.getY());
                    repaint();
                }
                else if(ChNode!=null&&e.getButton()==MouseEvent.BUTTON3)
                {
                    Node node=null;

                    for(Node n:graphs.graph.nodes)
                    {
                        if((n.coordents.width<e.getX()&&n.coordents.width+n.HW>e.getX())
                                &&(n.coordents.height<e.getY()&&n.coordents.height+n.HW>e.getY()))
                        {
                            node=n;
                        }
                    }

                    if(node!=null)
                    {
                        node.addEdge(ChNode,(int)(Math.random()*10));
                    }
                    repaint();
                }
            }

        });
    }
    public void doThings() {
//        Graphics g = getContentPane().getGraphics();
//        while (true){
////            g.drawImage(img, 20, 20, img.getWidth(this), img.getHeight(this), this);
//
//            g.drawLine(0, 0, new Random().nextInt(), new Random().nextInt());
//            paintComponents(this.getGraphics());
//        //repaint();
//        }
        repaint ();
    }
    @Override
    public void paint (Graphics g) {
        super.paintComponents(g);
//        g.drawImage(img, x + width, y, -width, height, null);
//        g.drawImage(img, 600,20+img.getHeight(this),img.getWidth(this), -img.getHeight(this), this);
//        g.drawImage(img,20,20,img.getWidth(this),img.getHeight(this),this);
         graphs.graph.printgraph(g);
        System.out.println("printing");
    }
}
