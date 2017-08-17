package textProcessing;

import java.util.HashMap;

public class TrieNode {
	char value;
	boolean isTerminating;
	HashMap<Character, TrieNode> children;
	
	public TrieNode(char value) {
		this.value=value;
		children=new HashMap<>();
	}
	

}
