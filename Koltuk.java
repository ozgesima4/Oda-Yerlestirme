package yerleşim;

public class Koltuk extends Mobilya{
    
    int kişisayisi;
    
    public Koltuk(Konum konum, String renk, String tip, int kişisayisi) {
        super(konum, renk, tip);  //baştan yazmadan diğer sınıftan yararlandk
        this.kişisayisi=kişisayisi;
    }
    
    @Override  //kendi methotunu göstermesini sağlarız
    void yazdir(){
    super.yazdir();
        System.out.println("kisi sayisi:"+kişisayisi);
}
    
    @Override
    void goster(){
        System.out.println("KOLTUK GOSTERİLİYOR.");
    }
}
