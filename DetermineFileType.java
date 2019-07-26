import java.util.Scanner;

public class DetermineFileType {
  static int python = 0;
  static int js = 0;
  static int ruby = 0;

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    while (s.hasNext()) {
      String token = s.next();
      if (token.contains("print")) {
        python++;
      }
      if (token.equals("def")) {
        python++;
      }
      if (token.contains("import")) {
        python++;
      }

      if (token.contains("def")) {
        ruby++;
      }
      if (token.contains("end")) {
        ruby++;
      }
      if (token.contains(".new")) {
        ruby++;
      }

      if (token.equals("{")) {
        js++;
      }
      if (token.equals("function")) {
        js++;
      }
      if (token.equals("=>")) {
        js++;
      }
    }

    if (python >= js && python >= ruby) {
      System.out.println("python");
    }
    if (js >= python && js >= ruby) {
      System.out.println("js");
    }
    if (ruby >= python && ruby >= js) {
      System.out.println("ruby");
    }
  }
}
