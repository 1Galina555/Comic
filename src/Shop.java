import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class Shop implements Serializable {
  private static final long serialVersionUID = 1L;

  private List<Comics> Shop;
  private List<InUsers> Users;
  private List<Sale> sales;
  enum Type_Date{
    BY_DAY,BY_WEEK,BY_MONTH,BY_YEAR
  };


  public Shop() {
    Shop = new ArrayList<Comics>();
    Users = new ArrayList<InUsers>();
    sales=new ArrayList<Sale>();

  }

  void Add_User(InUsers newUser) {
    Users.add(newUser);
  }

  void Delete_User(String login) {
    Users.remove(login);
  }

  public void Add_comic(Comics newComics) {
    //Scanner com=new Scanner(System.in);
    //System.out.println("Введите данные нового комикса:1.название комикса\n2.данные автора\n3.издание\n4.кол-во страниц комикса\n5.жанр комикса\n6.год издания\n7.себестоимость\n8.цена для продажи\n9.является ли комикс продолжением какого-то другого комикса или серии комиксов-1 является, 0-не является");
    //String name_comic=com.nextLine();
    //String name_fio_author=com.nextLine();
    //String publishing_houses=com.nextLine();
    //long pages=com.nextInt();
    //String genre=com.nextLine();
    //int year=com.nextInt();
    //int price=com.nextInt();
    //int sale=com.nextInt();
    //boolean continuation=com.nextBoolean();
    Shop.add(newComics);//вызываем в мейне -добавляем новый объект в лист
  }

  public void delete_comics(String name_comic) {//вызываем в мейне -по имени комикса удаляем
    //System.out.println("Введите комикс,который нужно удалить");
    //Scanner com=new Scanner(System.in);
    //String delete=com.nextLine();
    Shop.remove(name_comic);
  }

  public String editor_comic(String nameComic) {
    //System.out.println("Введите комикс,который нужно изменить");
    // Scanner com=new Scanner(System.in);
    //String rename=com.nextLine();
    //Scanner ex=new Scanner(System.in);

    Comics found = Shop.stream()//ищем нужный комикс для изменения и потом в мейне выбор изменения->изменение
            .filter(c -> c.getName_comic().equals(nameComic))
            .findAny()
            .orElseThrow();

    return "Изменение прошло удачно";
  }

  public boolean sell_comics(String nameComic, Comics newComics,Sale newsale) {//продажа(уменьшает кол-во комиксов в наличии на 1,увеличивает кол-во продаж комикса на 1)
    Comics found = Shop.stream()
            .filter(c -> c.getName_comic().equals(nameComic))
            .findAny()
            .orElseThrow();
    if (found.getNum()<1)
      return false;
    found.setNum(found.getNum()-1);
    found.setGetSale(found.getGetSale()+1);
    int balanceSale = found.getSale();
    InUsers foundUs = Users.stream()
            .filter(c -> c.getMyComics().equals(nameComic))
            .findAny()
            .orElseThrow();
    if(foundUs.balance<found.getSale())
      return false;
    foundUs.MyComics.add(newComics);
    int oldBalance = foundUs.getBalance();
    foundUs.setBalance(oldBalance - balanceSale);
    sales.add(newsale);
    return true;
  }

  public void write_off_comics(String nameComic) {
    Comics found = Shop.stream()//при списывании уменьшаем кол-во комиксов
            .filter(c -> c.getName_comic().equals(nameComic))
            .findAny()
            .orElseThrow();
    found.setNum(found.getNum()-1);
  }

  public void promotionBlackFriday(String nameComic) {
    Comics found = Shop.stream()//выбираем комиксы по имени участвующие в черной пятнице и меняем им цену на 20%
            .filter(c -> c.getName_comic().equals(nameComic))
            .findAny()
            .orElseThrow();
    int old_price = found.getSale();
    found.setSale(old_price - ((old_price * 20) / 100));

  }

  public void promotionNewYear(String nameComic) {
    Comics found = Shop.stream()//выбираем комиксы по имени участвующие в черной пятнице и меняем им цену на 30%
            .filter(c -> c.getName_comic().equals(nameComic))
            .findAny()
            .orElseThrow();
    int old_price = found.getSale();
    found.setSale(old_price - ((old_price * 30) / 100));
  }

  public void postpone_comic() {

  }

  /*public void searchName(String nameComic) {- поиски по имени,автору,жанру
    Comics found = Shop.stream()
            .filter(c -> c.getName_comic().equals(nameComic))
            .findAny()
            .orElseThrow();

  }

  public boolean searchAuthor(String author){
    Comics found = Shop.stream()
            .filter(c -> c.getName_fio_author().equals(author))
            .findAny()
            .orElseThrow();
    return true;
  }
  public void searchAuthor(String genre) {
    Comics found = Shop.stream()
            .filter(c -> c.getGenre().equals(genre))
            .findAny()
            .orElseThrow();
  }*/
/*public List<String>MostPopularGenre(Type_Date type_date){
  Date now=new Date();
  Map<String,Integer> freq=new HashMap<>();
  Shop.stream()
          .filter()
  for (Comics comics:Shop){
    freq.merge(comics.getGenre(),1,Integer::sum);
  }
}*/


}