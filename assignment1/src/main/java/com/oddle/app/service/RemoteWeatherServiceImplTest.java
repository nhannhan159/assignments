package com.oddle.app.service;

import com.oddle.app.config.AppInitializer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by tanqu on 6/18/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppInitializer.class)
public class RemoteWeatherServiceImplTest {
	@Test
	public void fetchCityWeather() throws Exception {
	}

}