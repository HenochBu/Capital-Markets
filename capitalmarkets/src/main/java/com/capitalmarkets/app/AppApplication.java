package com.capitalmarkets.app;

import com.capitalmarkets.app.data.entities.CurrencyModel;
import com.capitalmarkets.app.data.providers.ICurrencyProvider;
import com.capitalmarkets.app.implementation.adapters.ICurrencyAdapter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;

@Slf4j
@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(ICurrencyProvider cuprovide, ICurrencyAdapter adapter){
		return args -> {


			HashMap<String,String> pepe = new HashMap<>();
			pepe.put("USD","Dollar");
			pepe.put("EUR","Euro");

			System.out.println(pepe.entrySet());

			CurrencyModel prueba = new CurrencyModel(0,"EUR",pepe.get("EUR"));

			adapter.getByName("Euro");


		};
	}
}
