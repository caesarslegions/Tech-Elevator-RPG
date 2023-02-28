import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // ... create player character
        PlayerBackground[] playerBackgrounds = {
                new PlayerBackground("Hopeful Student"),
                new PlayerBackground("All-Knowing Instructor"),
                new PlayerBackground("Pathway Guide"),
                new PlayerBackground("Elevator Technician")
                // ... add other backgrounds, as needed
        };

        // ... present list of backgrounds to user

        System.out.println("Greetings, tech student! \nYou have been mystically transported from your realm of monotony and despair to a strange new land of chaos and adventure. \nMay the Great Elevator lift you to new heights of success. ");
        System.out.println("Consider the following starting backgrounds and enter the number associated with the background you want to choose: \n [0] Hopeful Student \n [1] All-Knowing Instructor \n [2] Pathway Guide \n [3] Elevator Technician");

        int backgroundChoice = Integer.parseInt(userInput.nextLine()); // get user's choice
        PlayerBackground chosenPlayerBackground = playerBackgrounds[backgroundChoice];


        // ... initialize player's stats with the chosen background


        //backgroundChoice responses
        if (backgroundChoice == 0) {
            System.out.println("A daring choice! \nHow can a mere student hope to conquer the dangers that await? \nPerhaps, however, your misplaced optimism will prove valuable in the journey ahead...");
        } else if (backgroundChoice == 1) {
            System.out.println("Good choice. \nFew can hope to be as prepared as a seasoned instructor. \nYour knowledge and experience will prove vital in the days ahead...");
        } else if (backgroundChoice == 2) {
            System.out.println("A wise choice, for there is but one pathway to the Great Elevator. \nYour journey is sure to be filled with great tribulation, but you know that the Great Elevator will ensure your safety...");
        } else if (backgroundChoice == 3) {
            System.out.println("Are you sure you want this background? Few are worthy of the role of Elevator Technician.");
            String answer = userInput.nextLine();
            if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("yeah") || answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yep")) {
                System.out.println("Do you truly consider yourself worthy?");
                String secondAnswer = userInput.nextLine();
                if (secondAnswer.equalsIgnoreCase("yes") || secondAnswer.equalsIgnoreCase("yeah") || secondAnswer.equalsIgnoreCase("y") || secondAnswer.equalsIgnoreCase("yep")) {
                    System.out.println("On a scale of 1 - 10, how much faith do you have in yourself that you can handle the pressure of being an Elevator Technician?");
                    String thirdAnswer = userInput.nextLine();
                    if (thirdAnswer.equalsIgnoreCase("10") || thirdAnswer.equalsIgnoreCase("ten")) {
                    System.out.println("Your confidence is admirable. Let's see if you've got what it takes...");
                    } else {
                        System.out.println("Your faith must be absolute! Try again.");
                        System.exit(0);
                    }
                } else {
                    System.out.println("No need to doubt yourself. I have faith that you are worthy of the role of Elevator Technician.");
                    System.exit(0);
                }
            } else {
                System.out.println("Please try again. This time, ensure that you are certain about your decision.");
                System.exit(0);
            }
        }

        //display starting statistics to user
        System.out.println("Your starting statistics are as follows: " + chosenPlayerBackground.getStats());

        //name
        System.out.println("What is your name, adventurer?");
        String name = userInput.nextLine();
        chosenPlayerBackground.setName(name);
        System.out.println("Greetings, " + name + "! You will make a fine adventurer in these perilous lands.");

        //choosing a starting item
        System.out.println("Before beginning your journey, you will be able to take one item with you.\nChoose carefully from the following and enter the number associated with the item...");
        System.out.println(" [0] ELEVATOR EXCALIBUR - this sword glows with a pallid blue shine...\n [1] PATHWAY PROTECTOR - this shield bears the holy emblem of the upward-pointing arrow\n [2] CHEATGPT - this small device has an uncanny talent for giving reliable advice in any situation... \n [3] PERFECT PITCH - this wearable wristband produces eloquent elocution when the wearer speaks for 30 - 40 seconds...\n [4] NIFTY NETWORK - this laminated business card instantly increases your credibility in social situations..." );

        // Declare and initialize the starting items
        Map<String, Integer> elevatorExcaliburStatBonuses = new HashMap<>();
        elevatorExcaliburStatBonuses.put("Heart", 2);
        elevatorExcaliburStatBonuses.put("Charisma", 2);
        Item elevatorExcalibur = new Item("Elevator Excalibur", "this sword glows with a pallid blue shine...", elevatorExcaliburStatBonuses);

        Map<String, Integer> pathwayProtectorStatBonuses = new HashMap<>();
        pathwayProtectorStatBonuses.put("Heart", 1);
        pathwayProtectorStatBonuses.put("Intelligence", 1);
        pathwayProtectorStatBonuses.put("Charisma", 1);
        Item pathwayProtector = new Item("Pathway Protector", "this shield bears the holy emblem of the upward-pointing arrow", pathwayProtectorStatBonuses);

        Map<String, Integer> cheatGPTStatBonuses = new HashMap<>();
        cheatGPTStatBonuses.put("Intelligence", 3);
        Item cheatGPT = new Item("CheatGPT", "this small device has an uncanny talent for giving reliable advice in any situation... ", cheatGPTStatBonuses);

        Map<String, Integer> perfectPitchStatBonuses = new HashMap<>();
        perfectPitchStatBonuses.put("Intelligence", 2);
        perfectPitchStatBonuses.put("Charisma", 2);
        Item perfectPitch = new Item("Perfect Pitch", "this wearable wristband produces eloquent elocution when the wearer speaks for 30 - 40 seconds...", perfectPitchStatBonuses);

        Map<String, Integer> niftyNetworkStatBonuses = new HashMap<>();
        niftyNetworkStatBonuses.put("Charisma", 3);
        Item niftyNetwork = new Item("Nifty Network", "this laminated business card instantly increases your credibility in social situations...", niftyNetworkStatBonuses);

        // Add the corresponding item to the player's inventory using the "addItem" method. The stat bonuses will automatically apply
        String startingItemSelection = userInput.nextLine();

        switch(startingItemSelection) {
            case "0":
                chosenPlayerBackground.addItem(elevatorExcalibur);
                break;
            case "1":
                chosenPlayerBackground.addItem(pathwayProtector);
                break;
            case "2":
                chosenPlayerBackground.addItem(cheatGPT);
                break;
            case "3":
                chosenPlayerBackground.addItem(perfectPitch);
                break;
            case "4":
                chosenPlayerBackground.addItem(niftyNetwork);
                break;
            default :
                System.out.println(name + ", you have not entered a valid selection! Please run the program and try again. Or, continue your adventure with a starting item, if you dare...");
                break;
        }
    }
}