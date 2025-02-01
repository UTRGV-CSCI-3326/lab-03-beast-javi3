public class BankAccount{
public static void main(String[] args){
float balance = 2175.37f; 
//System.out.println(" Bob has a total balance of "  + balance );

balance -= 302.50f;

System.out.println(String.format( "%.2f" , balance) );

balance += 50.03f;
System.out.println(String.format( "%.2f" ,balance));

balance /=2;
balance += 20;
System.out.println(String.format( "%.2f",balance));

balance -=1;
System.out.println(String.format("%.2f" , balance));

balance *=2;
System.out.println(String.format("%.2f" , balance));

balance +=1;
System.out.println(String.format("%.2f", balance ));
System.out.println( "BOb's new balance after all of his transactions " + String.format("%.2f ", balance));
}
}
