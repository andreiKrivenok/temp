package day7;

public class Player {

    private int stamina;
    private static int countPlayers;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina > 1) {
            stamina--;
        } else if (stamina == 1) {
            stamina--;
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест", (6 - countPlayers));
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}
