import java.util.List;

public class Listing {

  public void ListAll(List<Task> tasks){
    String textpart = "";
    for (int i = 0; i < tasks.size(); i++) {
      if (tasks.get(i).done){
        textpart = "[x] ";
      }else {
        textpart = "[ ] ";
      }
      System.out.println(tasks.get(i).index + " - " + textpart + tasks.get(i).description);
    }
  }

  public void ListEmpty(List<Task> tasks){
    System.out.println("No todos for today! :)");
  }
}
