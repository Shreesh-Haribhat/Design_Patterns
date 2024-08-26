package Design_Patterns.Structural_DP.Adaptor_DP;

import java.util.List;

public class PhonePe {

    BankAPIAdaptor bankAPI;

    public PhonePe(BankAPIAdaptor bankAPI)
    {
        this.bankAPI = bankAPI;
    }


    public double CheckBalance(String accountNumber)
    {
        double currentBalance = bankAPI.CheckBalance(accountNumber);
        return currentBalance;
    }

    public List<Integer> getMIni(String accountNumber)
    {
        return bankAPI.GiveMiniStatement(accountNumber);
    }

}
