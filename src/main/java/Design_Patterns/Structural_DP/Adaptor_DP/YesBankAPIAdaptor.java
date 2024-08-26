package Design_Patterns.Structural_DP.Adaptor_DP;

import Design_Patterns.Structural_DP.Adaptor_DP.Thirdparty.YESBank.YesBank;

import java.util.List;

public class YesBankAPIAdaptor implements BankAPIAdaptor{

    YesBank yesBank = new YesBank();

    @Override
    public double CheckBalance(String accountNumber) {
        return yesBank.checkBalanace(accountNumber);
    }

    @Override
    public List<Integer> GiveMiniStatement(String accountNumber) {
        return yesBank.MiniStatement(accountNumber);
    }

    @Override
    public void SendMoney(String fromAccount, String toAccount, double Amount) {

    }
}
