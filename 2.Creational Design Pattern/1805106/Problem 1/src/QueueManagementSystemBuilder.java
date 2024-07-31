import Products.Application.Application;
import Products.CommunicationModule.CommunicationFactory;
import Products.Display.DisplayFactory;
import Products.Processor.ProcessorFactory;

public class QueueManagementSystemBuilder {
    private QueueManagementSystem result = null;

    public QueueManagementSystemBuilder(){
        result = new QueueManagementSystem();
        result.addProduct(new Application());
    }

    public void addPackage(String packagename, int number_of_display){
        if(packagename == null){
            System.out.println("Invalid Package Name");
            return;
        }
        if(number_of_display < 0){
            System.out.println("Number of Display should be non-negative");
        }

        if(packagename.equalsIgnoreCase("Deluxe")){
            result.addProduct(ProcessorFactory.createProcessor("RaspberryPi"));
            while(number_of_display > 0){
                result.addProduct(DisplayFactory.createDisplay("LCD"));
                number_of_display--;
            }
            return;
        }
        if(packagename.equalsIgnoreCase("Optimal")){
            result.addProduct(ProcessorFactory.createProcessor("Arduino Mega"));
            while(number_of_display > 0){
                result.addProduct(DisplayFactory.createDisplay("LED"));
                number_of_display--;
            }
            return;
        }
        if(packagename.equalsIgnoreCase("Poor")){
            result.addProduct(ProcessorFactory.createProcessor("ATMega32"));
            while(number_of_display > 0){
                result.addProduct(DisplayFactory.createDisplay("LED"));
                number_of_display--;
            }
            return;
        }

        System.out.println("Invalid Package Name");
    }

    public void addCommunication(String moduleName){
        result.addProduct(CommunicationFactory.createCommunicationModule(moduleName));
    }

    public QueueManagementSystem getObject(){
        return result;
    }
}
