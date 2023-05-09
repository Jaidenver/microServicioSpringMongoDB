package wannacode.productmicroservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import wannacode.productmicroservice.entity.ProductEntity;

public interface ProductRepository extends MongoRepository <ProductEntity, String>{
}
