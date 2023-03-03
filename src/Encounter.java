public class Encounter {
    private Enemy enemy;
    private SkillChallenge skillChallenge;

    public Encounter(Enemy enemy, SkillChallenge skillChallenge) {
        this.enemy = enemy;
        this.skillChallenge = skillChallenge;
    }

    public void start() {
        System.out.println("You have encountered a " + enemy.getName() + "!");
        System.out.println("Prepare for battle...");

        // Loop until either the player or the enemy is defeated
        while(enemy.isAlive() && skillChallenge.isOngoing()) {
            // Player takes their turn
            skillChallenge.playerTurn(enemy);

            // Enemy takes their turn if they are still alive
            if(enemy.isAlive()) {
                enemy.attack();
            }
        }

        // Check who won the encounter and output a message accordingly
        if(!enemy.isAlive()) {
            System.out.println("You have defeated the " + enemy.getName() + "!");
        } else {
            System.out.println("You have been defeated by the " + enemy.getName() + "!");
        }
    }
}