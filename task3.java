
package Placement;

public class task3 {
double balance=0;
void deposit(double amount) {
	balance=balance+amount;
}
void withdraw(double amount) {
	if(amount<=balance) {
		balance=balance-amount;
	}
	else {
		System.out.println("amount is less");
	}
	}
void ShowBalance() {
	System.out.println("balance" + balance);
}
public static void main(String[]args) {
	task3 bank=new task3();
	bank.deposit(100);
	bank.withdraw(50);
	bank.ShowBalance();
}
}
