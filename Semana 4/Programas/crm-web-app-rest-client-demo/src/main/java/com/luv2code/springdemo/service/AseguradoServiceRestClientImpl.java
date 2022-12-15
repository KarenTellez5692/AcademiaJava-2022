package com.luv2code.springdemo.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.luv2code.springdemo.model.Asegurado;

@Service
public class AseguradoServiceRestClientImpl implements AseguradoService {

	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public AseguradoServiceRestClientImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url}") String theUrl) {
		
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	@Override
	public List<Asegurado> getAsegurados() {
		
		logger.info("***OBTENER LISTA DE CLIENTES DESDE EL SERVICE REST CLIENTE");
		logger.info("in getAsegurados(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<Asegurado>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
													 new ParameterizedTypeReference<List<Asegurado>>() {});

		// get the list of asegurados from response
		List<Asegurado> asegurados = responseEntity.getBody();

		logger.info("in getCustomers(): customers" + asegurados);
		
		return asegurados;
	}

	@Override
	public Asegurado getAsegurado(int theId) {
		logger.info("***OBTENER UN CLIENTE DESDE EL SERVICE REST CLIENTE");

		logger.info("in getCustomer(): Calling REST API " + crmRestUrl);

		// make REST call
		Asegurado theCustomer = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
						Asegurado.class);

		logger.info("in saveCustomer(): theCustomer=" + theCustomer);
		
		return theCustomer;
	}

	@Override
	public void saveAsegurado(Asegurado theCustomer) {

		logger.info("in saveCustomer(): Calling REST API " + crmRestUrl);
		
		int AseguradoId = theCustomer.getId();

		// make REST call
		if (AseguradoId == 0) {
			// add Asegurado
			logger.info("***SALVAR UN CLIENTE DESDE EL SERVICE REST CLIENTE");

			restTemplate.postForEntity(crmRestUrl, theCustomer, String.class);			
		
		} else {
			// update Asegurado
			logger.info("***ACTUALIZAR UN CLIENTE DESDE EL SERVICE REST CLIENTE");

			restTemplate.put(crmRestUrl, theCustomer);
		}

		logger.info("in saveCustomer(): success");	
	}

	@Override
	public void deleteAsegurado(int theId) {
		logger.info("***BORRAR UN CLIENTE DESDE EL SERVICE REST CLIENTE");

		logger.info("in deleteCustomer(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("in deleteCustomer(): deleted customer theId=" + theId);
	}

}
