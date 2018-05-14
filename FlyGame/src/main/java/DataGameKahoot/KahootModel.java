package DataGameKahoot;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class KahootModel {
	
	private static final String FILENAME = "C:\\Users\\Duy\\git\\FlyGame\\FlyGame\\src\\main\\java\\DataGameKahoot\\KahootData.txt";
	
	public List<KahootEntity> getDataKahoot(){
		List<KahootEntity> listKahoot = new ArrayList<>();
		String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(FILENAME);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                if(line.startsWith("Q")) {
                	listKahoot.add(new KahootEntity());
                	listKahoot.get(listKahoot.size() - 1).setQuestion(line);
                }else if (line.startsWith("answer")) {
                	String s = line.substring(7, 8);
                	listKahoot.get(listKahoot.size() - 1).setAnswer(s);
                }else {
                	List<String> l = listKahoot.get(listKahoot.size() - 1).getOption();
                	l.add(line);
                	listKahoot.get(listKahoot.size() - 1).setOption(l);
                }
            }   
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + FILENAME + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" + FILENAME + "'");                  
        }
		return null;
	}
}
