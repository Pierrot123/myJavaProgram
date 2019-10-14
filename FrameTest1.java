import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import javafx.scene.control.Button;

public class FrameTest1
{

    public static void main(String[] args)
    {
        Frame f = new Frame();
        Panel p = new Panel();
        
        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        Button b4 = new Button();

        b1.setLabel("Input1");
        b2.setLabel("Input2");
        b3.setLabel("Input3");
        b4.setLabel("Input4");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);

        f.add(p);

        f.setTitle("첫 번째 프레임 입니다.");
        f.setBounds(500, 500, 300, 300);
        f.setVisible(true);
         
        
    }
}