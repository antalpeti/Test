package swing;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

public class TestJSplitPane2 {
  private void init() {
    JFrame frame = new JFrame();
    JPanel one = new JPanel();
    one.setBackground(Color.YELLOW);
    JPanel two = new JPanel();
    two.setBackground(Color.GREEN);
    JPanel three = new JPanel();
    three.setBackground(Color.RED);
    JPanel four = new JPanel();
    four.setBackground(Color.BLUE);
    JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, one, two);
    splitPane.setResizeWeight(0.5);
    splitPane.setOneTouchExpandable(true);
    JSplitPane splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, three, four);
    splitPane2.setResizeWeight(0.5);
    splitPane2.setOneTouchExpandable(true);
    JSplitPane splitPane3 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, splitPane, splitPane2);
    splitPane3.setResizeWeight(0.5);
    splitPane3.setOneTouchExpandable(true);
    frame.setContentPane(splitPane3);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    frame.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        int reply =
            JOptionPane.showConfirmDialog(null, "Do you really want to exit?",
                "Exit form the application", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
          JOptionPane.showMessageDialog(null, "Bye! See you later :)");
          System.exit(0);
        }
      }
    });
    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new TestJSplitPane2().init();
  }
}
