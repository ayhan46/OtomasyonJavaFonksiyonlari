import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> isimlerListesi = new ArrayList();

        isimlerListesi.add(" Bilal ");
        isimlerListesi.add(" Tayfun ");
        System.out.println(isimlerListesi);
        isimlerListesi.add(" Cansu ");
        isimlerListesi.add(" Filiz ");
        System.out.println(isimlerListesi);
        System.out.println(isimlerListesi.get(0));
        isimlerListesi.set(1," Tayfun ");
        System.out.println(isimlerListesi);
        String silinenIsim = isimlerListesi.remove(0);
        System.out.println(silinenIsim + " listeden cikartilmiştir. ");
        System.out.println(isimlerListesi);
        isimlerListesi.add(" Zeliha ");
        isimlerListesi.add(" Ayhan ");
        isimlerListesi.add(" Faruk ");
        System.out.println(isimlerListesi);
        System.out.println(" Listemizde olan element sayisi " + isimlerListesi.size() + " dir.");

        System.out.println(" Listede bilal ismi " + isimlerListesi.contains(" Bilal "));
        System.out.println(" Listede tayfun ismi " + isimlerListesi.contains(" Tayfun "));

        System.out.println(" Ismin liste numarasi " + isimlerListesi.indexOf(" Ayhan "));
        System.out.println(isimlerListesi.isEmpty());

        System.out.println("--------------");


        for (String isim:isimlerListesi){
            System.out.println(isim);

        }
    }
}
