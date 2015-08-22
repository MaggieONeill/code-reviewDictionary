import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instiatesCorrectly_True(){
    Definition myDefinition = new Definition("before anyone else");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void definition_instantiatesWithDescription_true(){
    Definition myDefinition = new Definition("before anyone else");
    assertEquals("before anyone else", myDefinition.getDescription());
  }

  @Test
  public void clear_emptiesAllTasksFromArrayList(){
    Definition myDefinition = new Definition("before anyone else");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
}
