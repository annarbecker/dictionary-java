import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private String mWordDefinition;
  private int mId;

  public Definition(String wordDefinition) {
    mWordDefinition = wordDefinition;
    instances.add(this);
    mId = instances.size();
  }

  public String getWordDefinition() {
    return mWordDefinition;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }
}
