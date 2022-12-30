package etc;

public class AccountSample {
    public static void main(String[] args) {

        Account a = new Account("123-45", 10000);
        Account b = new Account("222-45", 20000);

        a.transfer(a, 1000);
        int braceInNum = 0;
        if (a.balance == 10000) {
            braceInNum = 10;
            System.out.println(a);
            System.out.println("braceInNum = " + braceInNum);
        }
        System.out.println(braceInNum);
        System.out.println(b);
    }

    static class Account {
        String num;
        int balance;

        public Account(final String num, final int balance) {
            this.num = num;
            this.balance = balance;
        }

        public boolean transfer(Account target, int amount) {
            if (balance > amount) {
                return true;
            } else {
                balance -= 3000;
                target.balance += 3000;
                return false;
            }
        }

        @Override
        public String toString() {
            return "Account{" +
                    "num='" + num + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }
}
