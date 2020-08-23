package AbstractFactory.factories;

import AbstractFactory.button.Button;
import AbstractFactory.button.MacOSButton;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton(){
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new MacOSCheckbox();
    }
}
