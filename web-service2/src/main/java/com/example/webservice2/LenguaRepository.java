package com.example.webservice2;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Lengua;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class LenguaRepository {
    private static final Map<String, Lengua> lenguas = new HashMap<>();

	@PostConstruct
	public void initData() {
		Lengua nahuatl = new Lengua();
		nahuatl.setName("Nahuatl");
		nahuatl.setEstados("Veracruz zona Sur, Hidalgo zona este, campeche sureste, yucatan noreste");
		nahuatl.setCantidad(10);
		
		lenguas.put(nahuatl.getName(), nahuatl);

		Lengua zapoteco = new Lengua();
		zapoteco.setName("Zapoteco");
		zapoteco.setEstados("Estado de Oaxaca, Regiones Sierra Norte, Istmo de Tehuantepec");
		zapoteco.setCantidad(10);
		

		lenguas.put(zapoteco.getName(), zapoteco);

		Lengua mazateco = new Lengua();
		mazateco.setName("Mazateco");
		mazateco.setEstados("Norte de Oaxaca, estados de Puebla y Veracruz");
		mazateco.setCantidad(21355);
		

		lenguas.put(mazateco.getName(), mazateco);


		Lengua mixteco = new Lengua();
		mixteco.setName("Mixteco");
		mixteco.setEstados("Noroeste de Oaxaca, Sureste de Guerrero, y Sur de Puebla");
		mixteco.setCantidad(8936);
		

		lenguas.put(mixteco.getName(), mixteco);
	}

	public Lengua findLengua(String name) {
		Assert.notNull(name, "The country's name must not be null");
		return lenguas.get(name);
	}
}
