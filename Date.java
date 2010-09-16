class Date {
  public static void main(String[] args) {
    String day, month;
    int date, year;
    day = "Thrusday";
    date = 16;
    month = "September";
    year = 2010;
    printAmerican(year, month, date, day);
    printEuropean(year, month, date, day);
  }
  public static void printAmerican(int year, String month, int date, String day){
    System.out.println(toAmericanFormat(year, month, date, day));  
  }
  public static void printEuropean(int year, String month, int date, String day){
    System.out.println(toEuropeanFormat(year, month, date, day));  
  }
  public static String toAmericanFormat(int year, String month, int date, String day){
     return day + ", " + month + " " + Integer.toString(date) + ", " + Integer.toString(year); 
  }
  public static String toEuropeanFormat(int year, String month, int date, String day){
     return day + " " + Integer.toString(date) + " "  +  month + ", " + Integer.toString(year); 
  }
}