package pe.com.nttdata.server.banking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BankingDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingDiscoveryServerApplication.class, args);
	}

}
