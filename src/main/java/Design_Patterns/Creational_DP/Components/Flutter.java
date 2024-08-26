package Design_Patterns.Creational_DP.Components;

public class Flutter {

    public void setTheram()
    {
        System.out.println("Setting Theme");
    }

    public void setRefreshRate()
    {
        System.out.println("CHanging Refresh rate");
    }

    public UIFactory createUIFactory(String platform)
    {
//        if(platform.equals("Android"))
//        {
//            return new AndroidUIFactory();
//        }
//        if(platform.equals("IOS"))
//        {
//            return new IOSUIFactory();
//        }
        return UIFactory_Factory.createUIFactory(platform);
    }

}
