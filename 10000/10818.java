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

		int n = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int min = Integer.parseInt(st.nextToken());
		int max = min;

		for (int i = 0; i < n - 1; i++) {

			int a = Integer.parseInt(st.nextToken());

			if (a < min) {
				min = a;
			} else if (a > max) {
				max = a;
			}
		}

		sb.append(min + " " + max);
		bw.write(sb.toString());

		br.close();

		bw.flush();
		bw.close();

	}
}
