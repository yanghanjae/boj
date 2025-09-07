import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws NumberFormatException, Exception {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = i + 1;
    }

    for (int x = 0; x < m; x++) {
      st = new StringTokenizer(br.readLine(), " ");
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());

      int[] temp = new int[j - i + 1];

      for (int k = 0; k < (j - i + 1); k++) {
        temp[k] = arr[j - 1 - k];
      }

      for (int k = 0; k < (j - i + 1); k++) {
        arr[i - 1 + k] = temp[k];
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int i : arr) {
      sb.append(i + " ");
    }

    sb.setLength(sb.length() - 1);

    bw.write(sb.toString());

    bw.flush();

    br.close();
    bw.close();

  }
}