package Products.Display;

public class DisplayFactory {
    public static Display createDisplay(String type){
        if(type == null)return null;
        if(type.equalsIgnoreCase("LCD"))
            return new LCDpanel();
        
        if(type.equalsIgnoreCase("LED"))
            return new LEDmatrix();
        
        return null;
    }
}
