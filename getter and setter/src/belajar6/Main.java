package belajar6;

class encapsulasi{
    public int intPublic;
    private int intPrivate;

    encapsulasi(){
        this.intPublic = 5;
        this.intPrivate = 10;
    }

    int getIntPrivate(){
        return this.intPrivate;
    }

    int readIntPrivate(){
        return this.intPrivate;
    }

    void setIntPrivate(int intPrivate){
        this.intPrivate = intPrivate;
    }

    void addIntPrivate(int intPrivate){
        this.intPrivate = intPrivate;
    }
}

class persegi{
    private double sisi;
    private double panjang;

    persegi(double sisi, double panjang){
        sisi(sisi);
        panjang(panjang);
    }

    void sisi(double sisi){
        this.sisi = sisi;
    }

    void panjang(double panjang){
        this.panjang = panjang;
    }

    double luas(){
        return (2*sisi) + (2*panjang);
    }

    void display(){
        System.out.println("luas persegi : " + luas());
    }

}

public class Main {
    public static void main(String[] args) {
        encapsulasi encapsulasi1 = new encapsulasi();
        System.out.println("public : " + encapsulasi1.intPublic);
        System.out.println(encapsulasi1.getIntPrivate());
        encapsulasi1.setIntPrivate(20);
        System.out.println(encapsulasi1.getIntPrivate());
        encapsulasi1.addIntPrivate(15);
        System.out.println(encapsulasi1.getIntPrivate());
        encapsulasi1.addIntPrivate(28);
        System.out.println(encapsulasi1.readIntPrivate());
        System.out.println("\n------------------------------------\n");
        persegi persegi1 = new persegi(4, 5);
        persegi1.display();
        persegi1.sisi(6);
        persegi1.display();
        persegi1.panjang(8);
        persegi1.display();
    }
}