package oop1;

class Mahasiswa{
    String nama;
    String jurusan;
    String NIM;
    double ipk;
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.nama = "akmal";
        mahasiswa1.jurusan = "Rekayasa sosial";
        mahasiswa1.NIM = "1237213";
        mahasiswa1.ipk = 3.5;

        Mahasiswa mahasiswa2 = new Mahasiswa();
        mahasiswa2.nama = "wirangga";
        mahasiswa2.jurusan = "Teknik cheater";
        mahasiswa2.NIM = "12372332";
        mahasiswa2.ipk = 3.6;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.ipk + "\n");

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.ipk);
    }
}