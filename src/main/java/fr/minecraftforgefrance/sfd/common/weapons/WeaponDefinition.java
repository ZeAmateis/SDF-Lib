package fr.minecraftforgefrance.sfd.common.weapons;

public class WeaponDefinition {

    private int cooldown;
    private int preFiringPause;
    private String id;
    private String ammoType;
    private EnumWeaponType weaponType;
    private int baseDamage;
    private String projectileType;

    public WeaponDefinition() {

    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getPreFiringPause() {
        return preFiringPause;
    }

    public void setPreFiringPause(int preFiringPause) {
        this.preFiringPause = preFiringPause;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAmmoType(String ammoType) {
        this.ammoType = ammoType;
    }

    public String getAmmoType() {
        return ammoType;
    }

    public void setWeaponType(EnumWeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public EnumWeaponType getWeaponType() {
        return weaponType;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setProjectileType(String projectileType) {
        this.projectileType = projectileType;
    }

    public String getProjectileType() {
        return projectileType;
    }
}
