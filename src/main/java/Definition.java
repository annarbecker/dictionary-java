import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> instances = new ArrayList<Definition>();
  private String mUserDefinition;
  private int mId;

  public Definition(String userDefinition) {
    mUserDefinition = userDefinition;
    instances.add(this);
    mId = instances.size();
  }

  public String getDefinition() {
    return mUserDefinition;
  }

  public static ArrayList<Definition> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    instances.clear();
  }
}
