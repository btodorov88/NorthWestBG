package bg.btodorov.controller;

import bg.btodorov.model.Place;
import bg.btodorov.repo.PlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/api/addPlace")
    @ResponseBody
    public String addPlace(){
        repository.insert(new Place("Test1", "Details1", "123","456"));
        return "Success!";
    }


}
