package belajar10;

// inheritance adalah hubungan is-a

class BangunDatar{
    
    void luas(){}

    void keliling(){}
}

class Persegi extends BangunDatar{
    private int sisi;

    void setData(int sisi){
        this.sisi = sisi;
    }

    @Override
    void luas(){
        int hasil = sisi * sisi;
        System.out.println("luas persegi = " + hasil);
    }

    @Override
    void keliling(){
        int hasil = 4 * sisi;
        System.out.println("keliling persegi = " + hasil);
    }
}

class PersegiPanjang extends BangunDatar{
    int panjang;
    int lebar;

    void setData(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    void luas(){
        int hasil = panjang * lebar;
        System.out.println("luas dari persegi panjang = " + hasil);
    }

    @Override
    void keliling(){
        int hasil = (2*panjang) + (2*lebar);
        System.out.println("keliling dari persegi panjang = " + hasil);
    }
}

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang persegipanjang = new PersegiPanjang();

        // persegi
        persegi.setData(5);
        persegi.luas();
        persegi.keliling();
        // persegi panjang
        persegipanjang.setData(8, 6);
        persegipanjang.luas();
        persegipanjang.keliling();
    }
}