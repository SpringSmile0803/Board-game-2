import javax.swing.*;
import java.awt.*;

public class GameController {
    public int currentPlayerIndex = 0;
    public PlayerSetting[] players;
    public PlayerNamePanel playerNamePanel;
    public RightItemPanel rightItemPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GameController().createAndShowGUI());
    }

    private void createAndShowGUI() {
        JFrame jframe = new JFrame();
        
        jframe.getContentPane().setBackground(new Color(233, 218, 182)); // Background
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        jframe.setUndecorated(true);                // no frame decorations
        
        String[] PlayerNames = GameInteraction.getName();
        players = new PlayerSetting[4];
        for (int i = 0; i < 4; i++) {
            players[i] = new PlayerSetting(PlayerNames[i]);
        }

        playerNamePanel = new PlayerNamePanel(this);
        TablePanel tablePanel = new TablePanel();
        rightItemPanel = new RightItemPanel(this, tablePanel);

        jframe.add(new TablePanel(), BorderLayout.WEST);
        jframe.add(playerNamePanel, BorderLayout.CENTER);
        jframe.add(rightItemPanel, BorderLayout.EAST);
        
        jframe.pack();
        jframe.setExtendedState(JFrame.MAXIMIZED_BOTH);         // Fullscreen
        jframe.setVisible(true);

    }


    public PlayerSetting[] getplayers() {
        return players;
    }

    public void setPlayers(PlayerSetting[] players) {
        this.players = players;
    }

    public int getcurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void setcurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }
}