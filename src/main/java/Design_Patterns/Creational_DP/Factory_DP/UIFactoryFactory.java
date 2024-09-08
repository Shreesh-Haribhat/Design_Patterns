package Design_Patterns.Creational_DP.Factory_DP;

public class UIFactoryFactory {

    public static UIFactory createUIFactory(String platform)
    {
        if(platform.equals("IOS"))
        {
            return new IOS_UI_Factory();
        }
        else if(platform.equals("Android"))
        {
            return new Anroid_UI_Factory();
        }

        return null;
    }
}
