import java.io.Serializable;
import java.util.List;

public interface input extends Serializable {
    boolean  inputAdmin(String loginAdmin,int passwordAdmin);
   void inputUser(String login, int password, int balance, List<Comics> MyComics);

}
