package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class MinimumtoremoveValid2 {
	public static void main(String[] args) {
		MinimumtoremoveValid2 m =new MinimumtoremoveValid2();
		//System.out.println(m.minRemoveToMakeValid("(a(b(c)d)))")); //(a(b(c)d))
		//System.out.println(m.minRemoveToMakeValid("())(()))()()(()(()")); //()(())()()()()
		System.out.println(m.removeMinPar("())(()))()()(()(()")); //()(())()()()()
	}
	static String removeMinPar(String a) {
        boolean[] removePar = new boolean[a.length()];
        Arrays.fill(removePar, false);
        int balanceCount = 0;
        for (int i = 0; i < a.length(); ++i) {
            if ('(' == a.charAt(i)) {
                ++balanceCount;
            } else if (')' == a.charAt(i)) {
                --balanceCount;
            }
            
            if (balanceCount < 0) {
                removePar[i] = true;
                balanceCount = 0;
            }
        }
        
        for (int i = a.length() - 1; i >= 0; --i) {
            if (')' == a.charAt(i)) {
                ++balanceCount;
            } else if ('(' == a.charAt(i)) {
                --balanceCount;
            }
            
            if (balanceCount < 0) {
                removePar[i] = true;
                balanceCount = 0;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); ++i) {
            if (!removePar[i]) {
                sb.append(a.charAt(i));
            }
        }
        
      	return sb.toString(); 
   }

}
