package builder;

/*
 * Myke Leony dos Santos Amorim.
 * October 21, 2022.
 *
 * Exercise of Design Patterns in Java course (https://www.udemy.com/course/design-patterns-java/)
 *
 * https://www.linkedin.com/in/myke-amorim/
 * https://github.com/mykeleony
 */

/*
    * Problem description:
    *
    * You are asked to implement the Builder design pattern for rendering simple chunks of code.

    Sample use of the builder you are asked to create:

    CodeBuilder cb = new CodeBuilder("Person").addField("name", "String").addField("age", "int");
    System.out.println(cb);

    The expected output of the above code is:

    public class Person
    {
      public String name;
      public int age;
    }
* */

class CodeBuilder {
    public StringBuilder code = new StringBuilder();

    public CodeBuilder(String className) {
        code.append(String.format("public class %s\n{\n", className));
    }

    public CodeBuilder addField(String name, String type) {
        code.append(String.format("  public %s %s;\n", type, name));

        return this;
    }

    @Override
    public String toString() {
        return code.append("}").toString();
    }
}

public class CodeDemo {
    public static void main(String[] args) {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        System.out.println(cb);
    }
}