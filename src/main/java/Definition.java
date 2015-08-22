import java.util.ArrayList;

public class Definition{
  private static ArrayList<Definition> instances = new ArrayList<Definition>();

  String mDescription;


  public  Definition(String description){
    mDescription = description;

  }

  public String getDescription(){
    return mDescription;
  }

  public static ArrayList<Definition> all(){
    return instances;
  }

  public static void clear(){
    instances.clear();
  }
}
