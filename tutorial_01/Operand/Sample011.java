class Sample011 {
  public static void main(String[] args) {
    int n, m, o;

    n = 16 * 32;
    m = 48 / 0; // Infinity
    o = 128 % 0; // NaN
    System.out.println(n + ":" + m + ":" + o);
  }
}