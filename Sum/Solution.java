import java.util.Scanner;

public class Solution {
  static int sum = 0;

  public static void solve() {
    Scanner s = new Scanner(System.in);

    while (s.hasNextInt()) {
      int i = s.nextInt();
      sum += i;
    }
  }

  public static void main(String[] args) {
    solve();
    System.out.println(sum);
  }
}
