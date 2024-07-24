package br.com.cfarias.estrangulamentoMonolito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "br.com.cfarias.estrangulamentoMonolito.repositories")
@EnableFeignClients(basePackages = "br.com.cfarias.estrangulamentoMonolito.feign")
public class EstrangulamentoMonolitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstrangulamentoMonolitoApplication.class, args);
	}

}
