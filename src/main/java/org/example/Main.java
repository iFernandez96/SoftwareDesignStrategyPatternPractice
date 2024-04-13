package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    HashMap<String, Integer> items = new HashMap<>();
    items.put("gold", 5);
    List<Monster> monsters = new ArrayList<>();
    monsters.add(new Imp(15, 20, items));
    monsters.add(new Kobold(1, 5, items));
    for (Monster monster : monsters) {
      System.out.println(monster);
    }
  }
}