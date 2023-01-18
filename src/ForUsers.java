import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ForUsers implements Serializable {
    private List<User> Users;
    private static final long serialVersionUID = 1L;
    public ForUsers() {

        Users = new ArrayList<User>();


    }
    static void Add_User(List<User> Users, User newUser){
        Users.add(newUser);
    }

    void Delete_User(String login) {
        Users.remove(login);
    }
  static boolean Input_User(String login, int password, List<User> Users){
        User found = Users.stream()//ищем совпадения с пользователями
                .filter(c -> c.getLogin().equals(login))
                .findAny()
                .orElseThrow();
        if(found.getPassword()==password){
            return true;}
        else {
            return false;
        }

    }
    static int  Sale_comic(List<User> Users,List<Comics> MyComics,String login,int price,Comics newcomic,int num,String name_comics){
        User found = Users.stream()//ищем совпадения с пользователями
                .filter(c -> c.getLogin().equals(login))
                .findAny()
                .orElseThrow();
        if(found.getBalance()>(price*num)){
        found.setBalance(found.getBalance()-(price*num));
        found.getMyComics().add(newcomic);
            Comics foundcomic = MyComics.stream()//ищем совпадения с пользователями
                    .filter(c -> c.getName_comic().equals(name_comics))
                    .findAny()
                    .orElseThrow();
            foundcomic.setNum(foundcomic.getNum()+num);
            return num;
        }
        else
            return 0;
    }
}
