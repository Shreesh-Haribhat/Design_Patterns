package Design_Patterns.Structural_DP.Adaptor_DP;

import java.util.List;

public interface BankAPIAdaptor {

    public double CheckBalance(String accountNumber);

    public List<Integer> GiveMiniStatement(String accountNumber);

    public void SendMoney(String fromAccount, String toAccount, double Amount);

}
