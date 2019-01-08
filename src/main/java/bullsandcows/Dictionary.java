package bullsandcows;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import static java.lang.Math.abs;

public class Dictionary {
    
    private HashSet set;

    public Dictionary(String filePath) throws IOException {
        ClassPathResource resource = new ClassPathResource(filePath);
        set = new HashSet();
        try (InputStream stream = resource.getInputStream()) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            while (reader.ready()) {
                String line = reader.readLine();
                set.add(line);
            }
        } catch (IOException e) {
            throw e;
        }
    }    

    public String randomWord() {
        Iterator<String> iterator = set.iterator();
        Random random = new Random();
        int randomInt = abs(random.nextInt() % set.size());
        for (int i = 0; i < randomInt; i++) {
            iterator.next();
        }
        return iterator.next();
    }
}
