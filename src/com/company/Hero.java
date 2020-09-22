package com.company;

public class Hero {
    private int heals;
    private int damage;
    private String superAttack;


    public int getHeals() {
        return heals;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperAttack() {

        return superAttack;
    }

    public Hero(int heals, int damage, String superAttack){
        this.heals = heals;
          this.damage = damage;
          this.superAttack = superAttack;

     }

    public Hero(int heals, int damage) {
        this.heals = heals;
        this.damage = damage;
    }
}
