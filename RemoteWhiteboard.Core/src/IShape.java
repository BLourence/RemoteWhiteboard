import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import java.rmi.Remote;

/**
 * Created by BLourence on 15/02/15.
 */
public interface IShape extends Remote
{
    Point getPosition();
    void setPosition(Point point);

    void SetColour(Color colour);

    int getSize();
    void setSize(int s);

    void draw(Graphics graphics);
}
