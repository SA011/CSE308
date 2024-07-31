package Parsers;

public class ParserFactory {
    public static Parser getParser(String str){
        if(str == null)return null;
        if(str.equalsIgnoreCase("C"))
            return new CParser();
        if(str.equalsIgnoreCase("Cpp"))
            return new CppParser();
        if(str.equalsIgnoreCase("PY"))
            return new PythonParser();
        return null;
    }
}
