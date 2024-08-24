package Design_Patterns.Factory_DP.Components.Buttons;

public class AndroidButton implements Button{
    @Override
    public void openFolder() {
        System.out.println("Opened Folder");
    }
}
