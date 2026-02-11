package SingleTonDesginPattern;

public class STDP_runner {

    public static void main(String[] args) {

//        STDP_01 obj = new STDP_01();
//        STDP_01 obj1 = new STDP_01();

        STDP_01 obj = STDP_01.getInstance();
        STDP_01 obj1 = STDP_01.getInstance();

        obj.nsmethod();
        obj1.nsmethod();

        System.out.println(obj==obj1);

    }
}
