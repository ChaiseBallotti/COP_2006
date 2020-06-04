//object class
//Author: Chaise Ballotti
public class Unit {
  
  private final String DPS = " DPS is: ";
  private String name;
  private int health;
  private int armor;
  private int magicResistance;
  private int range;
  private int mana;
  private int abilityPower;
  private int damage;
  private double attackSpeed;
  private Item items;
  
  public Unit(String unitName) {
    name = unitName;
  }
  
  // double unitDamage is a parameter
  public void setDamage(double unitDamage) {
    damage = (int)unitDamage;
  }
  
  public void setAttackSpeed(double unitAttack) {
    attackSpeed = unitAttack;
  }
  
  public double getAttackSpeed() {
    // for readability right now in main
    System.out.println("Attack speed is: " + attackSpeed);
    return attackSpeed;
  }
  
  // int getDamage is the header
  public int getDamage() {
    // for readability right now in main
    System.out.println("Damage is: " + damage);
    return damage;
  }
  
  public double getDPS() {
    double damagePerSecond = damage * attackSpeed;
    System.out.format("%s %s %f%n", name, DPS, damagePerSecond);
    return damagePerSecond;
  }
  

}
