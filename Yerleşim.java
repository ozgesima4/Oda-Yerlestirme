package yerleşim;

public class Yerleşim {

    public static void main(String[] args) {
        //istenilen özelliklerde nesneler ürettik odada da görüntüleme sağladık
        
        Odamiz odamiz = new Odamiz(30, "Misafir Odası");
        
        Koltuk koltuk1 = new Koltuk(new Konum(20, 50), "Mavi","L koltuk", 1);
        Koltuk koltuk2 = new Koltuk(new Konum(300, 100), "Gri","sallanan koltuk", 3);
        Masa masa = new Masa(new Konum(100, 200), "Kahve","cam masa", 4, 2);
        
        odamiz.MobilyaEkle(koltuk1);
        odamiz.MobilyaEkle(koltuk2);
        odamiz.MobilyaEkle(masa);
        
        odamiz.listele();
        odamiz.tümünügoster();
       
    }
    
}
