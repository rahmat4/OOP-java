package belajar8;

import java.util.ArrayList;

class Player{
    private static ArrayList<String> addName = new ArrayList<>();
    private static int numberOfPlayer;
    private String name;

    Player(String name){
        this.name = name;
        numberOfPlayer();
        Player.addName.add(this.name);
    }

    static int numberOfPlayer(){
        return numberOfPlayer++;
    }

    void display(){
        System.out.println("name player : " + this.name);
    }

    // menggunakan for biasa
    static void show(){
        for(int i=0;i<addName.size();i++){
            System.out.printf("name : %s\n",addName.get(i));
        }
    }

    // menggunakan for each
    static void showEach(){
        for(String nama : addName){
            System.out.println("nama : " + nama);
        }
    }

    static ArrayList<String> getName(){
        return Player.addName;
    }
}

public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("ilas");
        Player player2 = new Player("daus");
        Player player3 = new Player("rahmat");
        Player player4 = new Player("akmal");
        Player player5 = new Player("wirangga");
        System.out.println("name : " + Player.getName() + "\n");
        System.out.println("Menggunakan for biasa");
        Player.show();
        System.out.println("\nMenggunakan for each");
        Player.showEach();

        System.out.println("\nnumber of Player : " + Player.numberOfPlayer());
    }
}