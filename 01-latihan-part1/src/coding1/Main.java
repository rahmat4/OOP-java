package coding1;

// class player
class Player{
    private String name;
    private double health;

    Weapon weapon;
    Armor armor;

    Player(String name,double health){
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void attack(Player enemy){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " Attacking " + enemy.name + "with power " + attackPower);
        enemy.defence(attackPower);
    }

    void defence(double attackPower){
        double damage;
        if(this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        }else{
            damage = 0;
        }
        this.health -= damage;
        System.out.println(this.name + " gets damage " + damage);
    }

    void display(){
        System.out.println("\nName : " + this.name);
        System.out.println("Health : " + this.health + " HP");
        weapon.display();
        armor.display();
    }
    
}

// class Weapon
class Weapon{
    String name;
    double attackPower;

    Weapon(String name,double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon : " + this.name + " , Attack : " + this.attackPower);
    }
}

// class Armor
class Armor{
    String name;
    double defencePower;

    Armor(String name,double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor : " + this.name + " , Defence : " + this.defencePower);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("ilas", 100);
        Player player2 = new Player("daus", 80);

        Weapon pedang = new Weapon("pedang", 80);
        Weapon panah = new Weapon("panah", 60);
        
        Armor bajuBesi = new Armor("baju besi", 50);
        Armor bajuBaja = new Armor("baju baja", 60);

        // player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player 2
        player2.equipWeapon(panah);
        player2.equipArmor(bajuBaja);
        player2.display();

        System.out.println("\nPERTEMPURAN\n");
        System.out.println("\nMatch 1");
        player1.attack(player2);
        player1.display();
        player2.display();

        System.out.println("\nMatch 2");
        player2.attack(player1);
        player1.display();
        player2.display();

    }
}