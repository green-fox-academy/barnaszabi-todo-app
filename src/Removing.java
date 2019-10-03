import java.util.List;

public class Removing {
  public void removeTasks(List<Task> tasks, String index){
    for (int i = 0; i < tasks.size(); i++) {
      if (tasks.get(i).index.equals(index)){
        tasks.remove(i);
      }
    }
  }
}
