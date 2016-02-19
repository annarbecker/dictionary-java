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
}
