import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest{

  @Test
  public void Word_instantiatesCorrectly_true(){
    Word myWord = new Word("bae");
    assertEquals(true, myWord instanceof Word);
  }
}
