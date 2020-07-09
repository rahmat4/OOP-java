package oop8;

class bangunDatar{
    double luas(){
        System.out.println("menghitung luias bangun datar");
        return 0;
    }
    double keliling(){
        System.out.println("menghitung keliling bangun datar");
        return 0;
    }
}

class persegi extends bangunDatar{
    double sisi;
    @Override
    double luas(){
        double hasil = sisi * sisi;
        System.out.println("luas persegi = " + hasil);
        return hasil;
    }
    @Override
    double keliling(){
        double hasil = 4*sisi;
        System.out.println("keliling persegi = " + hasil);
        return hasil;
    }
}

class lingkaran extends bangunDatar{
    double r;
    @Override
    double luas(){
        double hasil = Math.PI*r*r;
        System.out.println("luas ligkaran = " + hasil);
        return hasil;
    }
    @Override
    double keliling(){
        double hasil = 2 * Math.PI *r;
        System.out.println("keliling lingkaran = " + hasil);
        return hasil;
    }
}

class persegiPanjang extends bangunDatar{
    double p;
    double l;
    @Override
    double luas() {
        double hasil = p * l;
        System.out.println("luas persegi panjang = " + hasil);
        return hasil;
    }
    @Override
    double keliling(){
        double hasil = (2*p) + (2*l);
        System.out.println("keliling persegi panjang = " + hasil);
        return hasil;
    }
}

class data{
    String name = "rahmat";
    int age = 17;
}

class data1 extends data{
    private String name = "daus";
    private int age = 16;

    void show(){
        System.out.println("mengambil data dari class indux");
        System.out.println("nama : " + super.name);
        System.out.println("age : " + super.age);
    }

    void show1(){
        System.out.println("mengmabil data dari class yang bersangkutan");
        System.out.println("name : " + this.name);
        System.out.println("age : " + this.age);
    }
}

public class Main {
    public static void main(String[] args) {
        //bangunDatar bangun = new bangunDatar();
        persegi persegi1 = new persegi();
        lingkaran lingkaran1 = new lingkaran();
        persegiPanjang persegiPanjang1 = new persegiPanjang();
        data1 dataNew = new data1();

        persegi1.sisi = 5;
        persegi1.luas();
        persegi1.keliling();
        System.out.println();
        lingkaran1.r = 12;
        lingkaran1.luas();
        lingkaran1.keliling();
        System.out.println();
        persegiPanjang1.p = 8;
        persegiPanjang1.l = 4;
        persegiPanjang1.luas();
        persegiPanjang1.keliling();
        System.out.println("\n------------------------------------\n");

        dataNew.show();
        dataNew.show1();
    }
}