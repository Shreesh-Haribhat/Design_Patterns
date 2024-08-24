package Design_Patterns.Factory_DP.Components;

import Design_Patterns.Factory_DP.Components.Buttons.Button;
import Design_Patterns.Factory_DP.Components.Buttons.IOSButton;
import Design_Patterns.Factory_DP.Components.DropDown.DropDown;
import Design_Patterns.Factory_DP.Components.DropDown.IOSDropDown;
import Design_Patterns.Factory_DP.Components.Menu.IOSMenu;
import Design_Patterns.Factory_DP.Components.Menu.Menu;

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
