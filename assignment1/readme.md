# What did you implement:

	* Weathers lookup by city name.
	* Add / remove city.
	* Fetch newest weather info for each city in DB.
	* Store all history weather info in DB.

# How did you implement it:

	* Using Spring framework.
	* Using Hibernate with mySQL.
	* Using RestTemplate to consume OpenWeatherMap API.
	* Using Angular in client side.

# Asumptions:

	* Update UI base on asumption: 
	![alt text](https://github.com/nhannhan159/assignments/blob/master/assignment1/screenshot.PNG)

# Step to run:

	1. Create `weather` schema in mySQL.
	2. Set `hibernate.hbm2ddl.auto = create` in `\src\main\resources\application.properties`
	3. Build project.
	4. Create tomcat server to run project.
	5. Navigate to `http://localhost:8080/weather`

# Todos:

 - [ ] Write tests.
 - [ ] Add async handler.
 - [ ] Add more detailed comments.
 - [ ] Paging result.