
// import javax.swing.JFrame;

// class MyFrame {

//      MyFrame() {
//       JFrame f=new JFrame("dd");
//       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//       f.setSize(400,400);
//       f.setVisible(true);


//     new MyFrame();
//     System.out.println("aaa");
//      }

// }

import javax.swing.*;

public class MyFrame extends JFrame {

    MyFrame() {
        setTitle("My Frame");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
