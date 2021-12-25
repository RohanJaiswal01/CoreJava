
public class TestAccount {
public static void main(String[] args) {
Account ac[]= new Account[2];
ac[0]=new Account();
ac[1]=new Account();

ac[0].setAcno("101101010101");
ac[0].setActype("saving");
ac[0].setbal(10000.00);
System.out.println(ac[0].getAcno());
System.out.println(ac[0].getActype());
System.out.println(ac[0].getbal());
System.out.println(ac[0].deposite(1000.0));
System.out.println(ac[0].withdrawl(500.0));
System.out.println(ac[0].getbal());
ac[0].withdrawl(100);
ac[1].deposite(100);
}}

