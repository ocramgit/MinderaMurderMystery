package Weapons;
import java.util.ArrayList;

public class Weapons {
    String weaponName;
    String tipSus;
    String tipNonSus;
    boolean wasUsedToKill;

    public Weapons(String weaponName, String tipSus, String tipNonSus, boolean wasUsedToKill) {
        this.weaponName = weaponName;
        this.tipSus = tipSus;
        this.tipNonSus = tipNonSus;
        this.wasUsedToKill = wasUsedToKill;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public String getTipSus() {
        return tipSus;
    }

    public String getTipNonSus() {
        return tipNonSus;
    }

    public boolean wasUsedToKill() {
        return wasUsedToKill;
    }

    public static ArrayList<Weapons> CreateWeapons() {
        ArrayList<Weapons> arrayListWeapons = new ArrayList<>();

        Weapons knife = new Weapons("Knife", "This Knife is poorly clean", "This Knife is clean", false);
        Weapons pistol = new Weapons("Pistol", "This Pistol is poorly clean", "This Pistol is clean", false);
        Weapons pipe = new Weapons("Pipe", "This Pipe is poorly clean", "This Pipe is clean", false);
        Weapons chandelier = new Weapons("Chandelier", "This Chandelier is poorly clean", "This Chandelier is clean", false);
        Weapons rope = new Weapons("Rope", "This Rope is poorly clean", "This Rope is clean", false);
        Weapons hammer = new Weapons("Hammer", "This Hammer is poorly clean", "This Hammer is clean", false);

        arrayListWeapons.add(knife);
        arrayListWeapons.add(pistol);
        arrayListWeapons.add(pipe);
        arrayListWeapons.add(chandelier);
        arrayListWeapons.add(rope);
        arrayListWeapons.add(hammer);

        return arrayListWeapons;
    }

    public void setWasUsedToKill(boolean wasUsedToKill) {
        this.wasUsedToKill = wasUsedToKill;
    }
}
