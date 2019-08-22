package ex14_15;

import javax.swing.JFrame;

public class GUIEvents {
    public static void main(String[] args) {
        GUIEventsFrame guiEventsFrame = new GUIEventsFrame();
        guiEventsFrame.setVisible(true);
        guiEventsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guiEventsFrame.setSize(500, 600);
    }
}
