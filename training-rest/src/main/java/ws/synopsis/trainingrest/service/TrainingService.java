package ws.synopsis.trainingrest.service;


import ws.synopsis.trainingrest.Request.CountryRequest;
import ws.synopsis.trainingrest.model.GetCountryResponse;

public interface TrainingService {

    public GetCountryResponse findByName(CountryRequest request);
    public GetCountryResponse editCountry(CountryRequest request);
}
