import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
/*
    exercise 17.9, 10th edition
 */
public class SummarizingCharactersFile {
    public static void main(String[] args) throws IOException {
        /*Only edited as per exercise
          Empty pattern */
        Pattern pattern = Pattern.compile("");

        Map<String,Long> wordCounts = Files.lines(Paths.get("Chapter2Paragraph.txt"))
                .map(line -> line.replaceAll("\\W","")) //remove non-word characters
                .flatMap(pattern::splitAsStream)
                .collect(Collectors.groupingBy(String::toLowerCase,TreeMap::new,Collectors.counting()));

        wordCounts
                .forEach((letter,letterCount) ->
                        System.out.printf("%n%s%n%d%n",letter.toUpperCase(),letterCount));
    }
}
