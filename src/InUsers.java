import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InUsers implements input{
   private String loginAdmin="Admin";
    private int passwordAdmin=666;
    public List<Comics> MyComics;
    public String login;
    public  int password;
    public int balance;

    @Override
    public boolean inputAdmin(String login,int password) {
       // System.out.println("Введите логин:");
        //Scanner S=new Scanner(System.in);
        //String login=S.nextLine();
        //System.out.println("Введите пароль:");
        //int password=S.nextInt();
        if(login==getLoginAdmin()&&password==getPasswordAdmin()){
            return true;}
        else
         return false;
    }

    public String getLoginAdmin() {
        return loginAdmin;
    }

    public void setLoginAdmin(String loginAdmin) {
        this.loginAdmin = loginAdmin;
    }

    public int getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(int passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }

    @Override
    public void inputUser(String login, int password, int balance, List<Comics> MyComics) {
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
