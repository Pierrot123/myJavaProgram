import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextField;
import javafx.scene.control.Button;


public class FrameTest1
{

    public static void main(String args[])
    {
        Frame f = new Frame();
        Panel p = new Panel();
        
        Button b1 = new Button();
        Button b2 = new Button();
        Button b3 = new Button();
        Button b4 = new Button();
        Button b5 = new Button();
        Button b6 = new Button();
        Button b7 = new Button();
        Button b8 = new Button();
        Button b9 = new Button();
        Button b10 = new Button();
        Button b11 = new Button();
        Button b12 = new Button();
        Button b13 = new Button();
        Button b14 = new Button();

        TextField tf = new TextField(20);

        b1.setLabel("1");
        b2.setLabel("2");
        b3.setLabel("3");
        b4.setLabel("4");
        b5.setLabel("5");
        b6.setLabel("6");
        b7.setLabel("7");
        b8.setLabel("8");
        b9.setLabel("9");
        b10.setLabel("=");
        b11.setLabel("+");
        b12.setLabel("-");
        b13.setLabel("/");
        b14.setLabel("*");
        
        p.add(tf);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b13);
        p.add(b14);


        f.add(p);

        f.setTitle("첫 번째 프레임 입니다.");
        f.setBounds(500, 500, 300, 300);
        f.setVisible(true);
         
        
    }
}