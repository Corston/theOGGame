import java.applet.Applet;
import java.awt.*;

public class GameMain extends Applet
{


    GameObject drake = new GameObject();
    GameObject room = new Room();
    public void paint(Graphics g)
    {
        g.clearRect(0,0,500,500);
        //room.move(0,0);
        room.drawBody(g,10,10);
        drake.drawBody(g,50,0);
        //drake.paint(g);
    }
}

