package com.org.farmcollector;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.farmcollector.dao.CropRepository;
import com.org.farmcollector.dto.HarvestDto;
import com.org.farmcollector.dto.PlantingDto;
import com.org.farmcollector.entity.Crop;
import com.org.farmcollector.enums.CropType;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
class FarmCollectorApplicationTests {

	@Autowired
	CropRepository cropRepository;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	public void addPlantationTests() throws Exception {

		List<Crop> crops = cropRepository.findAll();


		PlantingDto request = new PlantingDto("myFarn","Summer24" ,CropType.CRON, 10,100);

		// when - action
		ResultActions response = mockMvc.perform(MockMvcRequestBuilders.post("/api/planted")
				.content(asJsonString(request))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));

		// then - verify the output
		response.andExpect(MockMvcResultMatchers.status().isOk());
	}

	@Test
	public void addHarvestTests() throws Exception {

		Crop crop = new Crop();
		crop.setFarmName("myFarm");
		crop.setSeason("Summer23");
		crop.setCropType(CropType.CRON);
		crop.setExpectedYield(100);
		crop.setPlantedArea(10);

		cropRepository.save(crop);

		HarvestDto request = new HarvestDto("myFarn","Summer24" , CropType.CRON, 120);

		// when - action
		ResultActions response = mockMvc.perform(MockMvcRequestBuilders.post("/api/harvest")
				.content(asJsonString(request))
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON));

		// then - verify the output
		response.andExpect(MockMvcResultMatchers.status().isOk());
		response.andExpect(MockMvcResultMatchers.jsonPath("$", CoreMatchers.is(crop.getCropType().name())));
	}

	public static String asJsonString(final Object obj) {
		try {
			final ObjectMapper mapper = new ObjectMapper();
			final String jsonContent = mapper.writeValueAsString(obj);
			return jsonContent;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
