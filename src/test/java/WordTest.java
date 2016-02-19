import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest{

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("dog");
    assertEquals(true, testWord instanceof Word);
  }

  @Test
  public void word_returnsWord_ture() {
    Word testWord = new Word("dog");
    assertEquals("dog", testWord.getWord());
  }

  @Test
  public void word_initiallyReturnsEmptyArrayList() {
    Word testWord = new Word("dog");
    assertTrue(testWord.getDefinition() instanceof ArrayList);
  }


  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("dog");
    Word secondWord = new Word("pig");
    assertTrue(Word.all().contains(firstWord));
    assertTrue(Word.all().contains(secondWord));
  }

  @Test
  public void newId_wordInstantiatesWithAnId_true() {
    Word testWord = new Word("dog");
    assertEquals(Word.all().size(), testWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId() {
    Word testWord = new Word("dog");
    assertEquals(Word.find(testWord.getId()), testWord);
  }

  @Test
  public void addDefinition_addDefinitiontoWord() {
    Word testWord = new Word("dog");
    Definition firstDefinition = new Definition("man's best friend");
    Definition secondDefinition = new Definition("k-9");
    testWord.addDefinition(firstDefinition);
    testWord.addDefinition(secondDefinition);
    assertTrue(testWord.getDefinition().contains(firstDefinition));
    assertTrue(testWord.getDefinition().contains(secondDefinition));
  }
}
