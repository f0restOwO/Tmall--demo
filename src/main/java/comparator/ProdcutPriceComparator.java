package comparator;

import com.yang.domain.Product;

import java.util.Comparator;

public class ProdcutPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPromotePrice() - o2.getPromotePrice());
    }
}
