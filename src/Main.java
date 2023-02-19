public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(600);
        boss.setDamage(60);
        boss.setWeapon("firearms");
        System.out.println("damage: " + boss.getDamage() + "\nhealth: " + boss.getHealth() + "\nweapon: " + boss.getWeapon());
    }
}