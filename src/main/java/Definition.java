import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private String mWordDefinition;

  public Definition(String wordDefinition) {
    mWordDefinition = wordDefinition;
    instances.add(this);
  }

  public String getWordDefinition() {
    return mWordDefinition;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }
}
