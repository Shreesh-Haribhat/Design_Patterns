package Design_Patterns.Creational_DP.Factory_DP;

import Design_Patterns.Creational_DP.Factory_DP.Components.Buttons.Button;

public class Client {
    public static void main(String[] args)
    {
        Flutter flutter = new Flutter();
        //flutter.setThieme();

        UIFactory uiFactory = flutter.createUIFactory("Android");
        Button button = uiFactory.createButton();
        button.changeSize();
    }
}
