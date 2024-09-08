package Design_Patterns.Creational_DP.Factory_DP;

import Design_Patterns.Creational_DP.Factory_DP.Components.Buttons.Android_Button;
import Design_Patterns.Creational_DP.Factory_DP.Components.Buttons.Button;
import Design_Patterns.Creational_DP.Factory_DP.Components.DropDowns.Android_DropDown;
import Design_Patterns.Creational_DP.Factory_DP.Components.DropDowns.DropDown;
import Design_Patterns.Creational_DP.Factory_DP.Components.Menus.Android_Menu;
import Design_Patterns.Creational_DP.Factory_DP.Components.Menus.Menu;

public class Anroid_UI_Factory implements UIFactory{


    @Override
    public Android_Button createButton() {
        System.out.println("Create Android Button");
        return new Android_Button();
    }

    @Override
    public Menu createMenu() {
        System.out.println("Create Android Menu");
        return new Android_Menu();
    }

    @Override
    public DropDown createDropDown() {
        System.out.println("Create Android DropDown");
        return new Android_DropDown();
    }
}
