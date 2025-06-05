package tesco;

import jdk.jfr.Category;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRestrictionRuleEngine {

    /*
    Business Restriction rules:
      Cannot buy more than 10 Quantity of any products - BulkBuyLimit
      Cannot buy more than 5 Quantity of paracetamol products – BulkBuyLimitCategory
     */
    public static String checkProductRestriction(List<Product> products) {
          final int BULK_BUY_LIMIT_QTY = 10;
          final int BULK_BUY_LIMIT_CATEGORY_QTY = 5;
          final String RESTRICTED_PRODUCT = "Paracetamol";


          /*
          Category = "LiQuor";
           */

        Map<String,Integer>  categoryCount = new HashMap<>();

        for(Product product : products) {
            if(product.quantity > BULK_BUY_LIMIT_QTY) {
                return "BREACHED";
            }
            categoryCount.put(product.category,
                    categoryCount.getOrDefault(product.category,0)+product.quantity);
        }

        if(categoryCount.getOrDefault(RESTRICTED_PRODUCT,0) > BULK_BUY_LIMIT_CATEGORY_QTY) {
            return "BREACHED";
        }
        return "MET";
    }

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1,"Paracetamol",3),
                new Product(2, "analgesic",3),
                new Product(3,"chocolate",8),
                new Product(4,"Paracetamol",2)
        );
        String restrictionStatus = checkProductRestriction(products); //MET/BREACHED

        System.out.println("Restriction Status:"+ restrictionStatus);
    }
}
