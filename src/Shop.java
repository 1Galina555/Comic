import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;

public class Shop implements Serializable{
  private static final long serialVersionUID = 1L;

  private List<Comics> Shop;



    enum Type_Date{
    BY_DAY,BY_WEEK,BY_MONTH,BY_YEAR
  };


  public Shop() {
    Shop = new ArrayList<Comics>();
  }


 static void Add_comic(List<Comics> Shop, Comics newComics){
    Shop.add(newComics);
 }
 static void Delete_Comic(List<Comics> Shop,String nameComic){
     int ie = Shop.indexOf(nameComic);
     Shop.remove(nameComic);
 }
 static void Set_Comic(List<Comics> Shop,String nameComic){
     Comics found = Shop.stream()//ищем нужный комикс для изменения и потом в мейне выбор изменения->изменение
             .filter(c -> c.getName_comic().equals(nameComic))
             .findAny()
             .orElseThrow();
 }
 static int Sale_Comic(List<Comics> Shop,String nameComic,int num){
     Comics found = Shop.stream()//ищем нужный комикс для изменения и потом в мейне выбор изменения->изменение
             .filter(c -> c.getName_comic().equals(nameComic))
             .findAny()
             .orElseThrow();
     if (found.getNum()>num) {
         found.setNum(found.getNum() - num);
         return found.getSale();
     }
      else
          return 0;
 }
 static void Write_Comic(List<Comics> Shop,String nameComic){
     Comics found = Shop.stream()//ищем нужный комикс для изменения и потом в мейне выбор изменения->изменение
             .filter(c -> c.getName_comic().equals(nameComic))
             .findAny()
             .orElseThrow();
     found.setNum(found.getNum()-1);
 }
 static void Black_friday(List<Comics> Shop,String nameComic){
     Comics found = Shop.stream()//ищем нужный комикс для изменения и потом в мейне выбор изменения->изменение
             .filter(c -> c.getName_comic().equals(nameComic))
             .findAny()
             .orElseThrow();
     found.setSale(found.getSale()-((found.getSale()/100)*13));
 }
    static void New_year(List<Comics> Shop,String nameComic){
        Comics found = Shop.stream()//ищем нужный комикс для изменения и потом в мейне выбор изменения->изменение
                .filter(c -> c.getName_comic().equals(nameComic))
                .findAny()
                .orElseThrow();
        found.setSale(found.getSale()-((found.getSale()/100)*20));
    }
static Comics search_genre(List<Comics> Shop,String genre){
      Comics search_genre=Shop.stream()
              .filter(c -> c.getGenre().equals(genre))
              .findAny()
              .orElseThrow();
      return search_genre;
}
    static Comics search_fio_author(List<Comics> Shop,String fio_author){
        Comics search_fio_author=Shop.stream()
                .filter(c -> c.getName_fio_author().equals(fio_author))
                .findAny()
                .orElseThrow();
        return search_fio_author;
    }
    static Comics search_nameComic(List<Comics> Shop,String nameComic){
        Comics search_nameComic=Shop.stream()
                .filter(c -> c.getName_comic().equals(nameComic))
                .findAny()
                .orElseThrow();
        return search_nameComic;
    }



}