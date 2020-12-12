import javax.swing.*;

public class MainView {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runGUI();
            }
        });

    }

    public static void runGUI(){
        TextPane textPane = new TextPane();
    }

}
