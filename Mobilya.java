package yerleşim;

public class Mobilya {  //koltuk ve masa sınıfları miras alırlar aynı özellikleri tekrar yazmayız.
    Konum koordinat;
    String renk,tip;
    
    public Mobilya(){
        super();
    }
    
    public Mobilya(Konum konum,String renk, String tip){
        this.koordinat=konum;
        this.renk=renk;
        this.tip=tip;
    }
    
    void goster(){
        System.out.println("MOBİLYALAR GÖSTERİLİYOR!!!");
    }
    
    void yerinidegistir(Konum knm){  //eğer yeni konum eskisiyle aynı girilirse uyarı mesajı ver değilse yerleştir
        if(knm==this.koordinat){
            System.out.println("degistirmek istediginiz yer ayni");
        }else{
            this.koordinat=knm;
        }
    }
    
    void yazdir(){  //mobilyaların özelliklerimi yazdır tabi sınıflar kullanıp üzerine de başka eklemeler yapablir
        
        System.out.println(this.renk+"renkli olan mobilyanın tipi:"+this.tip+"dir ayrica konum bilgisi: "+this.koordinat);
    }
}
