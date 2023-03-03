public class MoonlightButterfly extends Enemy {

    public MoonlightButterfly() {
        super(150, 20, "Moonlight Butterfly");
    }

    @Override
    public void attack() {
        // Code to perform the MoonlightButterfly's attack
    }

    @Override
    public void takeDamage(int damage) {
        // Code to reduce MoonlightButterfly's health based on the damage taken
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}

