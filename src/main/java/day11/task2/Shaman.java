package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    public Shaman() {
        health = 100;
        physDef = 20;
        physAtt = 10;
        healHimself = 50;
        healTeammate = 30;
        magicAtt = 15;
        magicDef = 20;
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}


