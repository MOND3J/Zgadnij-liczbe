public class Main {
    public static void main(String[] args) {
        // tu program główny
        System.out.println("dzień dobry");

        //typy proste
        //pisane z małej litery, zmienne a nie obiekty -> nie mają pól i metod
        //typy całkowite
        byte liczba1 = 100;
        short liczba2 = 300;
        int liczba3 = 1234565;
        long liczba4 = 436222749;
        System.out.println("Twoja liczba " + liczba1);

        //typy zmiennoprzecinkowe, rzeczywiste, z ułamkiem
        float liczbaRzeczywista1 = 3.14f;
        double liczbaRzeczywista2 = 23.4564;
        System.out.println("Liczba rzeczywista " + liczbaRzeczywista2);

        //typ logiczny
        boolean czyPrawda = true;

        //typ znakowy
        char znak = 'a';

//        Napisz program w którym wylosujesz liczbe z zakresu od 1 do 100.
//        Wpiszesz liczbe z klawiatury i powiesz czy ktoś zgadł

        int wylosowanaLiczba = (int)(Math.random() * 100) + 1;
        System.out.println("Wylosowano " + wylosowanaLiczba);
    }
}