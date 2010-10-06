public class BeerSongRecursive {

  void bottles(int n) {
    if (n == 0) {
      System.out.println("No more bottles of beer on the wall!");
    } else {
      if (n == 1) {
        String word = "bottle";
      } else {
        String word = "bottles";        
      }
      System.out.println(n + " " + word + " of beer on the wall,");
      System.out.println(n + " " + word + " of beer!");
      System.out.println("Take one down, pass it around.");      
    }
  }
  
    public static void main(String[] args) {
      bottles(99);
    } // ends main method
} // ends class
