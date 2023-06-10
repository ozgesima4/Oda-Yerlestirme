package yerleşim;

public class Masa extends Mobilya {
    int en ,boy;  //masaya en ve boy atadık

    public Masa(Konum konum, String renk, String tip,int eni,int boyu) {
        super(konum, renk, tip);  //mobilya sınıfının özelliklerini kullandık tekrar yazıp belleği şişirmedik
        this.en=eni;
        this.boy=boyu;
    }
    
    @Override  //birden fazla aynı adda methot var 
    void yazdir(){
        super.yazdir();  //özelliklerini yazdırır.
        System.out.println("Masanin eni:"+this.en+"boyu: "+this.boy);
       
    }
    
    @Override
    void goster(){
          
           System.out.println("MASA GOSTERİLİYOR.");
    }
    
}
