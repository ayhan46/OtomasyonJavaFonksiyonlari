import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String,Integer> ogrenciNotu = new HashMap<>();
        ogrenciNotu.put(" Ayhan " , 100);
        ogrenciNotu.put(" Tayfun " , 50);
        ogrenciNotu.put(" Cansu " , 90);

        System.out.println(ogrenciNotu);
        System.out.println(" Ayhanin ders notu + " + ogrenciNotu.get(" Ayhan "));
        System.out.println(" Butun anahtar degerleri : " + ogrenciNotu.keySet());
        System.out.println(" Butun degerler " + ogrenciNotu.values());
        System.out.println(" Butun girdi ciftleri : " + ogrenciNotu.entrySet());

        ogrenciNotu.replace(" Ayhan ",30);
        System.out.println(ogrenciNotu);
        ogrenciNotu.remove(" Ayhan ");
        System.out.println(ogrenciNotu);
    }
}

