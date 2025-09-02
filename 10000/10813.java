import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws NumberFormatException, IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int temp;

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {

      arr[i] = i + 1;

    }

    for (int x = 0; x < m; x++) {
      st = new StringTokenizer(br.readLine());
      int i = Integer.parseInt(st.nextToken());
      int j = Integer.parseInt(st.nextToken());

      temp = arr[i - 1];
      arr[i - 1] = arr[j - 1];
      arr[j - 1] = temp;
    }

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      sb.append(arr[i] + " ");
    }

    sb.setLength(sb.length() - 1);
    bw.write(sb.toString());

    br.close();

    bw.flush();
    bw.close();

  }
}
