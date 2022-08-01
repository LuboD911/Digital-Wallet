package Client;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    // TODO obvurji s baza vij kak shte stane

    private Long id;
    private String username;
    private String password;
    private LocalDateTime lastTimeLoggedIn;
    private Boolean loggedIn;

    private ArrayList<Account> accounts;

    public Customer(Long id, String username, String password, ArrayList<Account> accounts) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.accounts = accounts;
        this.loggedIn = false;
        this.lastTimeLoggedIn = LocalDateTime.now();
    }

    public Boolean login(String username, String password){
        // TODO password encryption
        if(username.equals(this.username) && password.equals(this.password)){
            this.loggedIn = true;
            this.lastTimeLoggedIn = LocalDateTime.now();
            return true;
        }
        return false;
    }

    public Boolean Logout(){
        if(!this.loggedIn){
            System.out.println("You need to be logged in to execute this command");
            return false;
        }
        this.loggedIn = false;
        System.out.println("Successfully logged out!");
        return true;
    }
// TODO validations, exceptions, etc.
    public Boolean deposit(Account account, BigDecimal amount, String currency){
        return account.deposit(amount, currency);
    }

    public Boolean withdrawal(Account account, BigDecimal amount, String currency){
        return account.withdrawal(amount, currency);
    }

    public List<BigDecimal> balance(){
        List balances = new ArrayList();
        for(Account acc: this.accounts){
            balances.add(acc.getAmount());
        }
        return balances;
    }

    public List history(){
        // TODO
        // NZ kude shte pazq history v baza li kvo
        return List.of();
    }

    public String getUsername() {
        return username;
    }

    public Customer setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    public LocalDateTime getLastTimeLoggedIn() {
        return lastTimeLoggedIn;
    }

    public Customer setLastTimeLoggedIn(LocalDateTime lastTimeLoggedIn) {
        this.lastTimeLoggedIn = lastTimeLoggedIn;
        return this;
    }

    public Long getId() {
        return id;
    }

    public Customer setId(Long id) {
        this.id = id;
        return this;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    public Customer setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
        return this;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public Customer setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
        return this;
    }
}

