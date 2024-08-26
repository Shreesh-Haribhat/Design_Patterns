package Design_Patterns.Creational_DP.Components;

import Design_Patterns.Creational_DP.Components.Buttons.IOSButton;
import Design_Patterns.Creational_DP.Components.DropDown.IOSDropDown;
import Design_Patterns.Creational_DP.Components.Menu.IOSMenu;

public class IOSUIFactory implements UIFactory{
    @Override
    public IOSButton createButton() {
        System.out.println("Created IOS UIFACTORY ");
        return new IOSButton();
    }

    @Override
    public IOSMenu createMenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropDown createDown() {
        return new IOSDropDown();
    }
}
