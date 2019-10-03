import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileManipulation {
  public List<String> tasks;
  Path filePath = Paths.get("../tasks.txt");

  public List<String> readFromFile(){
    try {
      tasks = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Unreadable file");
    }
    return tasks;
  }

  public void saveToFile(){
    try {
      Files.write(filePath, tasks);
    } catch (IOException e) {
      System.out.println("Unable to write to file!");
    }
  }
}
