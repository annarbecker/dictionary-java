import java.util.ArrayList;


public class Word {

  private String mUserWord;
  private ArrayList<Definition> mDefinition;

  public Word(String userWord) {
    mUserWord = userWord;
    mDefinition = new ArrayList<Definition>();
  }

  public String getWord() {
    return mUserWord;
  }

  public ArrayList<Definition> getDefinition() {
    return mDefinition;
  }
}
