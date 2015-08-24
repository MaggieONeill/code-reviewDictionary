import java.util.ArrayList;

public class Word {

  private static ArrayList<Word> instances = new ArrayList<Word>();
  private ArrayList<Definition> mDefinition;
  private String mName;
  private int mId;

  public Word(String name){
    mName = name;
    instances.add(this); //Add the word you just created into the arraylist 'instances'
    mId = instances.size(); //mId = the number of things in the array list 'instances'
    mDefinition = new ArrayList<Definition>();
  }

  public String getName(){
     return mName;
   }

   public int getId(){
     return mId;
   }

  public ArrayList<Definition>getDefinition(){
    return mDefinition;
  }


  public void addDefinition(Definition definition){
    mDefinition.add(definition);
  }

  public static ArrayList<Word> all(){
  return instances;
}

public static void clear() {
  instances.clear();
}

public static Word find(int id){
  try{
    return instances.get(id-1);
  } catch (IndexOutOfBoundsException exception){
    return null;
  }
}
}
