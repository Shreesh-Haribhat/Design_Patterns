package Design_Patterns.Creational_DP.Components;

import Design_Patterns.Creational_DP.Components.Buttons.Button;

public class Client {
    public static void main(String[] args)
    {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory("Android");

        Button button = uiFactory.createButton();
        button.openFolder();

    }
}
