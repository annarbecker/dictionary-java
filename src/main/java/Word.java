import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> instances = new ArrayList<Word>();
  private String mUserWord;
  private ArrayList<Definition> mDefinition;

  public Word(String userWord) {
    mUserWord = userWord;
    mDefinition = new ArrayList<Definition>();
    instances.add(this);
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
}
