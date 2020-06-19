//object class
//Author: Chaise Ballotti
public class Unit {
  // finals are initialized once and never changed by the code.
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
  
  //constructors
  public Unit() {
	  name = null;
	  health = 0;
	  armor = 0;
	  magicResistance = 0;
	  range = 0;
	  mana = 0;
	  abilityPower = 0;
	  damage = 0;
	  attackSpeed = 0.0;
  }
  public Unit(String unitName) {
    name = unitName;
  }
  
  // double unitDamage is a parameter
  public void setDamage(double unitDamage) {
    damage = (int)unitDamage;
  }
  
  // overloading method
  public void setDamage(int unitDamage) {
	damage = unitDamage;
  }
  
  public void setAttackSpeed(double unitAttack) {
    attackSpeed = unitAttack;
  }
  
  public double getAttackSpeed() {
    // for readability right now in main
    System.out.println("Attack speed is: " + attackSpeed);
    return attackSpeed;
  }
  
  public String getName() {
    return name;
  }
  
  // int getDamage is the header
  public int getDamage() {
    // for readability right now in main
    System.out.println("Damage is: " + damage);
    return damage;
  }
  
  public double getDPS() {
    double damagePerSecond = damage * attackSpeed;
    //System.out.format("%s %s %f%n", name, DPS, damagePerSecond);
    return damagePerSecond;
  }
  

}
