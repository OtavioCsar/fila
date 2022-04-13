package JOGO;

import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Player player1 = new Player();
    Monster minotaur = new Monster();
    String status = player1.Status();
    System.out.println(status);
    minotaur.ReceiveDamage(player1.DealsDamage());
    minotaur.hitPoints -= player1.DealsDamage();
  }
}