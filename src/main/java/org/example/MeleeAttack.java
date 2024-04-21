package org.example;

public class MeleeAttack implements Attack{
  Monster attacker;

  /**
   * Constructor for MeleeAttack.
   * @param attacker
   */
  public MeleeAttack(Monster attacker) {
    this.attacker =  attacker;
  }

  /**
   * Attack method for MeleeAttack.
   * @param target
   * @return Integer
   */
  @Override
  public Integer attack(Monster target) {
    String message = attacker + " uses a melee attack on " + target;
    System.out.println(message);
    return null;
  }
}
