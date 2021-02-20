package AbstractFactory.factories;

import AbstractFactory.button.Button;
import AbstractFactory.checkboxes.Checkbox;

public interface GUIFactory {

    Button createButton();
    Checkbox createCheckbox();
}
