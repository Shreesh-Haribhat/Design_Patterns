package Design_Patterns.Structural_DP.Adaptor_DP;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args)
    {

//        PhonePe phonePe = new PhonePe(new ICICIBankAPIAdaptor());
//
//        double bal = phonePe.CheckBalance("124567");
//        List<Integer> mini = phonePe.getMIni("12345");
//
//        System.out.println(bal);
//        System.out.println(mini);

        int asteroids[] = {-2,-1,1,-2};
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<asteroids.length;i++)
        {
            if(asteroids[i] < 0)
            {
                //int idx = i;
                if(arr.size() >0)
                {
                    if(arr.get(arr.size()-1) < 0)
                    {
                        arr.add(asteroids[i]);
                        continue;
                    }
                }
                while(arr.size()>0 && Math.abs(arr.get(arr.size()-1)) < Math.abs(asteroids[i]))
                {
                    arr.remove(arr.size()-1);
                }

                if(arr.size() == 0)
                {
                    arr.add(asteroids[i]);
                    System.out.println(arr);
                }
                else if(arr.get(arr.size() - 1) < 0)
                {
                    arr.add(asteroids[i]);
                    System.out.println(arr);
                }
                else if(Math.abs(arr.get(arr.size() - 1)) == Math.abs(asteroids[i]))
                {
                    arr.remove(arr.size()-1);
                    System.out.println(arr);
                }
                System.out.println();
            }
            else
            {
                arr.add(asteroids[i]);
                System.out.println(arr);
            }
        }
        System.out.println(arr);
    }
}
