import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    FileManipulation fileManipulation = new FileManipulation();
    List<Task> tasks = fileManipulation.readFromFile();
    StartApp startApp = new StartApp();
    if (args.length == 0){
      startApp.opening();
    }else {
      if (Arrays.asList("-l", "-r", "-c", "-a").contains(args[0])){
        if (args[0].equals("-l")){
          Listing listing = new Listing();
          if (tasks.size() != 0){
            listing.ListAll(tasks);
          }else {
            listing.ListEmpty(tasks);
          }
        }else if(args[0].equals("-a")){
          Adding adding = new Adding();
          if (args.length == 2){
            adding.addTasks(tasks, args[1]);
            fileManipulation.saveToFile(tasks);
          }else {
            System.out.println("Unable to add: no task provided");
          }
        }else if (args[0].equals("-r")){
          Removing removing = new Removing();
          removing.removeTasks(tasks, args[1]);
          fileManipulation.saveToFile(tasks);
        }else if (args[0].equals("-c")){
          Checking checking = new Checking();
          checking.checkTask(args[1],tasks);
          fileManipulation.saveToFile(tasks);
        }
      }else {
        System.out.println("Unsupported argument");
        startApp.opening();
      }
    }
  }
}
