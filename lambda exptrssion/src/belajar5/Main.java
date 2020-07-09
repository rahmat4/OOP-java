package belajar5;

interface clicktable{
    void onClick();
}

public class Button{
    private clicktable action;

    void setClickAction(clicktable action){
        this.action = action;
    }

    void doClick(){
        action.onClick();
    }
}

public class Main {
    public static void main(String[] args) {
        Button btn = new Button();
        String name = "Rahmat Pratama";

        // membuat class anonymous untuk implementasi interface
        btn.setClickAction(() -> {
            System.out.println("Tombol sudah di click");
            System.out.println("yay!");
            System.out.println("Hello " + name);
        });

        // memcoba click tombol
        btn.doClick();
    }
}