package belajar2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Phone{
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

class phoneUser{
    private Phone phone;
    phoneUser(Phone phone){
        this.phone = phone;
    }
    void turnOnThePhone(){
        this.phone.powerOn();
    }
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    void makePhoneLounder(){
        this.phone.volumeUp();
    }
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
}

class Xiaomi implements Phone{
    private int volume;
    private boolean isPower;

    Xiaomi(){
        this.volume = 50;
    }
    int getVolume() {
        return volume;
    }
    @Override
    public void powerOn(){
        isPower = true;
        System.out.println("Handphone menyala....");
        System.out.println("Selamat Datang Di Xiaomi");
        System.out.println("Android version 34");
    }
    @Override
    public void powerOff(){
        isPower = false;
        System.out.println("Handphone dimatikan");
    }
    @Override
    public void volumeUp(){
        if(isPower){
            if(volume == MAX_VOLUME){
                System.out.println("volume full");
                System.out.println("sudah " + getVolume() + "%");
            }else{
                volume += 10;
                System.out.println("volume sekarang " + getVolume());
            }
        }else{
            System.out.println("nyalakan Handpohone nya dulu dong!!");
        }
    }
    @Override
    public void volumeDown(){
        if(isPower){
            if(volume == MIN_VOLUME){
                System.out.println("volume = 0%");
            }else{
                this.volume -= 10;
                System.out.println("volume sekarang " + this.getVolume());
            }
        }else{
            System.out.println("nyalakan Handpohone nya dulu dong!!");
        }
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        // membuat objek HP
        Phone redmi4A = new Xiaomi();
        // membuat objek user
        phoneUser rahmat = new phoneUser(redmi4A);
        rahmat.turnOnThePhone();

        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);

        while(true){
            System.out.println("===== APLIKASI INTERFACE =====");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar volume");
            System.out.println("[4] Kecilkan volume");
            System.out.println("[5] Exit");
            System.out.println("==============================");
            System.out.print(" pilih [1-5] : ");
            String aksi = input.readLine();
            if(aksi.equalsIgnoreCase("1")){
                rahmat.turnOnThePhone();
            }else if(aksi.equalsIgnoreCase("2")){
                rahmat.turnOffThePhone();
            }else if(aksi.equalsIgnoreCase("3")){
                rahmat.makePhoneLounder();
            }else if(aksi.equalsIgnoreCase("4")){
                rahmat.makePhoneSilent();
            }else if(aksi.equalsIgnoreCase("5")){
                System.exit(0);
            }else{
                System.out.println("pilihan anda tidak ada!!");
            }
        }
    }
}