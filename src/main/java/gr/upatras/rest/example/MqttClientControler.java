package gr.upatras.rest.example;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MqttClientControler {

	@RequestMapping(value = "/{category}/{message}")
		public static String getMessage(@PathVariable("category") String category, @PathVariable("message") String message) throws MqttException {
	        MqttClientService.sendMessage(category,message);
	        
	        return "good" ;
	    }
	}

