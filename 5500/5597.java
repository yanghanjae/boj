import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[28];

		for (int i = 0; i < 28; i++) {

			arr[i] = Integer.parseInt(br.readLine());

		}

		int[] nosub = new int[2];
		int idx = 0;

		search: for (int i = 1; i <= 30; i++) {

			for (int j = 0; j < 28; j++) {
				if (arr[j] == i) {
					continue search;
				}
			}

			nosub[idx++] = i;
		}

		if (nosub[0] > nosub[1]) {
			bw.write(nosub[1] + "\n" + nosub[0]);
		} else {
			bw.write(nosub[0] + "\n" + nosub[1]);
		}

		br.close();

		bw.flush();
		bw.close();

	}
}
