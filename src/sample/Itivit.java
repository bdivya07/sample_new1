package sample;

import java.util.ArrayList;

public class Itivit {
	public static StringBuilder draw(int a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a; i++) {
			if (i == 0 || i == (a - 1)) {
				for (int j = 0; j < a; j++) {
					sb.append("#");
				}
			} else {
				for (int j = 0; j < a; j++) {
					if (j == 0 || j == a - 1) {
						sb.append("#");
					}
					if (j != a - 2)
						sb.append(" ");
				}
			}
			sb.append("\n");
		}

		return sb;

	}

	public static void main(String[] args) {

		ArrayList<Integer> squares = new ArrayList<>();
		squares.add(3);
		squares.add(5);

		ArrayList<String> pattern = new ArrayList<String>();

		for (int j = 0; j < squares.size(); j++) {
			StringBuilder sb1 = draw(squares.get(j));
			System.out.println(sb1);
			char[] charsStream = sb1.toString().toCharArray();
			for (int i = 0; i < charsStream.length; i++) {
				if (pattern.size() <= i) {
					pattern.add(String.valueOf(charsStream[i]));
				} else {
					pattern.set(i, String.valueOf(charsStream[i]));
					//pattern.add(String.valueOf(charsStream[i]));
				}
			}
		}

		StringBuilder buider = new StringBuilder();
		for (String s : pattern) {
			buider.append(s);
		}
		System.out.println(buider);

	}
}
