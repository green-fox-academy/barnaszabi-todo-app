import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManipulation {
  public List<String> tempIn;
  public List<String> tempOut = new ArrayList<>();
  public List<Task> tasks = new ArrayList<>();
  Path filePath = Paths.get("../tasks.txt");

  public List<Task> readFromFile(){
    try {
      tempIn = Files.readAllLines(filePath);
    } catch (IOException e) {
      System.out.println("Unreadable file");
    }
    for (int i = 0; i < tempIn.size(); i++) {
      tasks.add(new Task(tempIn.get(i).substring(0,tempIn.get(i).indexOf('-')),String.valueOf(i+1),Boolean.parseBoolean(tempIn.get(i).substring(tempIn.get(i).indexOf('-')+1))));
    }
    return tasks;
  }

  public void saveToFile(List<Task> tasks){
    for (int i = 0; i < tasks.size(); i++) {
      tempOut.add(tasks.get(i).description+"-"+tasks.get(i).done);
    }
    try {
      Files.write(filePath,tempOut);
    } catch (IOException e) {
      System.out.println("Unable to write to file!");
    }
  }
}
