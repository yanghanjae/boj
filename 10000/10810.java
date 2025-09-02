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

		int[] arr = new int[n];

		for (int x = 0; x < m; x++) {

			st = new StringTokenizer(br.readLine(), " ");
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			for (; i <= j; i++) {
				arr[i - 1] = k;
			}

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
