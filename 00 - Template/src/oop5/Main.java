package oop5;

class Data{
    public int nilaiPublic;
    private int nilaiPrivate;
    private double nilaiDouble;

    public Data(){
        this.nilaiPublic = 0;
        this.nilaiPrivate = 5;
        this.nilaiDouble = 0;
    }

    public int  getNilaiPrivate(){
        return this.nilaiPrivate;
    }

    public void setNilaiDouble(double nilai){
        this.nilaiDouble = nilai;
    }

    public double getNilaiDouble(){
        return this.nilaiDouble;
    }
}

public class Main {
    public static void main(String[] args) {
        Data data = new Data();

        // public
        data.nilaiPublic = 20;
        System.out.println(data.nilaiPublic);

        // private
        System.out.println("nilai private : " + data.getNilaiPrivate());
        data.setNilaiDouble(17);
        System.out.println(data.getNilaiDouble());

    }
}