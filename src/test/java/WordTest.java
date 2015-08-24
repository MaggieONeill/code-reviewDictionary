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

  @Test
public void getName_returnsname(){
  Word testWord = new Word("bae");
  assertEquals("bae", testWord.getName());
}

@Test
public void getId_returnsWordId_1(){
Word testWord = new Word ("bae");
assertEquals(1, testWord.getId());
}

// @Test
// public void getDefintions_initiallyreturnsEmptyArrayList(){
//   Word testWord = new Word ("bae");
//   assertEquals(0, testWord.getDefintions().size());
// }

@Test
public void addDefinition_addsToDefinitions_true(){
Word testWord = new Word("bae");
Definition testDef = new Definition("before anyone else");
testWord.addDefinition(testDef);
assertEquals(true, testWord.getDefinitions().contains(testDef));
}

@Test
public void addDefinition_addsToDefinitions_1(){
Word testWord = new Word("bae");
Definition testDef = new Definition("before anyone else");
testWord.addDefinition(testDef);
assertEquals(1, testWord.getDefinitions().size());
}

@Test
public void all_returnsAllInstancesOfWord_true(){
  Word testWord1 = new Word("bae");
  Word testWord2 = new Word("yolo");
  assertTrue(Word.all().contains(testWord1));
  assertTrue(Word.all().contains(testWord2));

}

@Test
public void clear_clearsInstances() {
  Word testWord = new Word("house");
  Word.clear();
  assertEquals(0, Word.all().size());
  }

@Test
public void find_returnsNullIfNothingMatches(){
  assertEquals(null, Word.find(1));
}

}
