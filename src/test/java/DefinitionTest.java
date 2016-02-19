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
  public void definition_returnsUserDefinition_wordDefinition() {
    Definition testDefinition = new Definition("word definition");
    assertEquals("word definition", testDefinition.getDefinition());
  }

  @Test
  public void all_returnsAllInstancesofDefinition_true() {
    Definition firstDefinition = new Definition("word definition");
    Definition secondDefinition = new Definition("another word definition");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void newId_definitionInstantiatesWithAnId_true() {
    Definition testDefinition = new Definition("word definition");
    assertEquals(Definition.all().size(), testDefinition.getId());
  }

  @Test
  public void find_returnsDefinitionWithSameId_wordDefinition() {
    Definition firstDefinition = new Definition("word definition");
    Definition secondDefinition = new Definition(" another word definition");
    assertEquals(Definition.find(firstDefinition.getId()), firstDefinition);
  }

  @Test
  public void clear_emptiesAllDefinitionsFromArrayList() {
    Definition testDefinition = new Definition("word definition");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
}
