package Design_Patterns.Structural_DP.Adaptor_DP;

import java.util.List;

public class Client {
    public static void main(String[] args)
    {

        PhonePe phonePe = new PhonePe(new ICICIBankAPIAdaptor());

        double bal = phonePe.CheckBalance("124567");
        List<Integer> mini = phonePe.getMIni("12345");

        System.out.println(bal);
        System.out.println(mini);
    }
}
