package Design_Patterns.Factory_DP.Components;

public class UIFactory_Factory {

    public static UIFactory createUIFactory(String platform)
    {
        if(platform.equals("Android"))
        {
            return new AndroidUIFactory();
        }
        if(platform.equals("IOS"))
        {
            return new IOSUIFactory();
        }
        return null;
    }
}
