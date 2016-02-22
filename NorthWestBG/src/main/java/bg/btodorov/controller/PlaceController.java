package bg.btodorov.controller;

import bg.btodorov.model.Place;
import bg.btodorov.repo.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by btodorov on 1/6/16.
 */
@Controller
public class PlaceController {
    @Autowired
    private PlaceRepository repository;

    @RequestMapping("/api/getAllPlaces")
    @ResponseBody
    public List<Place> getAllPlaces(){
        return repository.findAll();
    }

    @RequestMapping("/api/getPlaceById")
    @ResponseBody
    public Place getPlaceById(@RequestParam("id") String id){
        return repository.findOne(id);
    }

    @RequestMapping(value = "/api/addPlace", method = RequestMethod.POST)
    @ResponseBody
    public Place addPlace(@RequestBody Place place){
        return repository.save(place);
    }


}
