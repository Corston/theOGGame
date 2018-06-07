import java.applet.Applet;
import java.awt.*;
//import java.awt.image.ImageObserver;
//import java.awt.image.ImageProducer;


public class GameObject extends Applet
{

    String name;
    int type;
    int x;
    int y;
    Image poster;


    public GameObject()
    {

    }

    public GameObject(String objectName, int objectType, int xOffset, int yOffset)  //  default constructor
    {

        name = objectName;
        x = xOffset;
        y = yOffset;
        //drawObject();


    }

    public void paint(Graphics g)
    {
        poster = getImage(getDocumentBase(), "/home/keegan/Desktop/drek.jpeg");
        g.drawImage(poster, 20, 20, this);
        g.drawLine(0,0,10,10);

    }

    public void move(int xOffset, int yOffset)
    {
        x = xOffset;
        y = yOffset;
    }

    public void drawBody(Graphics g, int xOffset, int yOffset)
    {
        move(xOffset, yOffset);
        g.setColor(Color.red);
        g.drawOval(0,0,10,10);


    }


}
//  Chapter 8, slide 35 [NOW IM ON CHAPTER 9 slide 17]
/*


Create a game in Java using classes and methods. It may be based on anything you like, but must include decisions made by the user
(Zork/Oregon Trail) and must include graphics drawn on an Applet showing the user locations, enemies, items, etc.
You must write the code to draw the images on the Applet for each object.

For a grade up to a 90, you may adapt one of your previous games to the Applet graphics version.


Image i = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };


 */
