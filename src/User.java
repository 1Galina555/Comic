import java.io.Serializable;
import java.util.List;

public class User extends ForUsers {
    private String login;
    private   int password;
    private int balance;
    private List<Comics> MyComics;

    public User(  String login, int password,int balance, List<Comics> MyComics){
        this.login=login;
        this.password=password;
        this.balance=balance;
        this.MyComics=MyComics;

    }

    public List<Comics> getMyComics() {
        return MyComics;
    }

    public void setMyComics(List<Comics> myComics) {
        MyComics = myComics;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
