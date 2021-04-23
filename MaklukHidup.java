package MaklukHidup;

class MakhlukHidup {
    String bernafas;
    String berkembang_biak;
    String jenis_makanan;
}

class manusia extends MakhlukHidup{
    String bernafas = "paru-paru";
    String berkembang_biak = "melahirkan";
    String jenis_makanan = "omivora";
    
    void manusia(){
        System.out.println("manusia adalah mahluk hidup yang paling sempurna");
    }
}   

class ayam extends MakhlukHidup{
    String bernafas = "paru-paru";
    String berkembang_biak = "bertelur";
    String jenis_makanan = "omivora";
    
    void ayam(){
        System.out.println("ayaam mempunyai suara kukuruyuuu....");
    }
}

class singa extends MakhlukHidup{
    String bernafas = "paru-paru";
    String berkembang_biak = "melahirkan";
    String jenis_makanan = "karnivora";
    
    void singa(){
        System.out.println("singa merupakan raja hutan");
    }
}
class soal2 {
    public static void main(String[] args) {
        manusia riyo = new manusia();
        System.out.println("Manusia");
        System.out.println("mahluk hidup ini bernafas dengan " + riyo.bernafas);
        System.out.println("mahluk hidup berkembang biak dengan " + riyo.berkembang_biak);
        System.out.println("jenis makanan " + riyo.jenis_makanan);
        riyo.manusia();
        
        System.out.println("======================================");
        
        System.out.println("Ayam");
        ayam bangkok = new ayam();
        System.out.println("mahluk hidup ini bernafas dengan " + bangkok.bernafas);
        System.out.println("mahluk hidup berkembang biak dengan " + bangkok.berkembang_biak);
        System.out.println("jenis makanan " + bangkok.jenis_makanan);
        bangkok.ayam();
        
        System.out.println("======================================");
        
        System.out.println("Singa");
        singa king = new singa();
        System.out.println("mahluk hidup ini bernafas dengan " + king.bernafas);
        System.out.println("mahluk hidup berkembang biak dengan " + king.berkembang_biak);
        System.out.println("jenis makanan " + king.jenis_makanan);
        king.singa();
    }
}
