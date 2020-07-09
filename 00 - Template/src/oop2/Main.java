package oop2;

class Mahasiswa{
    String nama;
    String jurusan;
    String NIM;
    double ipk;

    Mahasiswa(String nama, String jurusan, String NIM, double ipk){
        this.nama = nama;
        this.jurusan = jurusan;
        this.NIM = NIM;
        this.ipk = ipk;

        System.out.println("nama    : " + nama);
        System.out.println("jurusan : " + jurusan);
        System.out.printf("NIM     : %s\n",NIM);
        System.out.printf("ipk     : %s\n\n",ipk);
    }
}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("ilas","Teknik cheater","235326",3.6);
        Mahasiswa mahasiswa2 = new Mahasiswa("daus","Teknik multi media","235236",3.9);
        Mahasiswa mahasiswa3 = new Mahasiswa("akmal","Rekayasa sosial","455236",2.7);
    }
}