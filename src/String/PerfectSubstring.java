package String;

public class PerfectSubstring {
	public static void main(String[] args) {
		System.out.println(perfectSubstring("1102021222",2));
		String d=" ";
		System.out.println(d.length());

	}

	public static int perfectSubstring(String s, int k) {
		// Write your code here
		int res = 0;

		// Pick a starting point
		for (int i = 0; i < s.length(); i++) {

			// Initialize all frequencies as 0
			// for this starting point
			int freq[] = new int[9];

			// One by one pick ending points
			for (int j = i; j < s.length(); j++) {
				int index = Integer.parseInt(String.valueOf(s.charAt(j)));
				//System.out.println(s.charAt(j));
				freq[index]++;

				if (freq[index] > k)
					break;
				else if (freq[index] == k && check(freq, k) == true)
					res++;
			}
		}
		return res;
	}

	private static boolean check(int freq[], int k) {
		for (int i = 0; i < 9; i++)
			if (freq[i] != 0 && freq[i] != k)
				return false;
		return true;
	}

}
