import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private String mUserWord;
  private ArrayList<Definition> mDefinition;
  private int mId;

  public Word(String userWord) {
    mUserWord = userWord;
    mDefinition = new ArrayList<Definition>();
    instances.add(this);
    mId = instances.size();
  }

  public String getWord() {
    return mUserWord;
  }

  public ArrayList<Definition> getDefinition() {
    return mDefinition;
  }

  public static ArrayList<Word> all() {
    return instances;
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    try {
      return instances.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public void addDefinition(Definition userDefinition) {
    mDefinition.add(userDefinition);
  }

  public static void clear() {
    instances.clear();
  }

}
