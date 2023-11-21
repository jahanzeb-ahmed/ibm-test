
public class Main {

	public static void main(String[] args) {
		
		Output output = new WordsFinder().findConcatenatedWords("wordsforproblem.txt");
		
		System.out.println("1. Longest concatenated word: " + output.longest1);
		System.out.println("2. Second longest concatenated word: " + output.longest2);
		System.out.println("3. Count of all the concatenated words: " + output.count);
	}
}