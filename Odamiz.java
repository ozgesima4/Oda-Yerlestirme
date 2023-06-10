
package yerleşim;

import java.util.ArrayList;
import java.util.List;



public class Odamiz {
    int alan;
    String tip;  //odanın tipi ve alanını sadece bu sınıf kullandı.
    List<Mobilya> mobilyalar;;
    
    public Odamiz(){
        super();
    }
    
    
    public Odamiz(int alan,String tip){
        this.alan=alan;
        this.tip=tip;
        this.mobilyalar = new ArrayList<>();
    }
   
    void MobilyaEkle(Mobilya yeni_mobilya){   //mobilya ekleme methotu ama eğer önce eklenenlerden biriyle aynı
        for (Mobilya mobilya : mobilyalar) {  //konum istenirse bunu reddedicez. 
            if(mobilya.koordinat.getX() == yeni_mobilya.koordinat.getX() &&
                mobilya.koordinat.getY() == yeni_mobilya.koordinat.getY()) {
                System.out.println("Aynı konumda başka bir mobilya mevcut.");
                return;
              }
           
        }
         mobilyalar.add(yeni_mobilya);  //değilse de odaya mobilyayı ekleriz
    }
    
      void listele(){
          System.out.println("mobilyalar:");  //mobilyaları foreach ile listeledik
          System.out.println("odanın alani:"+this.alan+"tipi"+this.tip);
          for (Mobilya mobilya : mobilyalar) {
              mobilya.yazdir();
          }
      }
      
      void tümünügoster(){
          int counter=1;
          for (Mobilya mobilya : mobilyalar) {  //mobilyalarıkullanıcıya 1.si mavi masa vs gibi tanım yaptık
            if (mobilya != null) {
                System.out.println(counter+". mobilya");
                mobilya.goster();
                counter++;
            }
        }
      }
    
}
