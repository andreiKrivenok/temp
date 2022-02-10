package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    public Magician() {
        this.health = 100;
        this.physAtt = 5;
        this.physDef = 0;
        this.magicDef = 80;
        this.magicAtt = 20;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - physAtt * hero.physDef / 100);
        if (hero.health < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else if (hero.health > HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        }
    }

    public void magicalAttack(Hero hero) {
        hero.health = hero.health - (magicAtt - magicAtt * hero.magicDef / 100);
        if (hero.health < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else if (hero.health > HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
