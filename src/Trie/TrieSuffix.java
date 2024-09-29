package Trie;

import java.util.HashMap;
import java.util.Map;

public class TrieSuffix {
	public static void main(String[] args) {
		String s = "abc";
		TrieSuffix t=new TrieSuffix();
		TrieSuffix.SuffixTrie obj=new TrieSuffix.SuffixTrie(s);  
		System.out.println(obj.contains("bc"));
	}

	static class TrieNode {
		Map<Character, TrieNode> children = new HashMap<>();
		boolean isLeaf;
	}

	static class SuffixTrie {
		TrieNode root = new TrieNode();

		public SuffixTrie(String str) {
			populateSuffixTrieFrom(str);
		}

		public void populateSuffixTrieFrom(String str) {
			for (int i = 0; i < str.length(); i++) {
				insert(i, str);

			}
		}

		public void insert(int i, String str) {
			TrieNode node = root;
			for (int j = i; j < str.length(); j++) {
				char c = str.charAt(j);
				if (node.children.get(c) == null) {
					TrieNode newNode = new TrieNode();
					node.children.put(c, newNode);
				}
				node = node.children.get(c);
			}
			node.isLeaf = true;
		}

		public boolean contains(String str) {
			TrieNode node = root;
			int k=0;
			for (int i = 0; i < str.length(); i++) {
				k++;
				char c = str.charAt(i);
				if (!node.children.containsKey(c)) {
					return false;
				}
				node = node.children.get(c);
			}
			//return k==str.length();
			return node.isLeaf;
		}
	}

}
