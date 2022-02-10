package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    public Paladin() {
        health = 100;
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
        healHimself = 25;
        healTeammate = 10;
    }

    public void physicalAttack(Hero hero) {
        hero.health = hero.health - (physAtt - physAtt * hero.physDef / 100);
        if (hero.health < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else if (hero.health > HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        }
    }

    public void healHimself() {
        health = health + healHimself;
        if (health < HEALTH_MIN) {
            health = HEALTH_MIN;
        } else if (health > HEALTH_MAX) {
            health = HEALTH_MAX;
        }
    }

    public void healTeammate(Hero hero) {
        hero.health = hero.health + healTeammate;
        if (hero.health < HEALTH_MIN) {
            hero.health = HEALTH_MIN;
        } else if (hero.health > HEALTH_MAX) {
            hero.health = HEALTH_MAX;
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }
}
