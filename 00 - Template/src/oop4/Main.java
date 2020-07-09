package oop4;

class player{
    String name;
    double health;
    int level;

    Weapon weapon;
    Armor armor;

    player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("health : " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    String name;
    double AttackPower;

    Weapon(String name, double AttackPower){
        this.name = name;
        this.AttackPower = AttackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + ", power : " + this.AttackPower);
    }
}

class Armor{
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + ", defence : " + this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {
        player player1 = new player("ucup",100);
        player player2 = new player("otong",50);

        Weapon pedang = new Weapon("pedang",20);
        Weapon panah = new Weapon("panah",15);

        Armor bajuBesi = new Armor("baju besi",15);
        Armor bajuBaja = new Armor("baju baja",18);

        // player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player 2
        player2.equipWeapon(panah);
        player2.equipArmor(bajuBaja);
        player2.display();
    }
}