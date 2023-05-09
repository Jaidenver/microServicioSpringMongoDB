package wannacode.productmicroservice.entity;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(value = "product")
public class ProductEntity {



    @Id
    private String id;
    private String productName;
    private String productDescription;
    private int unitPrice;



}
