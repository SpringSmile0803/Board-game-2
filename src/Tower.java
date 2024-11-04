// save tower
import java.util.HashMap;

public class Tower {
    
    // Enter position
    public String check_tower(int num) {
        if ((num >= 5 && num <= 14)||(num >= 20 && num <= 23)||(num >= 25 && num <= 44)||
            (num >= 50 && num <= 53)||(num >= 55 && num <= 59)||(num >= 65 && num <= 74)||
            (num >= 80 && num <= 83)||(num >= 85 && num <= 89)||(num >= 95 && num <= 99)) {
            return "Free tile";
        } else if(num == 25 || num == 55 || num == 85) {
            return "Pick the card";
        } else {
            return gettower(num);
        }
    }

    public String gettower(int num) {
        HashMap<Integer, String> TowerName = new HashMap<>();
        
        TowerName.put(0, "Tropicana The Residences");
        TowerName.put(1, "Pavilion Embassy Kuala Lumpur");
        TowerName.put(2, "Binjai On The Park");
        TowerName.put(3, "Marc Service Residence");
        TowerName.put(4, "The Mews");

        TowerName.put(20, "D'Ivo Residences");
        TowerName.put(21, "Petalz Residences");
        TowerName.put(22, "Southbank Residence");
        TowerName.put(23, "The Address");
        TowerName.put(24, "Waltz Residences");

        TowerName.put(30, "TTDI Ascencia");
        TowerName.put(31, "Sri TTDI");
        TowerName.put(32, "The Residence Condominium");
        TowerName.put(33, "Sinaran TTDI");
        TowerName.put(34, "Villa Flora");

        TowerName.put(45, "LEA by the Hills");
        TowerName.put(46, "KL East - The Ridge");
        TowerName.put(47, "Upperville @ 16 Quartz");
        TowerName.put(48, "Nadayu63");
        TowerName.put(49, "M Adora");

        TowerName.put(60, "Damai Residence");
        TowerName.put(61, "The Vyne");
        TowerName.put(62, "Kenwingston Avenue");
        TowerName.put(63, "Anyaman Residence");
        TowerName.put(64, "Razak City Residences");
        
        TowerName.put(75, "Tropicana Gardens");
        TowerName.put(76, "Emporis Kota Damansara");
        TowerName.put(77, "Sunway d'hill Residences");
        TowerName.put(78, "The Estana");
        TowerName.put(79, "Mahogany Residences");
        
        TowerName.put(90, "Mossaz @ Empire City");
        TowerName.put(91, "D'Erica Residences");
        TowerName.put(92, "D'Vervain Residences");
        TowerName.put(93, "D'Cosmos Residences");
        TowerName.put(94, "The Essence");

        return TowerName.get(num-1);
    }
}