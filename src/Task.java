import java.util.List;

public class Task {
  String description;
  boolean done = false;
  String index;

  public Task(String description, String index, boolean done){
    this.description = description;
    this.done = done;
    this.index = index;
  }
}
