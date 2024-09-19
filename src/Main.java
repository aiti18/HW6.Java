enum WeaponType {
    SWORD, BOW, MAGIC
}

class Weapon {
    private WeaponType type;
    private String name;

    public Weapon(WeaponType type, String name) {
        this.type = type;
        this.name = name;
    }

    public WeaponType getType() {
        return type;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class GameEntity {
    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void printInfo() {
        System.out.println("Boss Info: ");
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon Type: " + weapon.getType());
        System.out.println("Weapon Name: " + weapon.getName());
    }
}

class Skeleton extends Boss {
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Arrow Count: " + arrowCount);
    }
}

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        Weapon bossWeapon = new Weapon(WeaponType.SWORD, "Excalibur");
        boss.setWeapon(bossWeapon);
        boss.printInfo();

        System.out.println();

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(15);
        skeleton1.setArrowCount(30);
        Weapon skeletonWeapon1 = new Weapon(WeaponType.BOW, "Bone Bow");
        skeleton1.setWeapon(skeletonWeapon1);
        skeleton1.printInfo();

        System.out.println();

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(20);
        skeleton2.setArrowCount(40);
        Weapon skeletonWeapon2 = new Weapon(WeaponType.BOW, "Dark Bow");
        skeleton2.setWeapon(skeletonWeapon2);
        skeleton2.printInfo();
    }
}
