package ws.synopsis.trainingrest.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ws.synopsis.trainingrest.Request.CountryRequest;
import ws.synopsis.trainingrest.model.GetCountryResponse;
import ws.synopsis.trainingrest.repository.CountryRepository;
import ws.synopsis.trainingrest.service.TrainingService;

@RestController
public class TrainingApi {

    @Autowired
    private TrainingService service;

    @Autowired
    private TrainingService trainingService;

    @GetMapping("/findbyname")
     public ResponseEntity<?> findByName (CountryRequest request)  {

        GetCountryResponse countryResponse = trainingService.findByName(request);

        return ResponseEntity.ok(countryResponse);

    }


    @PutMapping("/editar")
    public ResponseEntity<?> editNameGet (@RequestBody CountryRequest request) {
        service.editCountry(request);
        GetCountryResponse countryResponse = service.editCountry(request);
        return ResponseEntity.ok(countryResponse);
    }

}
