package oop6;

class Display{
    static String type = "dislpay";
    private String name;

    Display(String name){
        this.name = name;
    }

    void show(){
        System.out.println("nama : " + this.name);
    }

    void setType(String type){
        Display.type = type;
    }
}

public class Main {
    public static void main(String[] args) {
        Display data1 = new Display("monitor");
        data1.show();
        Display data2 = new Display("smartphone");
        data2.show();

        data1.setType("laptop");

        System.out.println(data1.type);
        System.out.println(data2.type);
        System.out.println(Display.type); // paling di rekomendasikan
    }
}