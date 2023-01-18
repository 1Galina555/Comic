import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ForSale implements Serializable {
    private List<Sale> Sales;
    private static final long serialVersionUID = 1L;
    public ForSale() {

        Sales = new ArrayList<Sale>();


    }
    static void Add_Sale(Sale newsale,List<Sale> Sales){
        Sales.add(newsale);

    }
}
