import java.util.ArrayList;
public class GenericExample{
  public static void main(String[] args){
    ArrayList<String> list = new ArrayList<>();
    System.out.println(list.size());
    list.add("Randy");
    System.out.println(list.size());
    list.add(0,"Hodgekins");
    System.out.println(list);
    System.out.println(list.contains("Kulis"));
    System.out.println(list.contains("Hodgekins"));
  }
}
