package Design_Patterns.Creational_DP.Factory_DP;

import Design_Patterns.Creational_DP.Factory_DP.Components.Buttons.Button;
import Design_Patterns.Creational_DP.Factory_DP.Components.DropDowns.DropDown;
import Design_Patterns.Creational_DP.Factory_DP.Components.Menus.Menu;

public interface UIFactory {

    public Button createButton();

    public Menu createMenu();

    public DropDown createDropDown();
}
