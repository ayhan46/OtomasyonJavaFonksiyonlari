public class Main {
    public static void main(String[] args) {
        Araba ilkArabam = new Araba();
        ilkArabam.setModel(" Volvo ");
        System.out.println(" Ilk Arabamin modeli " + ilkArabam.getModel() + " ve fiyati " + Araba.arabaFiyati);
        ilkArabam.arabaFiyati = 500000;
        System.out.println(" Ilk Arabamin modeli " + ilkArabam.getModel() + " ve fiyati " + Araba.arabaFiyati);

        Araba ikinciArabam = new Araba();
        ikinciArabam.setModel(" BMW ");
        System.out.println(" Ikinci Arabamin modeli " + ikinciArabam.getModel() + " ve fiyati " + Araba.arabaFiyati);

        Araba ucuncuArabam = new Araba();
        ucuncuArabam.setModel(" Mercedes ");
        System.out.println(" Ucuncu Arabamin modeli " + ikinciArabam.getModel() + " ve fiyati " + Araba.arabaFiyati);

    }
}