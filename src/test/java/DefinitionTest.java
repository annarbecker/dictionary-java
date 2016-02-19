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

  @Test
  public void all_returnsAllInstancesofDefinition_true() {
    Definition firstDefinition = new Definition("word definition");
    Definition secondDefinition = new Definition("another word definition");
    assertTrue(Definition.all().contains(firstDefinition));
  }
}
