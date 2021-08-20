package ws.synopsis.trainingrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.synopsis.trainingrest.Request.CountryRequest;
import ws.synopsis.trainingrest.model.GetCountryResponse;
import ws.synopsis.trainingrest.repository.CountryRepository;
import ws.synopsis.trainingrest.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    private CountryRepository countryRepository;



    @Override
    public GetCountryResponse findByName(CountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));
        return response;
    }


    @Override
    public GetCountryResponse editCountry(CountryRequest request) {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.editCountry(request.getName(), request.getCapital()));
        return response;
    }

}
