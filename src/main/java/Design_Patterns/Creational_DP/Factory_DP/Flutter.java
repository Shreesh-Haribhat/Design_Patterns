package Design_Patterns.Creational_DP.Factory_DP;

public class Flutter {

    String platform;

    public Flutter(){}
    public Flutter(String platform)
    {
        this.platform = platform;
    }

    public void setThieme()
    {
        System.out.println("Setting Theme");
    }

    public void setRefreshRate()
    {
        System.out.println("Setting refresh Rate");
    }

    public UIFactory createUIFactory(String platform)
    {
//        if(platform.equals("IOS"))
//        {
//            return new IOS_UI_Factory();
//        }
//        else if(platform.equals("Android"))
//        {
//            return new Anroid_UI_Factory();
//        }
//
//        return null;

        return  UIFactoryFactory.createUIFactory(platform);
    }

}
