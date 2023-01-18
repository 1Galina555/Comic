import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sale extends ForSale implements Comparable<Sale>{
    private Date date;
    private String name_comic;
    private int amount;

    public Sale(Date date, Comics comics, int amount) {
        this.date = date;
        this.name_comic = comics.getName_comic();
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName_comic() {
        return name_comic;
    }

    public void setName_comic(String name_comic) {
        this.name_comic = name_comic;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int compareTo(Sale o) {
        return this.getAmount() - o.getAmount();
    }
    @Override
    public String toString() {
        return "Sale{" + "name=" + name_comic + ", date:" + date + ", Amount Sale" + amount  +'}';
    }

enum Type_Date{
    BY_DAY,BY_WEEK,BY_MONTH,BY_YEAR
};
}
