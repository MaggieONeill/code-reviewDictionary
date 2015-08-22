import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.*;

public class WordTest{

  @Test
  public void Word_instantiatesCorrectly_true(){
    Word myWord = new Word("bae");
    assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void word_instantiationAddsToInstances() {
    Word testWord = new Word("bae");
    assertEquals(1, Word.all().size());

  }
}
