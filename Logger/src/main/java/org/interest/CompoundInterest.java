package interest;

public class CompoundInterest {
    public static double calculate(double principal, double time, double rate)
    {
        double result=Double.parseDouble(String.format("%.2f", principal * Math.pow(1.0+rate/100.0,time) - principal));
        return result;
    }
}
