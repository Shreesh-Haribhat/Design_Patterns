package Design_Patterns.Creational_DP.Components.Buttons;

public class IOSButton implements Button{
    @Override
    public void openFolder() {
        System.out.println("Opend IOS Folder");
    }
}
