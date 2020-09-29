interface AccountService {
    /**
     * It finds an account by owner id
     * @param id owner unique identifier
     * @return account or null
     */
    Account findAccountByOwnerId(long id);
    /**
     * It count the number of account with balance > the given value
     * @param value
     * @return the number of accounts
     */
    long countAccountsWithBalanceGreaterThan(long value);
}

class AccountServiceImpl implements AccountService {

    public Account[] accounts;

    public AccountServiceImpl(Account[] accounts) {
        this.accounts = accounts.clone();
    }

    public Account findAccountByOwnerId(long id) {
        for (Account a : accounts) {
            if (a.getOwner().getId() == id) {
                return a;
            }
        }
        return null;
    }
    public long countAccountsWithBalanceGreaterThan(long value) {
        long count = 1;
        for (int i = 0; i < accounts.length - 1; i++) {
            if (accounts[i].getBalance() > value) {
                count++;
            }
        }
        return count;
    }
}
class Account {

    private long id;
    private long balance;
    private User owner;

    public Account(long id, long balance, User owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public long getId() { 
        return id; 
    }

    public long getBalance() { 
        return balance; 
    }

    public User getOwner() { 
        return owner; 
    }
}

class User {

    private long id;
    private String firstName;
    private String lastName;

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() { 
        return id; 
    }

    public String getFirstName() { 
        return firstName; 
    }

    public String getLastName() { 
        return lastName; 
    }
}