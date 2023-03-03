public abstract class Enemy {

    protected int health;
    protected int attackDamage;
    protected String name;

    public Enemy(int health, int attackDamage, String name) {
        this.health = health;
        this.attackDamage = attackDamage;
        this.name = name;
    }

    public abstract void attack();
    public abstract void takeDamage(int damage);
    public abstract boolean isAlive();

    public String getName() {
        return name;
    }
}
