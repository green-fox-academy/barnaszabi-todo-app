import java.util.List;

public class Adding {

  public void addTasks(List<String> tasks, String task){
    if (task == ""){
      System.out.println("Unable to add: no task provided");
    }else {
      tasks.add(task);
    }
  }
}
