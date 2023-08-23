import java.util.ArrayList;
import java.util.HashMap;

public class ListOfMaps {
    public static void main(String[] args) {
        HashMap<String,String> ilkOgrenci = new HashMap<>();
        ilkOgrenci.put(" Isim "," Ayhan ");
        ilkOgrenci.put(" Soyisim "," Kömesögütlü ");
        ilkOgrenci.put(" Ders "," Matematik ");
        ilkOgrenci.put(" Not "," 90 ");

        System.out.println(ilkOgrenci);

        HashMap<String,String> ikinciOgrenci = new HashMap<>();
        ikinciOgrenci.put(" Isim "," Tayfun ");
        ikinciOgrenci.put(" Soyisim "," Kömesögütlü ");
        ikinciOgrenci.put(" Ders "," Türkce ");
        ikinciOgrenci.put(" Not "," 100 ");

        HashMap<String,String> ucuncuOgrenci = new HashMap<>();
        ucuncuOgrenci.put(" Isim "," Cansu ");
        ucuncuOgrenci.put(" Soyisim "," Kömesögütlü ");
        ucuncuOgrenci.put(" Ders "," Tarih ");
        ucuncuOgrenci.put(" Not "," 60 ");

        System.out.println(ilkOgrenci);
        System.out.println(ikinciOgrenci);
        System.out.println(ucuncuOgrenci);

        ArrayList<HashMap<String,String>> ogrenciListesi = new ArrayList<>();
        ogrenciListesi.add(ilkOgrenci);
        ogrenciListesi.add(ikinciOgrenci);
        ogrenciListesi.add(ucuncuOgrenci);

        System.out.println("*********");
        System.out.println(ogrenciListesi);
        System.out.println(ogrenciListesi.get(0));


    }
}
