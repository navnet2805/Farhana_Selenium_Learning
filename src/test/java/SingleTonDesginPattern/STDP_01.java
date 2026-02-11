package SingleTonDesginPattern;

public class STDP_01 {

    //1.make instance varibale as private
    private static STDP_01 inst;

    //2. constructor and make it private
    private STDP_01()
    {

    }

    //3. method to create an object once
    public static STDP_01 getInstance()
    {
        if (inst == null)
        {
           inst = new STDP_01(); //object wil be created only once.
        }

        return inst;
    }

    public void nsmethod()
    {
        System.out.println("single ton object created");
    }
}
