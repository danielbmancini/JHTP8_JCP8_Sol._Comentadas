import ex14_15.GUIEventsFrame;

import javax.swing.JFrame;

/*
    Exercise 14.15 main class
 */
public class GUIEvents {
    public static void main(String[] args) {
        GUIEventsFrame guiEventsFrame = new GUIEventsFrame();
        guiEventsFrame.setVisible(true);
        guiEventsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiEventsFrame.setSize(500, 600);
    }
}
