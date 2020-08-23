package AbstractFactory;

import AbstractFactory.app.Application;
import AbstractFactory.factories.GUIFactory;
import AbstractFactory.factories.MacOSFactory;
import AbstractFactory.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication(){
        Application application;
        GUIFactory guiFactory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")){
            guiFactory = new MacOSFactory();
            application = new Application(guiFactory);
        }

        else{
            guiFactory = new WindowsFactory();
            application = new Application(guiFactory);
        }

        return application;
    }
    
    public static void  main(String[]args){
        Application application = configureApplication();
        application.paint();
    }
}
