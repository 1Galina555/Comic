import java.util.Scanner;

public class InUsers implements input {
   private String login="Galina";
    private int password=666;
    @Override
    public boolean input() {
        System.out.println("Введите логин:");
        Scanner S=new Scanner(System.in);
        String login=S.nextLine();
        System.out.println("Введите пароль:");
        int password=S.nextInt();
        if(login==this.login&&password==this.password)
            return true;
        else
        return false;
    }
}
