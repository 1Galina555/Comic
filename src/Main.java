import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner com = new Scanner(System.in);
        Scanner str = new Scanner(System.in);
        Scanner enter=new Scanner(System.in);
        Scanner rs=new Scanner(System.in);
        Scanner it=new Scanner(System.in);
        List<Comics> MyShop = new ArrayList<Comics>();
        List<Comics> MyComics = new ArrayList<Comics>();
        List<Sale>ShopSales=new ArrayList<Sale>();
        Date date1 = new Date();
        Date date2 = new Date();
        Date date3 = new Date();
        Date date4 = new Date();
        Date date5 = new Date();
        Comics comics1 = new Comics("Ходячие Мертвецы: Восхождение Губернатора", "Роберт Киркман", "Image Comics", 133, "Хоррор", 2011, 212, 350, true, 2, 12, date1);
        Comics comics2 = new Comics("Ходячие Мертвецы: Дорога в Вудбери", "Роберт Киркман", "Image Comics", 170, "Хоррор", 2012, 290, 450, true, 1, 9, date2);
        Comics comics3 = new Comics("Бэтмен. Убийственная шутка", " Криста Фауст", "DC Comics", 48, "Фэнтези", 1988, 190, 250, false, 12, 19, date3);
        Comics comics4 = new Comics("Академия Амбрелла", " Джерард Уэем,Габриэль Ба", "Dark Horse Comics", 555, "Фэнтези", 2007, 690, 950, false, 2, 14, date3);
        Comics comics5 = new Comics("Одеяла", "Крейг Томпсон ", "Top Shelf", 592, "Роман", 2017, 390, 550, false, 1, 4, date4);
        Comics comics6 = new Comics("Riverdale", "Джон Л. Голдуотер,Боб Монтанa ", "Archie Comics", 392, "Приключение", 1990, 690, 850, false, 3, 11, date4);
        Comics comics7 = new Comics("Сабрина. Жуткие приключения ", "Роберто Агирре-Сакаса ", "Комильфо ", 160, "Хоррор", 2014, 490, 630, false, 5, 21, date5);
        Comics comics8 = new Comics("The Last of Us", "Нил Дракманн,Брюс Стрэли", " Sony Computer Entertainment", 1060, "Хоррор", 2013, 890, 930, true, 3, 17, date5);
        Comics comics9 = new Comics("Marvels", "Курт Бьюсик, Алекс Росс", "Jellyfish Jam ", 667, "Фэнтези", 2017, 990, 1130, false, 7, 23, date3);
        Comics comics10 = new Comics("Хеллбой", "Майк Миньола", "XL Media", 1060, "Фэнтези", 1993, 790, 877, false, 1, 7, date5);
        MyShop.add(comics1);
        MyShop.add(comics2);
        MyShop.add(comics3);
        MyShop.add(comics4);
        MyShop.add(comics5);
        MyShop.add(comics6);
        MyShop.add(comics7);
        MyShop.add(comics8);
        MyShop.add(comics9);
        MyShop.add(comics10);
        List<User> MyUsers = new ArrayList<User>();
        User Admin = new User("Admin", 666, 10000, MyShop);
        User user1 = new User("Ivan", 555, 500, MyComics);
        User user2 = new User("Mari", 999, 250, MyComics);
        MyUsers.add(Admin);
        MyUsers.add(user1);
        MyUsers.add(user2);

        System.out.println("Welcome to Comic Shop!");
        System.out.println("1.Войти \n2.Зарегистрироваться");
        int n = com.nextInt();
        if (n == 1) {
            System.out.println("Введите логин ");
            String name = str.nextLine();
            System.out.println("Введите  пароль");
            int cod = com.nextInt();
            if (User.Input_User(name, cod, MyUsers) == true) {
                System.out.printf("Welcome to Comic Shop %s\n" ,name);
                System.out.println("Выберете действие в магазине комиксов:");
                System.out.println( "1 добавлять комиксы");
                System.out.println("2 удалять комиксы");
                System.out.println("3 редактировать параметры комиксов");
                System.out.println("4 продавать комиксы");
                System.out.println("5 списывать комиксы");
                System.out.println( "6 вносить комиксы в акции");
                System.out.println("7 поиск комиксов");
                System.out.println( "8 список новинок");
                System.out.println("9 список самых продаваемых комиксов");
                int enter1 = enter.nextInt();
                switch (enter1){
                    case (1):
                        System.out.println("Введите данные нового комикса:");
                        System.out.println("1.название комикса");
                        String name_comic=str.nextLine();
                        System.out.println("2.Данные автора");
                        String name_fio_author=rs.nextLine();
                        System.out.println("3.издание");
                        String publishing_houses=it.nextLine();
                        System.out.println("4.кол-во страниц");
                        int pages=str.nextInt();
                        System.out.println("5.Жанр");
                        String genre=rs.nextLine();
                        System.out.println("6.Год публикования");
                        int year=com.nextInt();
                        System.out.println("7.Себестоимость");
                        int price=str.nextInt();
                        System.out.println("8.Цена для продажи");
                        int sale=rs.nextInt();
                        System.out.println("9.является ли комикс продолжением какого-то другого комикса или серии комиксов-true является, false-не является");
                        boolean continuation=com.nextBoolean();
                        System.out.println("10.Кол-во экземпляров");
                        int num=str.nextInt();
                        Comics.Add_comic(MyShop,new Comics(name_comic,name_fio_author,publishing_houses,pages,genre,year,price,sale,continuation,0,num,null));
                        break;
                    case (2):
                        System.out.println("Введите имя комикса который нужно удалить");
                        String delete=str.nextLine();
                        /*int ie = MyShop.indexOf(delete);
                        MyShop.remove(delete);*/
                        Comics.Delete_Comic(MyShop,delete);
                        break;
                    case(3):
                        System.out.println("Введите название комикса для изменений");
                        String sname=rs.nextLine();
                        Comics found = MyShop.stream()//ищем нужный комикс для изменения и потом в мейне выбор изменения->изменение
                                .filter(c -> c.getName_comic().equals(sname))
                                .findAny()
                                .orElseThrow();
                        System.out.println("Введите параметр для изменений");
                        System.out.println("1.название комикса");
                        System.out.println("2.Данные автора");
                        System.out.println("3.издание");
                        System.out.println("4.кол-во страниц");
                        System.out.println("5.Жанр");
                        System.out.println("6.Год публикования");
                        System.out.println("7.Себестоимость");
                        System.out.println("8.Цена для продажи");
                        System.out.println("9.является ли комикс продолжением какого-то другого комикса или серии комиксов-true является, false-не является");
                        System.out.println("10.Кол-во экземпляров");
                        int t=it.nextInt();
                        switch (t){
                            case (1):
                                System.out.println("Введите новое название комикса");
                                String now=rs.nextLine();
                                found.setName_comic(now);
                                break;
                            case (2):
                                System.out.println("Введите новые данные автора");
                                String avt=rs.nextLine();
                                found.setName_fio_author(avt);
                                break;
                            case (3):
                                System.out.println("Введите новое издание");
                                String iz=rs.nextLine();
                                found.setPublishing_houses(iz);
                                break;
                            case (4):
                                System.out.println("Введите новое кол-во страниц");
                                int chek= rs.nextInt();
                                found.setPages(chek);
                                break;
                            case (5):
                                System.out.println("Введите новый жанр");
                                String genr1=rs.nextLine();
                                found.setGenre(genr1);
                                break;
                            case (6):
                                System.out.println("Введите новый год публикации");
                                int www=rs.nextInt();
                                found.setYear(www);
                                break;
                            case (7):
                                System.out.println("Введите новую себестоимость");
                                int z=rs.nextInt();
                                found.setPrice(z);
                                break;
                            case (8):
                                System.out.println("Введите новую цену");
                                int nowprice= rs.nextInt();
                                found.setSale(nowprice);
                                break;
                            case (9):
                                System.out.println("является ли комикс продолжением какого-то другого комикса или серии комиксов-true является, false-не является");
                                Boolean a=rs.nextBoolean();
                                found.setContinuation(a);
                                break;
                            case (10):
                                System.out.println("Кол-во экземпляров");
                                int ww=rs.nextInt();
                                found.setNum(ww);
                                break;
                            default:
                                System.out.println("Ничего не изменили");
                                break;
                        }
                        break;
                    case(4):
                        System.out.println("Введите название комикса, который хотите приобрести");
                        String sale_comic=str.nextLine();
                        System.out.println("Введите кол-во комикса, которое хотите приобрести");
                        int count_comic=str.nextInt();
                        Comics.Sale_Comic(MyShop,sale_comic,count_comic);
                        int well=Comics.Sale_Comic(MyShop,sale_comic,count_comic);
                        Comics saleComics = MyShop.stream()//ищем нужный комикс для изменения и потом в мейне выбор изменения->изменение
                            .filter(c -> c.getName_comic().equals(sale_comic))
                            .findAny()
                            .orElseThrow();
                        User.Sale_comic(MyUsers,MyShop,name,well,saleComics,count_comic,sale_comic);
                        int num_sale=User.Sale_comic(MyUsers,MyShop,name,well,saleComics,count_comic,sale_comic);
                        Date sale_date=new Date();
                        Sale new_sale=new Sale(sale_date,saleComics,count_comic);
                        Sale.Add_Sale(new_sale,ShopSales);
                        break;
                    case(5):
                        System.out.println("Введите название комикса, который хотите списать");
                        String write_comic=str.nextLine();
                        Comics.Write_Comic(MyShop,write_comic);
                        break;
                    case(6):
                        System.out.println("Введите название акции, которую хотите применить 1-Черная пятница(-13%),2-Новый год(-25%)");
                        int numb=rs.nextInt();
                        System.out.println("Введите название комикса, участвующий в акции");
                        String Action=it.nextLine();
                        if (numb==1){
                          Comics.Black_friday(MyShop,Action);
                        }
                        if (numb==2){
                            Comics.New_year(MyShop,Action);
                        }
                        break;
                    case (7):
                        System.out.println("Введите параметр поиска");
                        System.out.println("Искать по жанру-1");
                        System.out.println("Искать по автору-2");
                        System.out.println("Искать по названию комикса-3");
                        int res=rs.nextInt();
                        switch (res){
                            case(1):
                                System.out.println("Введите жанр");
                                String searh_genre=it.nextLine();
                                Comics.search_genre(MyShop,searh_genre);
                                System.out.printf("Искомый комикс ",Comics.search_genre(MyShop,searh_genre));
                                break;
                            case(2):
                                System.out.println("Введите автора");
                                String searh_author=it.nextLine();
                                Comics.search_fio_author(MyShop,searh_author);
                                System.out.printf("Искомый комикс ",Comics.search_fio_author(MyShop,searh_author));
                                break;
                            case(3):
                                System.out.println("Введите название комикса");
                                String searh_nameComicss=it.nextLine();
                                Comics.search_nameComic(MyShop,searh_nameComicss);
                                System.out.printf("Искомый комикс ",Comics.search_nameComic(MyShop,searh_nameComicss));
                                break;
                            default:
                                System.out.println("Изменений нет");
                                break;

                        }
                        break;
                    case (8):
                        Collections.sort( MyShop,Collections.reverseOrder());
                        System.out.printf("Список новинок:");
                        for (int i = 0; i < (MyShop.size()-1); i++) {
                            System.out.println(MyShop.get(i));
                        }
                        break;
                    case(9):
                       Collections.sort(ShopSales);
                        System.out.printf("список самых продаваемых комиксов:");
                        for (int i = 0; i < (ShopSales.size()-1); i++) {
                            System.out.println(ShopSales.get(i));
                        }
                        break;
                    default:
                        System.out.println("Goodbye");
                        break;
                }
            }

                }
        if (n==2){
            System.out.println("Введите логин ");
            String name_new = str.nextLine();
            System.out.println("Введите  пароль");
            int cod_new = com.nextInt();
            System.out.println("Пополните баланс для покупок");
            int new_balance=it.nextInt();
            User.Add_User(MyUsers,new User(name_new, cod_new, new_balance, MyComics));
            System.out.println("Вы внесены в базу,можете зайти");}
            else System.out.println("Goodbye");




            FileOutputStream outputStream = new FileOutputStream("ComicsShop.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(MyShop);
        objectOutputStream.close();
        FileOutputStream outputSale = new FileOutputStream("Sale.txt");
        ObjectOutputStream objectOutputSale = new ObjectOutputStream(outputSale);
        objectOutputSale.writeObject(ShopSales);
        objectOutputSale.close();
        FileOutputStream UsStream = new FileOutputStream("Users.txt");
        ObjectOutputStream UsOut = new ObjectOutputStream(UsStream);
        UsOut.writeObject(MyUsers);
        UsOut.close();



        }
    }
