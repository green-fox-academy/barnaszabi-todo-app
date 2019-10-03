import java.util.List;

public class Listing {

  public void ListAll(List<String> tasks){
    for (int i = 0; i < tasks.size(); i++) {
      System.out.println((i+1) + " - " + tasks.get(i));
    }
  }

  public void ListEmpty(List<String> tasks){
    System.out.println("No todos for today! :)");
  }
}
