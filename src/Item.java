import java.util.Map;

public class Item {
    private String name;
    private String description;
    private Map<String, Integer> statBonuses;

    public Item(String name, String description, Map<String, Integer> statBonuses) {
        this.name = name;
        this.description = description;
        this.statBonuses = statBonuses;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    //this getter is used in the "addItem" method in PlayerBackground
    public Map<String, Integer> getStatBonuses() {
        return statBonuses;
    }
}