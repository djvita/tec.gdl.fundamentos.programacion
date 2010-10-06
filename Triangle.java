class Triangle {
  public static boolean isTriangle(int a, int b, int c){
    if (a >= (b+c)) {
      return false;
    }
    else if (b >= (a+c)) {
      return false;
    }
    else if (c >= (a+b)) {
      return false;
    }
    else {
      return true;
    }
  }
  public static void main(String[] args) {
      System.out.println(isTriangle(5,3,4));
      System.out.println(isTriangle(8,9,10));
      System.out.println(isTriangle(5,12,13));
      System.out.println(isTriangle(1,3,40));
      System.out.println(isTriangle(15,13,34));
      System.out.println(isTriangle(17,30,9));
          
  }
  
}
