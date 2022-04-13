package JOGO;

public class Monster {
    String name;
    int str;
    int hitPoints;
    int damage;
    String howl;
    String death;

    String MonsterName(String name) {
        return name;
    }

    int MonsterStr(int str) {
        return str;
    }

    int MonsterLife(int hitPoints) {
        return hitPoints;
        if (hitPoints <= 0) {
            MonsterDeath();
    }

    int MonsterDamage(int str) {
        damage = 3 * str;
        return damage;
    }

    void ReceiveDamage(int hitPoints) {
        this.hitPoints -= hitpoints;
        if (hitPoints <= 0) {
            MonsterDeath();
        }
    }

    void MonsterHowl() {
        System.out.println("Hakuna Matata!");
    }

    void MonsterDeath() {
        System.out.println("Monstro morreu!");
    }
}
