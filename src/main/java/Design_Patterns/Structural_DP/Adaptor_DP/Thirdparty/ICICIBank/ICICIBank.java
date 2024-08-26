package Design_Patterns.Structural_DP.Adaptor_DP.Thirdparty.ICICIBank;

import java.util.List;

public class ICICIBank {

    public double checkBalance(String accountNumber)
    {
        return 90000.64;
    }

    public List<Integer> getMiniStatement(String accountNumber)
    {
        return List.of(23,545,4325,547,3425,5747);
    }
}
