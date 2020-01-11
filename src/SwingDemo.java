import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingDemo {

    JLabel jlab;

    SwingDemo() {
        JFrame jfrm = new JFrame("An Event Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(650, 650);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnAlpha = new JButton("Alpha");
        jbtnAlpha.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int a = 70;
                int b = 500;
                int x = a + (int) (Math.random() * b);
                int y = a + (int) (Math.random() * b);
                jbtnAlpha.setBounds(x, y, jbtnAlpha.getWidth() ,jbtnAlpha.getHeight());
                jlab.setText("Alpha was pressed");
            }
        });

        jfrm.add(jbtnAlpha);
        jlab = new JLabel("Press a button");

        jfrm.add(jlab);
        jfrm.setVisible(true);
    }


    public static void main (String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}