
public class PayrollDriver {
    
    public static void main(String args[])
    {
        Payroll1 emp1 = new Payroll1("Tuhin", 162);
        
        emp1.sethoursworked(12.6);
        emp1.setpayrate(67.3);
        
        System.out.println("Personal Info: " + "\n" +
                        "Name: " + emp1.getname() + "\n" +
                        "Id Number: " + emp1.getidnumber() + "\n" +
                        "Hours Worked: " + emp1.gethoursworked() + "\n" +
                        "Pay Rate: " + emp1.getpaayrate() + "\n" +
                        "Gross Pay: " + emp1.getGrosspay() + "\n");
    }
}
