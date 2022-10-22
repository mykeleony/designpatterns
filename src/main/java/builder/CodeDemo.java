package builder;

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