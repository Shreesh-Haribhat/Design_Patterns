package Design_Patterns.Creational_DP.Components;

import Design_Patterns.Creational_DP.Components.DropDown.AndroidDropDown;
import Design_Patterns.Creational_DP.Components.Menu.AndroidMenu;
import Design_Patterns.Creational_DP.Components.Buttons.AndroidButton;

public class AndroidUIFactory implements UIFactory{
    @Override
    public AndroidButton createButton() {
        System.out.println("Created Android Button ");
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropDown createDown() {
        return new AndroidDropDown();
    }
}
