package JOGO;

public class Player {
    float positionY;
    float positionX;
    int life;
    String name;
    String status;
    int str;
    int pWeapon;
    int damage;
    /*
     * Player(String n, int ptsDeVida, float posInicialX, float posinicialY){
     * System.ou.println("Construtor do player");
     * nome = n;
     * ponstoDeVida = ptsDevida;
     * posicaoX = posInicialX;
     * posicaoX = posIniialY;
     * }
     * 
     */

    void Move(float postionX, float positionY) {
        positionX = positionX + 5;
        positionY = positionY + 5;
    }

    float ExibPositionx() {
        return positionX;
    }

    float ExibPositiony() {
        return positionY;
    }

    void Damage(int damage) {
        life = life - damage;
    }

    int Life(int life) {
        return life;
    }

    String Status(String name, String status) {
        status = "Nome: " + name + "Vida: " + life;
        return status;
    }

    int PlayerWeapon(int pWeapon) {
        Weapon weapon = new Weapon();
        pWeapon = weapon;
        return pWeapon;
    }

    int PlayerStr(int str) {
        str = str + pWeapon;
        return str;
    }

    int DealsDamage() {
        return str;
    }
}
