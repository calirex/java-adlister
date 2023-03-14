package dao;

import models.Product;

import java.util.List;

public interface Products {
    public List<Product> all() {
        return products;
    }
    void insert(Product product);
}
