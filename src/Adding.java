import java.util.List;

public class Adding {

  public void addTasks(List<Task> tasks, String taskDescription){
      tasks.add(new Task(taskDescription,String.valueOf(tasks.size()+1),false));
  }
}
