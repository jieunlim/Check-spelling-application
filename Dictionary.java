import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

	/**
	 * @param args
	 */
	private ArrayList<String> dictionary = new ArrayList<>();


	public int getVocabularySize() {
		return dictionary.size();
	}

	public boolean loadDictionaryFromFile(String filePath) {

		
		
		
		File file = new File(filePath);
		
		try {
			Scanner fileIn = new Scanner(file);
			while (fileIn.hasNext()) {
				dictionary.add(fileIn.next());
			}
			
		} catch (Exception e) {

			return false;
		}
		
		return true;
	
		
	}
	
	public boolean isWord(String word){
		
		for(int i = 0; i< dictionary.size(); i++){
			
			if(word.toLowerCase().equals(dictionary.get(i).toLowerCase()))
				return true;
		}
		
		return false;
	}
	
}
