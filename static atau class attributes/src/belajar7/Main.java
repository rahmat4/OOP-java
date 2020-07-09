package belajar7;

class Display{
    static String type = "Display";
    private String name;

    Display(String name){
        this.name = name;
    }

    void setType(String type){
        //this.type = type;
        Display.type = type; // paling di rekommendasikan
    }

    void display(){
        System.out.println(this.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display("Monitor");
        display1.display();
        Display display2 = new Display("Smarphone");
        display2.display();

        // merubah type
        display1.setType("Monitor");

        System.out.println("\nMenampilkan static class variable");
        System.out.println(display1.type);
        System.out.println(display2.type);
        System.out.println(Display.type); // paling di rekommendasikan
    }
}