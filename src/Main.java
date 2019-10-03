import java.util.List;

public class Main {
  public static void main(String[] args) {
    FileManipulation fileManipulation = new FileManipulation();
    List<String> tasks = fileManipulation.readFromFile();
    if (args.length == 0){
      StartApp startApp = new StartApp();
      startApp.opening();
    }else if (args[0].equals("-l")){
      Listing listing = new Listing();
      fileManipulation.readFromFile();
      if (tasks.size() != 0){
        listing.ListAll(tasks);
      }else {
        listing.ListEmpty(tasks);
      }
    }else if(args[0].equals("-a")){
      Adding adding = new Adding();
      if (args.length == 2){
        adding.addTasks(tasks, args[1]);
        fileManipulation.saveToFile();
      }else {
        adding.addTasks(tasks, "");
      }
    }
  }
}
