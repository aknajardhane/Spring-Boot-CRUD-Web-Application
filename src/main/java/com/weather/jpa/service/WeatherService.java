package com.weather.jpa.service;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.weather.jpa.domain.WeatherReport;
import com.weather.jpa.repository.WeatherRepository;

//Fill your code here
@Service
public class WeatherService {
//Fill your code here
    @Autowired
	WeatherRepository repo;

    public List<WeatherReport> getData() {
    	//Fill your code here
    return (List) repo.findAll();
	}
	
	public WeatherReport addCases(WeatherReport cases) {
		//Fill your code here
      return repo.save(cases);
	}

	public WeatherReport updateCases(WeatherReport cases) {
		//Fill your code here
return repo.save(cases);
	}
	
	public WeatherReport view(Long id) {
		//Fill your code here
   return repo.findById(id).orElse(new WeatherReport());
	}
	
	public Boolean deleteCases(Long id) {
        //Fill your code here
   repo.deleteById(id);
return true;
	}

}