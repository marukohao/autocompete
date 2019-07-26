import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
  int x;
  int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point(String s) {
    String[] sp = s.split(",");
    this.x = Integer.parseInt(sp[0]);
    this.y = Integer.parseInt(sp[1]);
  }
}

public class AKnightsTail {
  static Point ep;
  static int ans = Integer.MAX_VALUE;
  static boolean[][] grid = new boolean[8][8];

  public static boolean isValidPoint(Point p) {
    return p.x >= 0 && p.x < 8 && p.y >= 0 && p.y < 8;
  }

  public static void dfs(Point sp, int depth) {
    if (!isValidPoint(sp)) {
      return;
    }
    if (grid[sp.y][sp.x]) {
      return;
    }

    grid[sp.y][sp.x] = true;

    if (sp.x == ep.x && sp.y == ep.y) {
      ans = Math.min(ans, depth);
    }

    dfs(new Point(sp.x + 1, sp.y + 2), depth + 1);
    dfs(new Point(sp.x - 1, sp.y + 2), depth + 1);
    dfs(new Point(sp.x + 1, sp.y - 2), depth + 1);
    dfs(new Point(sp.x - 1, sp.y - 2), depth + 1);

    grid[sp.y][sp.x] = false;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String start = s.next();
    String end = s.next();

    Point sp = new Point(start);
    ep = new Point(end);
    dfs(sp, 0);
    System.out.println(ans);
  }
}
