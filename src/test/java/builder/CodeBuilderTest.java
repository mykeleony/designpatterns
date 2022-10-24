package builder;

import junit.framework.TestCase;
import org.junit.Test;

public class CodeBuilderTest extends TestCase {

    @Test
    public void testClass1() {
        String expected = "public class Person\n" +
                "{\n" +
                "  public String name;\n" +
                "  public int age;\n" +
                "}";

        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");

        assertEquals(expected, cb.toString());
    }

    @Test
    public void testClass2() {
        String expected = "public class Debora\n" +
                "{\n" +
                "  public love loveAmount;\n" +
                "  public String name;\n" +
                "}";

        String cb = new CodeBuilder("Debora")
                .addField("loveAmount", "love")
                .addField("name", "String").toString();

        assertEquals(expected, cb.toString());
    }
}