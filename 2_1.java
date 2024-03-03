class test {
  public static void main(String[] args) {
  java.util.Scanner input = new java.util.Scanner(System.in);

  System.out.print("Enter a miles: ");
  double miles = input.nextInt();
  double kilometers = miles * 1.6;
  System.out.println(miles + " miles is " + kilometers + " kilometers");
}
}