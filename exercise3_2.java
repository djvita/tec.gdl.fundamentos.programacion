class exercise3_2 {
  public static void zoop () {
    baffle ();
    System.out.print ("You wugga ");
    baffle ();
  }
  public static void main (String[] args) {
    System.out.print ("No, I ");
    zoop ();
    System.out.print ("I ");
    baffle ();
    zool(12, "Fido", "Livingstone LN");
    zool(10, "Chiquito", "Gomez Farias");
  }
  public static void baffle () {
    System.out.print ("wug");
    ping ();
  }
  public static void ping () {
    System.out.println (".");
  }
  public static void zool(int age, String pet, String street) {
    System.out.println ("My age was: " + Integer.toString(age));    
    System.out.println ("My pet was: " + pet);    
    System.out.println ("The street where I grew up on is: " + street);    
  }
    
}