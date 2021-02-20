package AbstractFactory.factories;

import AbstractFactory.button.Button;
import AbstractFactory.button.WindowsButton;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
}
