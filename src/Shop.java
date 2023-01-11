import java.util.ArrayList;
import java.util.Scanner;

public class Shop extends Comics{
  ArrayList<Comics> Shop = new ArrayList<Comics>();


  public void Add_comic() {
    Scanner com=new Scanner(System.in);
    System.out.println("Введите данные нового комикса:1.название комикса\n2.данные автора\n3.издание\n4.кол-во страниц комикса\n5.жанр комикса\n6.год издания\n7.себестоимость\n8.цена для продажи\n9.является ли комикс продолжением какого-то другого комикса или серии комиксов-1 является, 0-не является");
    String name_comic=com.nextLine();
    String name_fio_author=com.nextLine();
    String publishing_houses=com.nextLine();
    long pages=com.nextInt();
    String genre=com.nextLine();
    int year=com.nextInt();
    int price=com.nextInt();
    int sale=com.nextInt();
    boolean continuation=com.nextBoolean();
    Shop.add(new Comics());
    }
    public void delete_comics(){
      System.out.println("Введите комикс,который нужно удалить");
      Scanner com=new Scanner(System.in);
      String delete=com.nextLine();
      if(delete==name_comic){
        Shop.remove(name_comic);
      }
    }
    public String editor_comic() {
      System.out.println("Введите комикс,который нужно изменить");
      Scanner com=new Scanner(System.in);
      String rename=com.nextLine();
      Scanner ex=new Scanner(System.in);

      if (rename==name_comic){
        Shop.set(name_comic=com.nextLine(),name_fio_author=com.nextLine(),publishing_houses=com.nextLine(),pages= com.nextLong(),genre=com.nextLine(),year=com.nextInt(),price=com.nextInt(),sale=com.nextInt(),continuation=com.nextBoolean());
      }
        return "Изменение прошло удачно";
    }
    public int sell_comics() {
        return 0;
    }
    public void write_off_comics() {

    }
    public void promotionBlackFriday() {

    }
    public void promotionNewYear() {

    }
    public void postpone_comic() {

    }
}
