package oop3;

class Mahasiswa{
    // data member
    String nama;
    String jurusan;
    String NIM;

    // constructor
    Mahasiswa(String nama, String jurusan, String NIM){
        this.nama = nama;
        this.jurusan = jurusan;
        this.NIM = NIM;
    }

    // method tanpa return dan tanpa parameter
    void show(){
        System.out.println(this.nama);
        System.out.println(this.jurusan);
        System.out.println(this.NIM);
    }

    // method tanpa return dan dengan parameter
    void getNama(String nama){
        this.nama = nama;
    }

    // method dengan return dan tanpa parameter
    String showNama(){
        return this.nama;
    }

    String showJurusan(){
        return this.jurusan;
    }

    String showNIM(){
        return this.NIM;
    }

    // method dengan return dan dengan parameter
    String hello(String nama){
        return "hello " + nama + " apa kabar";
    }
}

public class Main {
    public static void main(String[] args) {
    Mahasiswa mahasiswa1 = new Mahasiswa("otong","Tekik pernikahan","214332");
    mahasiswa1.show();
    mahasiswa1.getNama("ucup");
    mahasiswa1.show();
    String dataNama = mahasiswa1.showNama();
    System.out.println(dataNama);
    String dataJurusan = mahasiswa1.showJurusan();
    System.out.println(dataNama);
    String dataNIM = mahasiswa1.showNIM();
    System.out.println(dataNIM);
    String Hello = mahasiswa1.hello("ilas");
    System.out.println(Hello);
    }
}