package Design_Patterns.Structural_DP.Adaptor_DP;

import Design_Patterns.Structural_DP.Adaptor_DP.Thirdparty.ICICIBank.ICICIBank;

import java.util.List;

public class ICICIBankAPIAdaptor implements BankAPIAdaptor{

    ICICIBank iciciBank = new ICICIBank();

    @Override
    public double CheckBalance(String accountNumber) {

        return iciciBank.checkBalance(accountNumber);

    }

    @Override
    public List<Integer> GiveMiniStatement(String accountNumber) {

        return iciciBank.getMiniStatement("2242626");
    }

    @Override
    public void SendMoney(String fromAccount, String toAccount, double Amount) {

    }
}
