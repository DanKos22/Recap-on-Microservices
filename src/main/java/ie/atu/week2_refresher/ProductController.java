package ie.atu.week2_refresher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    /*
    private List<Product> productList = new ArrayList<Product>();

    @GetMapping("/products")
    public List<Product>getAllProducts(){
        return productList;

    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        productList.add(product);
        return product;
    }
    */

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

}
