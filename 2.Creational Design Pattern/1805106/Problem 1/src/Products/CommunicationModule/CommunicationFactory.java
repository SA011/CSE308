package Products.CommunicationModule;

public class CommunicationFactory {
    public static Communication createCommunicationModule(String type){
        if(type == null)return null;
        if(type.equalsIgnoreCase("Wifi"))
            return new Wifi();
        
        if(type.equalsIgnoreCase("broadband"))
            return new Broadband();
        
        if(type.equalsIgnoreCase("mobiledata") || type.equalsIgnoreCase("sim"))
            return new MobileData();
        return null;
    }
}
