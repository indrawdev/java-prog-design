package javaprogramdesign.chapter05.bank13;

public interface BankAccount extends Comparable<BankAccount> { 
   int getAcctNum();
   int getBalance();   
   void deposit(int amt);
   boolean isForeign();
   void setForeign(boolean isforeign);
   boolean hasEnoughCollateral(int loanamt);
   String toString();
   void addInterest();
   int fee();

   default boolean isEmpty() {
      return getBalance() == 0;
   }

   static BankAccount createSavingsWithDeposit(int acctnum, int n) {
      AccountFactory af = new SavingsFactory();
      BankAccount ba = af.create(acctnum);
      ba.deposit(n);
      return ba;
   }
}