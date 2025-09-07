import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

  public static void main(String[] args) throws NumberFormatException, Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int[] arr = new int[42];

    for (int i = 0; i < 10; i++) {
      int a = Integer.parseInt(br.readLine());
      int remainder = a % 42;

      arr[remainder]++;

    }

    int count = 0;

    for (int i = 0; i < 42; i++) {
      if (arr[i] > 0) {
        count++;
      }
    }

    bw.write(count + "");

    bw.flush();

    br.close();
    bw.close();

  }
}