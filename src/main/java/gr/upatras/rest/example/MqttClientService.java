package gr.upatras.rest.example;


import org.eclipse.paho.client.mqttv3.MqttException;
import org.springframework.stereotype.Service;






@Service
public class MqttClientService {
	
	
	public static void sendMessage(String category, String message) throws MqttException {
		mqttClient smc = new mqttClient();
		smc.runClient(category, message);
		return;
	
	
	
	}	
	}
	


