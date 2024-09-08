package Design_Patterns.Creational_DP.Factory_DP.Components.Buttons;

public class Android_Button implements Button{
    @Override
    public void changeSize() {
        System.out.println("Changes size of the button");
    }
}
