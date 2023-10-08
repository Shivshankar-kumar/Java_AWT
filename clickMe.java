
//WAP to display a message "Click Me" Using AWT Classes which is FRAME.
import java.awt.*;
class First extends Frame{
    //constructor
    First(){
        Button b=new Button("Hi Shivshankar");
        b.setBounds(100, 100,100, 30);
        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
}
public class clickMe{

    public static void main(String[] args) {
        First f=new First();
    }
}