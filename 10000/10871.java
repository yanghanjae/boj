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
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < n; i++) {

			int a = Integer.parseInt(st.nextToken());

			if (a < x) {
				sb.append(a + " ");
			}
		}
		sb.setLength(sb.length() - 1);
		bw.write(sb.toString());

		br.close();

		bw.flush();
		bw.close();

	}
}
