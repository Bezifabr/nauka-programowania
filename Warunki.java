public class Warunki {

  public void warunki() {
   
   boolean t = false;

    if(t == true) {
    System.out.println("true");
    }
    if(t == false) {
    System.out.println("false");
    } 
    
    int x;
    int y;
    x = 10;
    y = 5;

    if(x + y == 12) { // true
      System.out.println("x + y równa się 12");
    } else if(x + y == 15) { // false
      System.out.println("x + y równa się 15");
    } else {
      System.out.println("x + y nie równa się 12 ani 15");
    }

    if(x + y != 12) {

    }

    if("tekst" != "tekst2") {
      
    }
    
    boolean jestZimno = true;
    if(jestZimno) {
      System.out.println("Brrr");
    } else {
      System.out.println("Ciepło");
    }

   int temperatura;
   temperatura = 30;
    if(temperatura < 20) {
      System.out.println("Brrr");
    } else {
      System.out.println("Ciepło");
    }
   boolean jestCieplo;
   jestCieplo = temperatura >= 20;
    if(!jestCieplo) {
      System.out.println("Brrr");
    } else {
      System.out.println("Ciepło");
    }

    boolean prawda;
    prawda = true;
    boolean gownoPrawda;
    gownoPrawda = !prawda;
    System.out.println(gownoPrawda);
    System.out.println(!gownoPrawda);

    System.out.println(!!!!!!!true);

  }
}