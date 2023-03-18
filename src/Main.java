public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss( 700, 50);
       boss.weapon.setWeaponType(WeaponType.COLDWEAPON);
       System.out.println(boss.info());

    }
}