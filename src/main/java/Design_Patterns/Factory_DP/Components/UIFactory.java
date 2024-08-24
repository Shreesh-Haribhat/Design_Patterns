package Design_Patterns.Factory_DP.Components;

import Design_Patterns.Factory_DP.Components.Buttons.Button;
import Design_Patterns.Factory_DP.Components.DropDown.DropDown;
import Design_Patterns.Factory_DP.Components.Menu.Menu;

public interface UIFactory {
    public Button createButton();

    public Menu createMenu();

    public DropDown createDown();
}
