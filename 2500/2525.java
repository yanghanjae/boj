import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();

    m += c;

    while ((m / 60) > 0) {
      m -= 60;
      h++;
    }

    if (h > 23) {
      h -= 24;
    }

    System.out.println(h + " " + m);

    sc.close();

  }
}