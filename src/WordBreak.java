import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordBreak {

	private Map<String, Boolean> cache = new HashMap<>();

    public boolean wordBreak(String s, Set<String> wordDict) {

        if(wordDict.contains(s)) {
            return true;
        }

        if(cache.containsKey(s)) {
            return cache.get(s);
        }

        for(int i=1; i<=s.length(); i++) {

            String left = s.substring(0,i);
            String right = s.substring(i);
            
            if(wordDict.contains(left) && wordBreak(right, wordDict)) {
                cache.put(s, true);
                return true;
            }
        }

        cache.put(s, false);
        return false;
    }
}
