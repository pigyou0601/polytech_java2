package com.survivalcoding;

public class Wizard {
    String name;
    int hp;
    private int mp = 100;

    public void heal(Hero hero) {
        if (this.mp >= 10) {
            int heal = 20;
            hero.setHp(hero.getHp() + heal);
            this.mp -= 10;
            System.out.println("힐을 시전했습니다. " + hero.name + "HP : " + hero.getHp());
        }
    }
}
