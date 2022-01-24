public class Zmienne{

  public void zmienne(){
     String tekst = "Tekst";
    System.out.println(tekst);

    int i = 10;

    String a = "a";
    String b = "b";

    String rezultat = a + " " + b;
    System.out.println(rezultat);


    System.out.println("tekst " + " 10");
    System.out.println("tekst " + 10);
    System.out.println(10 + "tekst");

    int x;
    int y;
    x = 6;
    y = 2;
    // dodawanie
    int wynik;
    wynik = x + y;
    // odejmowanie
    int wynik2;
    wynik2 = x - y;
    System.out.println(wynik);
    System.out.println("wynik: " + x + y);
    System.out.println("wynik: " + wynik);
    System.out.println(x + y);
    System.out.println("" + x + y);
    System.out.println("wynik2: " + wynik2);  
    // mnożenie
    int wynik3;
    wynik3 = x * y;
    System.out.println("wynik3: " + wynik3);
    // dzielenie
    int wynik4;
    wynik4 = x / y;
    System.out.println("wynik4: " + wynik4);
    // modulo (reszta z dzielenia)
    int wynik5;
    wynik5 = x % y; // 6 % 2
    System.out.println("wynik5: " + wynik5);
    System.out.println(10 % 3);
    System.out.println(15 % 4);

       // warunek 1
       if(wynik3 % 2 == 0) {
       System.out.println(wynik3 + " jest podzielny przez 2");
       // Wykonuje się jezeli warunek jest prawdziwy (true)
       }
       // warunek 2
       if(wynik4 % 2 == 0) {
       System.out.println(wynik4 + " jest podzielny przez 2");
       // Wykonuje się jezeli warunek jest prawdziwy (true)
       }



    // komentarz
    

    /*
      komentarz
    */

  }
}