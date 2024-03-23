public class Main {
    public static void main(String[] args) {
        Player player = new Player("Alper","bomb",100,100);
        player.setName("Berk");
        player.setWeapon("Bomb");
        System.out.println(player.toString());
        Monster monster = new Monster("Wolf",200,10);
        System.out.println(monster.toString());
    }
}
