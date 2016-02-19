import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WordTest{

  @Test
  public void word_instantiatesCorrectly_true() {
    Word testWord = new Word("dog");
    assertEquals(true, testWord instanceof Word);
  }
}
