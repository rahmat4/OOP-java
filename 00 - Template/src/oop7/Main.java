package oop7;

class Player{
    private static int number;
    private String name;

    Player(String name){
        this.name = name;
        Player.number++;
    }

    void show(){
        System.out.println("name : " + this.name);
    }

    static void showNumber(){
        System.out.println("number : " + Player.number);
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("ilas");
        player1.show();
        Player player2 = new Player("daus");
        player2.show();
        Player.showNumber();
    }
}