package BangunDatar;
import java.util.*;
class bangundatar {
   protected double keliling;
    protected double luas;
    
    public bangundatar(double kel, double lu) {
        super();
        keliling = kel;
        luas = lu;
    }
}

class trapesium extends bangundatar{
    
    double sisi_sej_ab, sisi_sej_cd, sisi_miring_ad, sisi_miring_bc, tinggi;
    
    public trapesium (double kel, double lu){
        super(kel, lu);
    }
  
    public void sisitrapesium(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan panjang sisi sejajar ab: ");
        sisi_sej_ab = input.nextDouble();
        System.out.print("masukan panjang sisi sejajar cd: ");
        sisi_sej_cd = input.nextDouble();
        System.out.print("masukan panjang sisi miring ad: ");
        sisi_miring_ad = input.nextDouble();
        System.out.print("masukan panjang sisi miring bc: ");
        sisi_miring_bc = input.nextDouble();
        System.out.print("masukan tinggi trapesium: ");
        tinggi = input.nextDouble();
    }
    
    private double luastrapesium(){
        luas = 0.5*(sisi_sej_ab*sisi_sej_cd)*tinggi;
        return luas;
    }
    private double keltrapesium(){
        keliling = sisi_sej_ab+sisi_sej_cd+sisi_miring_ad+sisi_miring_bc;
        return keliling;
    }
    
    public void display_trapesium(){
        System.out.println("luas Trapesium = " + luastrapesium());
        System.out.println("keliling Trapesium = " + keltrapesium());
    }
}

class persegi extends bangundatar{
    
    double sisi;
    
    public persegi (double kel, double lu){
        super(kel, lu);
    }
    
    public void sisipersegi(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan sisi persegi ");
        sisi = input.nextDouble();
    }
    
    private double luaspersegi(){
        luas = sisi * sisi;
        return luas;
    }
    private double kelpersegi(){
        keliling = 4 * sisi;
        return keliling;
    }
    
    public void display_persegi(){
        System.out.println("luas persegi = " + luaspersegi());
        System.out.println("keliling persegi= " + kelpersegi());
    }
}
class lingkaran extends bangundatar{
    
    double phi = 3.14;
    double jarijari;
    
    
    public lingkaran (double kel, double lu){
        super(kel, lu);
    }
    
    public void jari(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan jari-jari: ");
        jarijari = input.nextDouble();
    }
    
    private double luaslingkaran(){
        luas = phi*jarijari*jarijari;
        return luas;
    }
    private double kellingkaran(){
        keliling = 2*phi*jarijari;
        return keliling;
    }
    
    public void display_lingkaran(){
        System.out.println("luas lingkaran = " + luaslingkaran());
        System.out.println("keliling lingkaran = " + kellingkaran());
    }
}

class persegipanjang extends bangundatar{
    
    double panjang, lebar;
    
    public persegipanjang (double kel, double lu){
        super(kel, lu);
    }
    
    public void panjanglebar(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan panjang: ");
        panjang = input.nextDouble();
        System.out.print("masukan lebar: ");
        lebar = input.nextDouble();
    }
    
    private double luaspersegipanjang(){
        luas = panjang * lebar;
        return luas;
    }
    private double kelpersegipanjang(){
        keliling = 2*(panjang+lebar) ;
        return keliling;
    }
    
    public void display_persegipanjang(){
        System.out.println("luas persegi panjang = " + luaspersegipanjang());
        System.out.println("keliling persegi panjang = " + kelpersegipanjang());
    }
}

class elips extends bangundatar{
    
    double sumbu_a, sumbu_b;
    double phi = 3.14;
    
    public elips (double kel, double lu){
        super(kel, lu);
    }
    
    public void sumbuelips(){
        Scanner input = new Scanner(System.in);
        System.out.print("masukan panjang sumbu a: ");
        sumbu_a = input.nextDouble();
        System.out.print("masukan panjang sumbu b: ");
        sumbu_b = input.nextDouble();
    }
    
    private double luaselips(){
        luas = 0.25*phi*sumbu_a*sumbu_b;
        return luas;
    }
    private double kelelips(){
        keliling = 0.5*phi*(sumbu_a+sumbu_b) ;
        return keliling;
    }
    
    public void display_elips(){
        System.out.println("luas elips = " + luaselips());
        System.out.println("keliling elips = " + kelelips());
    }
}
class Kuis {

    public static void main(String[] args) {
        
        int pil, ulang;
        Scanner inputuser = new Scanner(System.in);
        do{
            System.out.println("====== MENU =======");
            System.out.println("1. Trapesium");
            System.out.println("2. Persegi");
            System.out.println("3. Lingkaran");
            System.out.println("4. Persegi Panjang");
            System.out.println("5. Elips");
            System.out.print("masukan pilihan     : ");
            pil = inputuser.nextInt();
            
            switch (pil){
                case 1 :
                    trapesium t = new trapesium(1,1);
                    t.sisitrapesium();
                    t.display_trapesium();
                    break;
                  
                case 2 :
                    persegi p = new persegi(1,1);
                    p.sisipersegi();
                    p.display_persegi();
                    break;
                       
                case 3 :
                    lingkaran l = new lingkaran(1,1);
                    System.out.println("menghitung luas dan keliling Lingkaran");
                    l.jari();
                    l.display_lingkaran();
                    break;
                    
                case 4 :
                    persegipanjang pp = new persegipanjang(1,1);
                    System.out.println("menghitung luas dan keliling persegi panjang");
                    pp.panjanglebar();
                    pp.display_persegipanjang();
                    break;
                    
                case 5 :
                    elips e = new elips(1,1);
                    System.out.println("menghitung luas dan keliling elips");
                    e.sumbuelips();
                    e.display_elips();
                  
                default:
                    System.out.println("maaf pilihan tidak tersedia");
                    return;
            }
            System.out.println("ulang lagi? :1.(ya)/2.(no)");
            ulang = inputuser.nextInt();
        } while(ulang<2);
    }
} 
