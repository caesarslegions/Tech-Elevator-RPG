import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayerBackground {
    private String background;
    private String name;
    private Map<String, Integer> stats;
    private List<Item> inventory;
    private int hitPoints;

    public PlayerBackground(String background) {
        this.stats = new HashMap<>();
        this.inventory = new ArrayList<>();
        if (background.equalsIgnoreCase("Hopeful Student")) {
            this.stats.put("Heart", 10);
            this.stats.put("Intelligence", 3);
            this.stats.put("Charisma", 7);
        }
        if (background.equalsIgnoreCase("All-Knowing Instructor")) {
            this.stats.put("Heart", 5);
            this.stats.put("Intelligence", 10);
            this.stats.put("Charisma", 5);
        }
        if (background.equalsIgnoreCase("Pathway Guide")) {
            this.stats.put("Heart", 5);
            this.stats.put("Intelligence", 5);
            this.stats.put("Charisma", 10);
        }
        if (background.equalsIgnoreCase("Elevator Technician")) {
            this.stats.put("Heart", 7);
            this.stats.put("Intelligence", 7);
            this.stats.put("Charisma", 7);
        }
    }

    // Use this method to add specific items (from the Item class) to the player's inventory
    public void addItem(Item item) {
        this.inventory.add(item);
        // Update stat bonuses based on the item added
        Map<String, Integer> statBonuses = item.getStatBonuses();
        for (Map.Entry<String, Integer> entry : statBonuses.entrySet()) {
            String statName = entry.getKey();
            int bonus = entry.getValue();
            this.stats.put(statName, this.stats.get(statName) + bonus);
        }
    }

    public Map<String, Integer> getStats() {
        return stats;
    }

    public List<Item> getInventory() {
        return inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}