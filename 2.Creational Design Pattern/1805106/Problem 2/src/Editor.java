import java.util.StringTokenizer;

import Fonts.Font;
import Fonts.FontFactory;
import Parsers.Parser;
import Parsers.ParserFactory;

public class Editor {
    static private Editor singletoneObj = null;

    private Editor(){

    }

    public static Editor getObject(){
        if(singletoneObj == null)
            singletoneObj = new Editor();
        return singletoneObj;
    }

    public void processFile(String filename){
        StringTokenizer strtok = new StringTokenizer(filename, ".");
        String extension = null;
        while(strtok.hasMoreTokens())
            extension = strtok.nextToken();
        Parser p = ParserFactory.getParser(extension);
        Font f = FontFactory.getFont(extension);
        
        if(p == null)System.out.println("Cannot Parse the file");
        else System.out.println("Parsing the file with " + p.getName());
        
        if(f == null)System.out.println("Cannot Identify the font of the file");
        else System.out.println("The file has " + f.getName() + " font");
        
    }

}
