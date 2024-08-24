package Design_Patterns.Factory_DP.Components;

import Design_Patterns.Factory_DP.Components.Buttons.AndroidButton;
import Design_Patterns.Factory_DP.Components.Buttons.Button;
import Design_Patterns.Factory_DP.Components.DropDown.AndroidDropDown;
import Design_Patterns.Factory_DP.Components.DropDown.DropDown;
import Design_Patterns.Factory_DP.Components.Menu.AndroidMenu;
import Design_Patterns.Factory_DP.Components.Menu.Menu;

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
