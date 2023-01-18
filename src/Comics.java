import java.util.Date;
import java.util.List;

public class Comics extends Shop implements Comparable<Comics>
{
   private String name_comic;//название комикса
     private String name_fio_author;//данные автора
     private String publishing_houses;//название издания
    private int pages;//кол-во страниц комикса
    private String genre;//жанр
     private int year;//год публикации
    private int price;//себестоимость
    private int sale;//цена
     private boolean continuation;/// является ли комикс продолжением другого или имеет части
    private  int getSale;//кол-во продаж этого комикса
    private int num;//кол-во комиксов в наличии
    private Date dateSale;
    public Comics(String name_comic, String name_fio_author, String publishing_houses, int pages, String genre, int year, int price, int sale, boolean continuation, int getSale,int num,Date dateSale){
        this.name_comic=name_comic;
        this.name_fio_author=name_fio_author;
        this.publishing_houses=publishing_houses;
        this.pages=pages;
        this.genre=genre;
        this.year=year;
        this.price=price;
        this.sale=sale;
        this.continuation=continuation;
        this.getSale=getSale;
        this.num=num;
        this.dateSale=dateSale;
    }

    public String getName_comic() {
        return name_comic;
    }

    public void setName_comic(String name_comic) {
        this.name_comic = name_comic;
    }

    public String getName_fio_author() {
        return name_fio_author;
    }

    public void setName_fio_author(String name_fio_author) {
        this.name_fio_author = name_fio_author;
    }

    public String getPublishing_houses() {
        return publishing_houses;
    }

    public void setPublishing_houses(String publishing_houses) {
        this.publishing_houses = publishing_houses;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public boolean isContinuation() {
        return continuation;
    }

    public void setContinuation(boolean continuation) {
        this.continuation = continuation;
    }

    public int getGetSale() {
        return getSale;
    }

    public void setGetSale(int getSale) {
        this.getSale = getSale;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getDateSale() {
        return dateSale;
    }

    public void setDateSale(Date dateSale) {
        this.dateSale = dateSale;
    }

    @Override
    public int compareTo(Comics o) {
        return this.getYear() - o.getYear();
    }
    @Override
    public String toString() {
        return "Comic{" + "name=" + name_comic + ", fio_author:" + name_fio_author + ", Publishing_houses:" + publishing_houses + ", pages="
                + pages + ", genre:" + genre +",year-" +year+" ,price:"+price+" ,sale="+sale+" ,continuation-"+continuation+" ,getSale="+getSale+" ,num:"+num+" ,dateSale"+dateSale+'}';
    }

}
