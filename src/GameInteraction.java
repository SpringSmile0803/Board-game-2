import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GameInteraction {

    public static void main(String[] args) {
        String[] Players = getName();
        
        for (String name: Players) {
            System.out.println(name);
        }
    }

    public static String[] getName() {
        JFrame jFrame = new JFrame();

        JOptionPane.showMessageDialog(jFrame, "Welcome");

        String[] Players = new String[4];
        String p1;

        for (int i = 1; i < 5; i++ ) {
            p1 = JOptionPane.showInputDialog(jFrame, "Enter Player " + i + " Name: ");
            JOptionPane.showMessageDialog(jFrame,  "Player " + i + " is: " + p1);
            Players[i-1] = p1;
        }

        return Players;
    } 
}
