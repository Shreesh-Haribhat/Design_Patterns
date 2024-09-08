package Design_Patterns.Creational_DP.Factory_DP.Components.Menus;

public class IOS_Menu implements Menu{
    @Override
    public void createMenu() {
        System.out.println("Created IOS MENU");
    }
}
