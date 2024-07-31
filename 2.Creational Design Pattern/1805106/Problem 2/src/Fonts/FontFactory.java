package Fonts;

public class FontFactory {
    public static Font getFont(String str){
        if(str == null)return null;
        if(str.equalsIgnoreCase("C"))
            return new CourierFont();
        if(str.equalsIgnoreCase("Cpp"))
            return new MonacoFont();
        if(str.equalsIgnoreCase("PY"))
            return new ConsolasFont();
        return null;
    }
}
