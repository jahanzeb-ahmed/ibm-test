import java.util.Set;

public class Output {
	
	public String longest1 = "";
	public String longest2 = "";
	public int count = 0;
	
	private WordBreak wordBreak = new WordBreak();
	
	public void update(String word, Set<String> words) {
		if(wordBreak.wordBreak(word, words)) {
			if(word.length() > longest1.length()) {
				longest2 = longest1;
				longest1 = word;
			}
			else if(word.length() > longest2.length()) {
				longest2 = word;
			}
			count++;
		}
	}
	
}
