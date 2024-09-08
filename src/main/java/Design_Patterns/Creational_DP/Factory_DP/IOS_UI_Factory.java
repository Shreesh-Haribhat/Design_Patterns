package Design_Patterns.Creational_DP.Factory_DP;

import Design_Patterns.Creational_DP.Factory_DP.Components.Buttons.IOS_Button;
import Design_Patterns.Creational_DP.Factory_DP.Components.DropDowns.DropDown;
import Design_Patterns.Creational_DP.Factory_DP.Components.DropDowns.IOS_DropDown;
import Design_Patterns.Creational_DP.Factory_DP.Components.Menus.IOS_Menu;

public class IOS_UI_Factory implements UIFactory{
    @Override
    public IOS_Button createButton() {
        System.out.println("Create an IOS Button");
        return new IOS_Button();
    }

    @Override
    public IOS_Menu createMenu() {
        System.out.println("Create an IOS Menu");
        return new IOS_Menu();
    }

    @Override
    public IOS_DropDown createDropDown() {
        System.out.println("Create an IOS DropDown");
        return new IOS_DropDown();
    }
}
