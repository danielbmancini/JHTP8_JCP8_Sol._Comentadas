import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/*
    exercise 17.10
 */
public class SummarizingFileTypesDirectory {
    public static void main(String[] args) throws IOException {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter directory name: ");

        Path path = Paths.get(input.nextLine());
        if(Files.exists(path) && Files.isDirectory(path))
        {
            System.out.printf("%nDirectory summarization:%n");
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

            directoryStream.forEach(aPath -> {
                try {
                    //descriptors as per 10th ed. book section 15.3
                    System.out.printf("%n%s exists%n", aPath.getFileName());
                    System.out.printf("%s a directory%n",
                            Files.isDirectory(aPath) ? "Is" : "Is not");
                    System.out.printf("%s an absolute path%n",
                            aPath.isAbsolute() ? "Is" : "Is not");
                    System.out.printf("Last modified: %s%n",
                            Files.getLastModifiedTime(aPath));
                    System.out.printf("Size: %s%n", Files.size(aPath));
                    System.out.printf("Path: %s%n", aPath);
                    System.out.printf("Absolute path: %s%n", aPath.toAbsolutePath());
                }catch (IOException e){e.printStackTrace();}
            });
            directoryStream.close();
        } else{
            System.out.println("Inadequate input.");
        }
    }

}
