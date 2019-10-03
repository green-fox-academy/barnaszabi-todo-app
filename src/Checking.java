import java.util.List;

public class Checking {

  public void checkTask(String index, List<Task> tasks){
    if (tasks.size() > 1){
      for (int i = 0; i < tasks.size(); i++) {
        if (tasks.get(i).index.equals(index)){
          tasks.get(i).done = true;
        }
      }
    }
  }
}
