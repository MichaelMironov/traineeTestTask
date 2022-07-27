import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;

public class ReadFileTests {

    @Test
    public void secondLineShouldHabAlloha(){
      //write here second task
        ArrayList<String> words = readFile("src/test/resources/ReadFileTests.txt");

        String secondLine = words.get(1);

        Assertions.assertEquals("аллоха", secondLine);

    }

    public ArrayList<String> readFile(String src){
        ArrayList<String> words = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(src))){
            while(reader.ready()){
                words.add(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
}
