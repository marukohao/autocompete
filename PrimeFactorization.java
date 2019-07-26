import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeFactorization {
  static List<Integer> ans = new ArrayList<>();

  public static void primeFactors(int n) {
    while (n % 2 == 0) {
      ans.add(2);
      n /= 2;
    }
    for (int i = 3; i * i <= n; i += 2) {
      while (n % i == 0) {
        ans.add(i);
        n /= i;
      }
    }
    if (n > 2) {
      ans.add(n);
    }
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    primeFactors(n);
    for (int i = ans.size() - 1; i >= 0; --i) {
      System.out.print(ans.get(i));
      if (i != 0) {
        System.out.print("*");
      }
    }
    System.out.println();
  }
}
