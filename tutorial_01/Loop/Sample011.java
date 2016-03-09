class Sample011 {
  public static void main(String[] args) {
    int sum = 0;

    for (int i = 0; i < 32; i++) {
      sum += i;
      System.out.print(sum + " >>> ");
    }

    System.out.println("Total: " + sum);
  }
}