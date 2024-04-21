package org.example;

public class RangedAttack implements Attack{
  Monster attacker;

  /**
   * Constructor for RangedAttack.
   * @param attacker
   */
  public RangedAttack(Monster attacker) {
    this.attacker = attacker;
  }

  /**
   * Attack method for RangedAttack.
   * @param target
   * @return Integer
   */
  @Override
  public Integer attack(Monster target) {
    String message = attacker + " uses a ranged attack on " + target;
    System.out.println(message);
    return null;
  }
}
