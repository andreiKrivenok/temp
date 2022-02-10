package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        health = 100;
        physDef = 80;
        physAtt = 30;
    }

    public void physicalAttack(Hero hero) {

        hero.health = hero.health - (physAtt - physAtt * hero.physDef / 100);
        if (hero.health < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else if (hero.health > HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
