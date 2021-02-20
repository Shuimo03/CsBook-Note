package AbstractFactory.app;

import AbstractFactory.button.Button;
import AbstractFactory.checkboxes.Checkbox;
import AbstractFactory.factories.GUIFactory;

/**
 * @author wuliang
 * @date 2020/8/23
 * 客户端代码
 */
public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
