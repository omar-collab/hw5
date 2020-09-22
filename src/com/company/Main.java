package com.company;

public class Main {

    public static void main(String[] args) {
		Hero hero = new Hero(400,40,"огненный шар");
		Boss boss = new Boss();
		boss.setHealth(1000);
		boss.setDamage(100);
		boss.setDefenceType("physical");
		System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefenceType());
		for (int i = 0; i < createHeroes().length; i++) {
			System.out.println( " хп" + createHeroes()[i].getHeals() + " " + createHeroes()[i].getDamage() + " " + createHeroes()[i].getSuperAttack());
		}
    }

    public static Hero[] createHeroes(){
		Hero hero1  = new Hero(275,30,"ледяной шар");
		Hero hero2 = new Hero(200,25," ваденой шар");
		Hero hero3 = new Hero(300,35,"каменый шар");
		Hero[] heroes = {hero1, hero2, hero3};
		return heroes;
	}

}
