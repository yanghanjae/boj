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

		int max = 0;
		int index = 0;

		for (int i = 0; i < 9; i++) {

			int a = Integer.parseInt(br.readLine());

			if (a > max) {
				max = a;
				index = i + 1;
			}
		}

		bw.write(max + "\n" + index);

		br.close();

		bw.flush();
		bw.close();

	}
}
