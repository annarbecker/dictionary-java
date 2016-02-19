import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition testDefinition = new Definition("word definition");
    assertEquals(true, testDefinition instanceof Definition);
  }

  @Test
  public void definition_returnsWordDefinition_wordDefinition() {
    Definition testDefinition = new Definition("word definition");
    assertEquals("word definition", testDefinition.getWordDefinition());
  }
}
