import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner com=new Scanner(System.in);
        Scanner str=new Scanner(System.in);
        List<Comics>MyShop=new ArrayList<>();
        List<InUsers>MyUsers=new ArrayList<>();
            System.out.println("Welcome to Comic Shop!");
            System.out.println("1.Войти как администратор\n2.Войти как пользователь");
            int n= com.nextInt();
            if (n==1){
                System.out.println("Введите логин ");
                String name=str.nextLine();
                System.out.println("Введите  пароль");
                int cod= com.nextInt();
InUsers Admin=new InUsers();
                 if (Admin.inputAdmin(name,cod)==true){
                     System.out.println("Welcome to Comic Shop Admin");
                 }
                 else System.out.println("Eror");
            }
            System.out.println();

        FileOutputStream outputStream = new FileOutputStream("ComicsShop.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        // сохраняем  в файл
        objectOutputStream.writeObject(MyShop);

        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();


    }
}