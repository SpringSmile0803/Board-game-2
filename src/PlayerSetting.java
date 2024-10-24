import java.util.HashMap;
import javax.swing.*;

public class PlayerSetting {
    private String name;
    private int position;
    
    public PlayerSetting(String name) {
        this.name = name;
        this.position = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int nums) {
        position += nums;
    }

    public void check() {
        HashMap<Integer, Integer> checklist_Map = new HashMap<>();

        checklist_Map.put(6, 21);
        checklist_Map.put(8, 30);
        checklist_Map.put(28, 84);
        checklist_Map.put(58, 77);
        checklist_Map.put(75, 86);
        checklist_Map.put(81, 100);
        checklist_Map.put(23, 12);
        checklist_Map.put(52, 29);
        checklist_Map.put(57, 40);
        checklist_Map.put(66, 22);
        checklist_Map.put(88, 15);
        checklist_Map.put(96, 51);
        checklist_Map.put(97, 82);

        if (checklist_Map.containsKey(position)) {
            int oldPosisiont = position;
            position = checklist_Map.get(position);
            int newPosision = position;
            if (oldPosisiont < newPosision) {
                JOptionPane.showMessageDialog(null, name + " from " + oldPosisiont + " increase to " + newPosision);
            } else {
                JOptionPane.showMessageDialog(null, name + " from " + oldPosisiont + " decrease to " + newPosision);
            }
        }
    }
}