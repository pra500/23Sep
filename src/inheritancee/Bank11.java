package inheritancee;

public class Bank11 implements Bank{


    public void cashdeposit()
    {
        System.out.println("depositing");
    }


    public static void main(String[] args) {

        Bank11 b11=new Bank11();
        b11.cashdeposit();



    }
}
