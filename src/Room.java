import java.awt.*;
import java.util.ArrayList;

public class Room extends GameObject
{
    ArrayList<GameObject> objects = new ArrayList<GameObject>();


    public Room()
    {

    }

    public void drawBody(Graphics g, int xOffset, int yOffset)
    {
        g.setColor(Color.blue);
        Polygon poly = new Polygon();
        poly.addPoint(50 + xOffset,150 + yOffset);
        poly.addPoint(50+ xOffset,125 + yOffset);
        poly.addPoint(75+ xOffset,100 + yOffset);
        poly.addPoint(150+ xOffset,100 + yOffset);
        poly.addPoint(225+ xOffset, 50 + yOffset);
        poly.addPoint(300+ xOffset,50 + yOffset);
        poly.addPoint(325+ xOffset, 100 + yOffset);
        poly.addPoint(375+ xOffset,100 + yOffset);
        poly.addPoint(375+ xOffset, 125 + yOffset);
        poly.addPoint(350+ xOffset,150 + yOffset);
        poly.addPoint(50+ xOffset,150 + yOffset);
        g.fillPolygon(poly);


    }

}
