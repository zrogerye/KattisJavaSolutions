import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class bing {
	
	public void run()throws Exception{
		 BufferedReader file = new BufferedReader(new InputStreamReader(System.in), 1 << 16);
	        BufferedWriter outt = new BufferedWriter(new OutputStreamWriter(System.out), 1 << 16);
	        Trie trie = new Trie();
	        int asdf = Integer.parseInt(file.readLine());
	        while (asdf-- > 0)
	            outt.write(trie.insert(file.readLine()) + "\n");
	        outt.close();
	        file.close();
	}

	public static void main(String[] args) throws Exception {
        new bing().run();
    }
}

class Trie {
    private TrieNode root = new TrieNode();

    private class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int count = 0;
    }

    private int insert(TrieNode root, String s) {
        int i = s.charAt(0) - 'a';
        if (root.children[i] == null)
            root.children[i] = new TrieNode();
        root.count++;
        if (s.length() == 1)
            return root.children[i].count++;
        return insert(root.children[i], s.substring(1));
    }

    public int insert(String s) {
        return insert(root, s);
    }
}
