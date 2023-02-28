import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;


public class AddItemTest {

    //this test will use Elevator Excalibur as a sample test

    private PlayerBackground sampleBackground = new PlayerBackground("Elevator Technician");

    @Test
    public void addElevatorExcalibur_should_increase_heart_by_two_and_charisma_by_two() {
        Map<String, Integer> sampleElevatorExcaliburMap = new HashMap<>();
        sampleElevatorExcaliburMap.put("Heart", 9);
        sampleElevatorExcaliburMap.put("Intelligence", 7);
        sampleElevatorExcaliburMap.put("Charisma", 9);

        Map<String, Integer> elevatorExcaliburMap = new HashMap<>();
        elevatorExcaliburMap.put("Heart", 2);
        elevatorExcaliburMap.put("Charisma", 2);
        Item elevatorExcalibur = new Item("Elevator Excalibur", "this sword glows with a pallid blue shine...", elevatorExcaliburMap);

        sampleBackground.addItem(elevatorExcalibur);

        assertEquals(sampleElevatorExcaliburMap, sampleBackground.getStats());
    }


}
