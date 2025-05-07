package ch19_generic.products;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProductController<T> {
    private T productInfo;
    private String productName;

    @Override
    public String toString() {
        return "Product(" +
                "productName=" + productName +
                ", productInfo=" + productInfo + ")";
    }
}