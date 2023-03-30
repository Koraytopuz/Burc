
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String burc = "";
        boolean hatavarmi = false;
        int ay, gun;
        System.out.println("Kaçıncı ayda doğdunuz:");
        ay = input.nextInt();
        System.out.println("Ayın hangi gününde doğdunuz:");
        gun = input.nextInt();
        if (ay == 1){
            if (gun >= 1 && gun <= 31){
                if(gun>=22){
                    burc="Kova";
                }else{
                    burc="Oğlak";
                }
            }else{
                hatavarmi=true;
            }
        }else if (ay == 2) {
            if (gun >= 1 && gun <=28){
                if(gun>=20){
                    burc="Balık";
                }else{
                    burc="Kova";
                }
            }
            else{
                hatavarmi=true;
            }
        }
        else if (ay == 3) {
            if (gun >= 1 && gun <= 31) {
                if (gun >= 21) {
                    burc = "Koç";
                } else {
                    burc = "Balık";
                }
            }
            else{
                hatavarmi=true;
            }
        }else if (ay == 4) {
            if (gun >= 1 && gun <= 30){
                if(gun>=21){
                    burc="Boğa";
                }else{
                    burc="Koç";
                }
            }
            else{
                hatavarmi=true;
            }

        }else if (ay == 5) {
            if (gun >= 1 && gun <= 31){
                if(gun>=22){
                    burc="İkizler";
                }else{
                    burc="Boğa";
                }
            }else{
                hatavarmi=true;
            }
        }
        else if (ay == 6) {
            if (gun >= 1 && gun <= 30){
                if(gun>=23){
                    burc="Yengeç";
                }else{
                    burc="İkizler";
                }
            }else{
                hatavarmi=true;
            }
        }
        else if (ay == 7) {
            if (gun >= 1 && gun <= 31){
                if(gun>=23){
                    burc="Aslan";
                }else{
                    burc="Yengeç";
                }
            }else{
                hatavarmi=true;
            }
        }else if (ay == 8) {
            if (gun >= 1 && gun <= 31){
                if(gun>=23){
                    burc="Başak";
                }else{
                    burc="Aslan";
                }
            }else{
                hatavarmi=true;
            }
        }else if (ay == 9) {
            if (gun >= 1 && gun <= 30){
                if(gun>=23){
                    burc="Terazi";
                }else{
                    burc="Başak";
                }
            }else{
                hatavarmi=true;
            }
        }else if (ay == 10) {
            if (gun >= 1 && gun <= 31){
                if(gun>=23){
                    burc="Akrep";
                }else{
                    burc="Terazi";
                }
            }else{
                hatavarmi=true;
            }
        }else if (ay == 11) {
            if (gun >= 1 && gun <= 30){
                if(gun>=22){
                    burc="Yay";
                }else{
                    burc="Akrep";
                }
            }else{
                hatavarmi=true;
            }
        }else if (ay == 12) {
            if (gun >= 1 && gun <= 31){
                if(gun>=22){
                    burc="Oğlak";
                }else{
                    burc="Yay";
                }
            }else{
                hatavarmi=true;
            }
        }else{
            System.out.println("Hatalı ay bilgisi girildi.");
        }if (hatavarmi){
            System.out.println("Hatalı gün bilgisi girildi.");
        }else{
            System.out.println("Burcunuz:"+burc);
        }
    }
}