import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileHandler {
	
	private Set<String> words = new HashSet<>();
	private Output output = new Output();
	
	public Output findConcatenatedWords(String path) {
		File file = new File(path); 
		FileReader fr = null;  
		BufferedReader br = null;
		try {
			fr=new FileReader(file);
			br=new BufferedReader(fr);
			String line;
			while((line = br.readLine()) != null) {
				output.update(line, words);
				words.add(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fr != null) {
					fr.close();
				}
				if(br != null) {
					br.close();
				}
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		return output;
	}
}
