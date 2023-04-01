package com.example.Crud.model;

        import lombok.Data;

        import jakarta.persistence.*;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    private Boolean availability;

    @Column(name = "brand_name")
    private String brandName;
}
