package com.example.Crud.repository;

        import com.example.Crud.model.Product;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
