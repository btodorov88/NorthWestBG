package bg.btodorov.repo;

import bg.btodorov.model.Place;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * Created by btodorov on 1/6/16.
 */
public interface PlaceRepository extends MongoRepository<Place, String>{

}
