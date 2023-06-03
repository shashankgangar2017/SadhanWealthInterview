package com.sadhanwealth.interview;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class WeatherModel {

	@SerializedName("current")
	private Current current;

	@SerializedName("location")
	private Location location;

	@SerializedName("forecast")
	private Forecast forecast;

	public void setCurrent(Current current){
		this.current = current;
	}

	public Current getCurrent(){
		return current;
	}

	public void setLocation(Location location){
		this.location = location;
	}

	public Location getLocation(){
		return location;
	}

	public void setForecast(Forecast forecast){
		this.forecast = forecast;
	}

	public Forecast getForecast(){
		return forecast;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"current = '" + current + '\'' + 
			",location = '" + location + '\'' + 
			",forecast = '" + forecast + '\'' + 
			"}";
		}

	public class Current{

		@SerializedName("feelslike_c")
		private double feelslikeC;

		@SerializedName("uv")
		private double uv;

		@SerializedName("last_updated")
		private String lastUpdated;

		@SerializedName("feelslike_f")
		private double feelslikeF;

		@SerializedName("wind_degree")
		private int windDegree;

		@SerializedName("last_updated_epoch")
		private int lastUpdatedEpoch;

		@SerializedName("is_day")
		private int isDay;

		@SerializedName("precip_in")
		private double precipIn;

		@SerializedName("wind_dir")
		private String windDir;

		@SerializedName("gust_mph")
		private double gustMph;

		@SerializedName("temp_c")
		private double tempC;

		@SerializedName("pressure_in")
		private double pressureIn;

		@SerializedName("gust_kph")
		private double gustKph;

		@SerializedName("temp_f")
		private double tempF;

		@SerializedName("precip_mm")
		private double precipMm;

		@SerializedName("cloud")
		private int cloud;

		@SerializedName("wind_kph")
		private double windKph;

		@SerializedName("condition")
		private Condition condition;

		@SerializedName("wind_mph")
		private double windMph;

		@SerializedName("vis_km")
		private double visKm;

		@SerializedName("humidity")
		private int humidity;

		@SerializedName("pressure_mb")
		private double pressureMb;

		@SerializedName("vis_miles")
		private double visMiles;

		public void setFeelslikeC(double feelslikeC){
			this.feelslikeC = feelslikeC;
		}

		public double getFeelslikeC(){
			return feelslikeC;
		}

		public void setUv(double uv){
			this.uv = uv;
		}

		public double getUv(){
			return uv;
		}

		public void setLastUpdated(String lastUpdated){
			this.lastUpdated = lastUpdated;
		}

		public String getLastUpdated(){
			return lastUpdated;
		}

		public void setFeelslikeF(double feelslikeF){
			this.feelslikeF = feelslikeF;
		}

		public double getFeelslikeF(){
			return feelslikeF;
		}

		public void setWindDegree(int windDegree){
			this.windDegree = windDegree;
		}

		public int getWindDegree(){
			return windDegree;
		}

		public void setLastUpdatedEpoch(int lastUpdatedEpoch){
			this.lastUpdatedEpoch = lastUpdatedEpoch;
		}

		public int getLastUpdatedEpoch(){
			return lastUpdatedEpoch;
		}

		public void setIsDay(int isDay){
			this.isDay = isDay;
		}

		public int getIsDay(){
			return isDay;
		}

		public void setPrecipIn(double precipIn){
			this.precipIn = precipIn;
		}

		public double getPrecipIn(){
			return precipIn;
		}

		public void setWindDir(String windDir){
			this.windDir = windDir;
		}

		public String getWindDir(){
			return windDir;
		}

		public void setGustMph(double gustMph){
			this.gustMph = gustMph;
		}

		public double getGustMph(){
			return gustMph;
		}

		public void setTempC(double tempC){
			this.tempC = tempC;
		}

		public double getTempC(){
			return tempC;
		}

		public void setPressureIn(double pressureIn){
			this.pressureIn = pressureIn;
		}

		public double getPressureIn(){
			return pressureIn;
		}

		public void setGustKph(double gustKph){
			this.gustKph = gustKph;
		}

		public double getGustKph(){
			return gustKph;
		}

		public void setTempF(double tempF){
			this.tempF = tempF;
		}

		public double getTempF(){
			return tempF;
		}

		public void setPrecipMm(double precipMm){
			this.precipMm = precipMm;
		}

		public double getPrecipMm(){
			return precipMm;
		}

		public void setCloud(int cloud){
			this.cloud = cloud;
		}

		public int getCloud(){
			return cloud;
		}

		public void setWindKph(double windKph){
			this.windKph = windKph;
		}

		public double getWindKph(){
			return windKph;
		}

		public void setCondition(Condition condition){
			this.condition = condition;
		}

		public Condition getCondition(){
			return condition;
		}

		public void setWindMph(double windMph){
			this.windMph = windMph;
		}

		public double getWindMph(){
			return windMph;
		}

		public void setVisKm(double visKm){
			this.visKm = visKm;
		}

		public double getVisKm(){
			return visKm;
		}

		public void setHumidity(int humidity){
			this.humidity = humidity;
		}

		public int getHumidity(){
			return humidity;
		}

		public void setPressureMb(double pressureMb){
			this.pressureMb = pressureMb;
		}

		public double getPressureMb(){
			return pressureMb;
		}

		public void setVisMiles(double visMiles){
			this.visMiles = visMiles;
		}

		public double getVisMiles(){
			return visMiles;
		}

		@Override
		public String toString(){
			return
					"Current{" +
							"feelslike_c = '" + feelslikeC + '\'' +
							",uv = '" + uv + '\'' +
							",last_updated = '" + lastUpdated + '\'' +
							",feelslike_f = '" + feelslikeF + '\'' +
							",wind_degree = '" + windDegree + '\'' +
							",last_updated_epoch = '" + lastUpdatedEpoch + '\'' +
							",is_day = '" + isDay + '\'' +
							",precip_in = '" + precipIn + '\'' +
							",wind_dir = '" + windDir + '\'' +
							",gust_mph = '" + gustMph + '\'' +
							",temp_c = '" + tempC + '\'' +
							",pressure_in = '" + pressureIn + '\'' +
							",gust_kph = '" + gustKph + '\'' +
							",temp_f = '" + tempF + '\'' +
							",precip_mm = '" + precipMm + '\'' +
							",cloud = '" + cloud + '\'' +
							",wind_kph = '" + windKph + '\'' +
							",condition = '" + condition + '\'' +
							",wind_mph = '" + windMph + '\'' +
							",vis_km = '" + visKm + '\'' +
							",humidity = '" + humidity + '\'' +
							",pressure_mb = '" + pressureMb + '\'' +
							",vis_miles = '" + visMiles + '\'' +
							"}";
		}

		public class Condition{

			@SerializedName("code")
			private int code;

			@SerializedName("icon")
			private String icon;

			@SerializedName("text")
			private String text;

			public void setCode(int code){
				this.code = code;
			}

			public int getCode(){
				return code;
			}

			public void setIcon(String icon){
				this.icon = icon;
			}

			public String getIcon(){
				return icon;
			}

			public void setText(String text){
				this.text = text;
			}

			public String getText(){
				return text;
			}

			@Override
			public String toString(){
				return
						"Condition{" +
								"code = '" + code + '\'' +
								",icon = '" + icon + '\'' +
								",text = '" + text + '\'' +
								"}";
			}
		}
	}

	public class Location{

		@SerializedName("localtime")
		private String localtime;

		@SerializedName("country")
		private String country;

		@SerializedName("localtime_epoch")
		private int localtimeEpoch;

		@SerializedName("name")
		private String name;

		@SerializedName("lon")
		private double lon;

		@SerializedName("region")
		private String region;

		@SerializedName("lat")
		private double lat;

		@SerializedName("tz_id")
		private String tzId;

		public void setLocaltime(String localtime){
			this.localtime = localtime;
		}

		public String getLocaltime(){
			return localtime;
		}

		public void setCountry(String country){
			this.country = country;
		}

		public String getCountry(){
			return country;
		}

		public void setLocaltimeEpoch(int localtimeEpoch){
			this.localtimeEpoch = localtimeEpoch;
		}

		public int getLocaltimeEpoch(){
			return localtimeEpoch;
		}

		public void setName(String name){
			this.name = name;
		}

		public String getName(){
			return name;
		}

		public void setLon(double lon){
			this.lon = lon;
		}

		public double getLon(){
			return lon;
		}

		public void setRegion(String region){
			this.region = region;
		}

		public String getRegion(){
			return region;
		}

		public void setLat(double lat){
			this.lat = lat;
		}

		public double getLat(){
			return lat;
		}

		public void setTzId(String tzId){
			this.tzId = tzId;
		}

		public String getTzId(){
			return tzId;
		}

		@Override
		public String toString(){
			return
					"Location{" +
							"localtime = '" + localtime + '\'' +
							",country = '" + country + '\'' +
							",localtime_epoch = '" + localtimeEpoch + '\'' +
							",name = '" + name + '\'' +
							",lon = '" + lon + '\'' +
							",region = '" + region + '\'' +
							",lat = '" + lat + '\'' +
							",tz_id = '" + tzId + '\'' +
							"}";
		}
	}

	public class Forecast{

		@SerializedName("forecastday")
		private List<ForecastdayItem> forecastday;

		public void setForecastday(List<ForecastdayItem> forecastday){
			this.forecastday = forecastday;
		}

		public List<ForecastdayItem> getForecastday(){
			return forecastday;
		}

		@Override
		public String toString(){
			return
					"Forecast{" +
							"forecastday = '" + forecastday + '\'' +
							"}";
		}


		public class ForecastdayItem implements Serializable {

			@SerializedName("date")
			private String date;

			@SerializedName("astro")
			private Astro astro;

			@SerializedName("date_epoch")
			private int dateEpoch;

			@SerializedName("hour")
			private List<HourItem> hour;

			@SerializedName("day")
			private Day day;

			public void setDate(String date){
				this.date = date;
			}

			public String getDate(){
				return date;
			}

			public void setAstro(Astro astro){
				this.astro = astro;
			}

			public Astro getAstro(){
				return astro;
			}

			public void setDateEpoch(int dateEpoch){
				this.dateEpoch = dateEpoch;
			}

			public int getDateEpoch(){
				return dateEpoch;
			}

			public void setHour(List<HourItem> hour){
				this.hour = hour;
			}

			public List<HourItem> getHour(){
				return hour;
			}

			public void setDay(Day day){
				this.day = day;
			}

			public Day getDay(){
				return day;
			}

			@Override
			public String toString(){
				return
						"ForecastdayItem{" +
								"date = '" + date + '\'' +
								",astro = '" + astro + '\'' +
								",date_epoch = '" + dateEpoch + '\'' +
								",hour = '" + hour + '\'' +
								",day = '" + day + '\'' +
								"}";
			}



			public class Astro implements Serializable{

				@SerializedName("moonset")
				private String moonset;

				@SerializedName("moon_illumination")
				private String moonIllumination;

				@SerializedName("sunrise")
				private String sunrise;

				@SerializedName("moon_phase")
				private String moonPhase;

				@SerializedName("sunset")
				private String sunset;

				@SerializedName("is_moon_up")
				private int isMoonUp;

				@SerializedName("is_sun_up")
				private int isSunUp;

				@SerializedName("moonrise")
				private String moonrise;

				public void setMoonset(String moonset){
					this.moonset = moonset;
				}

				public String getMoonset(){
					return moonset;
				}

				public void setMoonIllumination(String moonIllumination){
					this.moonIllumination = moonIllumination;
				}

				public String getMoonIllumination(){
					return moonIllumination;
				}

				public void setSunrise(String sunrise){
					this.sunrise = sunrise;
				}

				public String getSunrise(){
					return sunrise;
				}

				public void setMoonPhase(String moonPhase){
					this.moonPhase = moonPhase;
				}

				public String getMoonPhase(){
					return moonPhase;
				}

				public void setSunset(String sunset){
					this.sunset = sunset;
				}

				public String getSunset(){
					return sunset;
				}

				public void setIsMoonUp(int isMoonUp){
					this.isMoonUp = isMoonUp;
				}

				public int getIsMoonUp(){
					return isMoonUp;
				}

				public void setIsSunUp(int isSunUp){
					this.isSunUp = isSunUp;
				}

				public int getIsSunUp(){
					return isSunUp;
				}

				public void setMoonrise(String moonrise){
					this.moonrise = moonrise;
				}

				public String getMoonrise(){
					return moonrise;
				}

				@Override
				public String toString(){
					return
							"Astro{" +
									"moonset = '" + moonset + '\'' +
									",moon_illumination = '" + moonIllumination + '\'' +
									",sunrise = '" + sunrise + '\'' +
									",moon_phase = '" + moonPhase + '\'' +
									",sunset = '" + sunset + '\'' +
									",is_moon_up = '" + isMoonUp + '\'' +
									",is_sun_up = '" + isSunUp + '\'' +
									",moonrise = '" + moonrise + '\'' +
									"}";
				}
			}


			public class HourItem implements Serializable{

				@SerializedName("feelslike_c")
				private double feelslikeC;

				@SerializedName("feelslike_f")
				private double feelslikeF;

				@SerializedName("wind_degree")
				private int windDegree;

				@SerializedName("windchill_f")
				private double windchillF;

				@SerializedName("windchill_c")
				private double windchillC;

				@SerializedName("temp_c")
				private double tempC;

				@SerializedName("temp_f")
				private double tempF;

				@SerializedName("cloud")
				private int cloud;

				@SerializedName("wind_kph")
				private double windKph;

				@SerializedName("wind_mph")
				private double windMph;

				@SerializedName("humidity")
				private int humidity;

				@SerializedName("dewpoint_f")
				private double dewpointF;

				@SerializedName("will_it_rain")
				private int willItRain;

				@SerializedName("uv")
				private double uv;

				@SerializedName("heatindex_f")
				private double heatindexF;

				@SerializedName("dewpoint_c")
				private double dewpointC;

				@SerializedName("is_day")
				private int isDay;

				@SerializedName("precip_in")
				private double precipIn;

				@SerializedName("heatindex_c")
				private double heatindexC;

				@SerializedName("wind_dir")
				private String windDir;

				@SerializedName("gust_mph")
				private double gustMph;

				@SerializedName("pressure_in")
				private double pressureIn;

				@SerializedName("chance_of_rain")
				private int chanceOfRain;

				@SerializedName("gust_kph")
				private double gustKph;

				@SerializedName("precip_mm")
				private double precipMm;

				@SerializedName("condition")
				private Condition condition;

				@SerializedName("will_it_snow")
				private int willItSnow;

				@SerializedName("vis_km")
				private double visKm;

				@SerializedName("time_epoch")
				private int timeEpoch;

				@SerializedName("time")
				private String time;

				@SerializedName("chance_of_snow")
				private int chanceOfSnow;

				@SerializedName("pressure_mb")
				private double pressureMb;

				@SerializedName("vis_miles")
				private double visMiles;

				public void setFeelslikeC(double feelslikeC){
					this.feelslikeC = feelslikeC;
				}

				public double getFeelslikeC(){
					return feelslikeC;
				}

				public void setFeelslikeF(double feelslikeF){
					this.feelslikeF = feelslikeF;
				}

				public double getFeelslikeF(){
					return feelslikeF;
				}

				public void setWindDegree(int windDegree){
					this.windDegree = windDegree;
				}

				public int getWindDegree(){
					return windDegree;
				}

				public void setWindchillF(double windchillF){
					this.windchillF = windchillF;
				}

				public double getWindchillF(){
					return windchillF;
				}

				public void setWindchillC(double windchillC){
					this.windchillC = windchillC;
				}

				public double getWindchillC(){
					return windchillC;
				}

				public void setTempC(double tempC){
					this.tempC = tempC;
				}

				public double getTempC(){
					return tempC;
				}

				public void setTempF(double tempF){
					this.tempF = tempF;
				}

				public double getTempF(){
					return tempF;
				}

				public void setCloud(int cloud){
					this.cloud = cloud;
				}

				public int getCloud(){
					return cloud;
				}

				public void setWindKph(double windKph){
					this.windKph = windKph;
				}

				public double getWindKph(){
					return windKph;
				}

				public void setWindMph(double windMph){
					this.windMph = windMph;
				}

				public double getWindMph(){
					return windMph;
				}

				public void setHumidity(int humidity){
					this.humidity = humidity;
				}

				public int getHumidity(){
					return humidity;
				}

				public void setDewpointF(double dewpointF){
					this.dewpointF = dewpointF;
				}

				public double getDewpointF(){
					return dewpointF;
				}

				public void setWillItRain(int willItRain){
					this.willItRain = willItRain;
				}

				public int getWillItRain(){
					return willItRain;
				}

				public void setUv(double uv){
					this.uv = uv;
				}

				public double getUv(){
					return uv;
				}

				public void setHeatindexF(double heatindexF){
					this.heatindexF = heatindexF;
				}

				public double getHeatindexF(){
					return heatindexF;
				}

				public void setDewpointC(double dewpointC){
					this.dewpointC = dewpointC;
				}

				public double getDewpointC(){
					return dewpointC;
				}

				public void setIsDay(int isDay){
					this.isDay = isDay;
				}

				public int getIsDay(){
					return isDay;
				}

				public void setPrecipIn(double precipIn){
					this.precipIn = precipIn;
				}

				public double getPrecipIn(){
					return precipIn;
				}

				public void setHeatindexC(double heatindexC){
					this.heatindexC = heatindexC;
				}

				public double getHeatindexC(){
					return heatindexC;
				}

				public void setWindDir(String windDir){
					this.windDir = windDir;
				}

				public String getWindDir(){
					return windDir;
				}

				public void setGustMph(double gustMph){
					this.gustMph = gustMph;
				}

				public double getGustMph(){
					return gustMph;
				}

				public void setPressureIn(double pressureIn){
					this.pressureIn = pressureIn;
				}

				public double getPressureIn(){
					return pressureIn;
				}

				public void setChanceOfRain(int chanceOfRain){
					this.chanceOfRain = chanceOfRain;
				}

				public int getChanceOfRain(){
					return chanceOfRain;
				}

				public void setGustKph(double gustKph){
					this.gustKph = gustKph;
				}

				public double getGustKph(){
					return gustKph;
				}

				public void setPrecipMm(double precipMm){
					this.precipMm = precipMm;
				}

				public double getPrecipMm(){
					return precipMm;
				}

				public void setCondition(Condition condition){
					this.condition = condition;
				}

				public Condition getCondition(){
					return condition;
				}

				public void setWillItSnow(int willItSnow){
					this.willItSnow = willItSnow;
				}

				public int getWillItSnow(){
					return willItSnow;
				}

				public void setVisKm(double visKm){
					this.visKm = visKm;
				}

				public double getVisKm(){
					return visKm;
				}

				public void setTimeEpoch(int timeEpoch){
					this.timeEpoch = timeEpoch;
				}

				public int getTimeEpoch(){
					return timeEpoch;
				}

				public void setTime(String time){
					this.time = time;
				}

				public String getTime(){
					return time;
				}

				public void setChanceOfSnow(int chanceOfSnow){
					this.chanceOfSnow = chanceOfSnow;
				}

				public int getChanceOfSnow(){
					return chanceOfSnow;
				}

				public void setPressureMb(double pressureMb){
					this.pressureMb = pressureMb;
				}

				public double getPressureMb(){
					return pressureMb;
				}

				public void setVisMiles(double visMiles){
					this.visMiles = visMiles;
				}

				public double getVisMiles(){
					return visMiles;
				}

				@Override
				public String toString(){
					return
							"HourItem{" +
									"feelslike_c = '" + feelslikeC + '\'' +
									",feelslike_f = '" + feelslikeF + '\'' +
									",wind_degree = '" + windDegree + '\'' +
									",windchill_f = '" + windchillF + '\'' +
									",windchill_c = '" + windchillC + '\'' +
									",temp_c = '" + tempC + '\'' +
									",temp_f = '" + tempF + '\'' +
									",cloud = '" + cloud + '\'' +
									",wind_kph = '" + windKph + '\'' +
									",wind_mph = '" + windMph + '\'' +
									",humidity = '" + humidity + '\'' +
									",dewpoint_f = '" + dewpointF + '\'' +
									",will_it_rain = '" + willItRain + '\'' +
									",uv = '" + uv + '\'' +
									",heatindex_f = '" + heatindexF + '\'' +
									",dewpoint_c = '" + dewpointC + '\'' +
									",is_day = '" + isDay + '\'' +
									",precip_in = '" + precipIn + '\'' +
									",heatindex_c = '" + heatindexC + '\'' +
									",wind_dir = '" + windDir + '\'' +
									",gust_mph = '" + gustMph + '\'' +
									",pressure_in = '" + pressureIn + '\'' +
									",chance_of_rain = '" + chanceOfRain + '\'' +
									",gust_kph = '" + gustKph + '\'' +
									",precip_mm = '" + precipMm + '\'' +
									",condition = '" + condition + '\'' +
									",will_it_snow = '" + willItSnow + '\'' +
									",vis_km = '" + visKm + '\'' +
									",time_epoch = '" + timeEpoch + '\'' +
									",time = '" + time + '\'' +
									",chance_of_snow = '" + chanceOfSnow + '\'' +
									",pressure_mb = '" + pressureMb + '\'' +
									",vis_miles = '" + visMiles + '\'' +
									"}";
				}

				public class Condition implements Serializable{

					@SerializedName("code")
					private int code;

					@SerializedName("icon")
					private String icon;

					@SerializedName("text")
					private String text;

					public void setCode(int code){
						this.code = code;
					}

					public int getCode(){
						return code;
					}

					public void setIcon(String icon){
						this.icon = icon;
					}

					public String getIcon(){
						return icon;
					}

					public void setText(String text){
						this.text = text;
					}

					public String getText(){
						return text;
					}

					@Override
					public String toString(){
						return
								"Condition{" +
										"code = '" + code + '\'' +
										",icon = '" + icon + '\'' +
										",text = '" + text + '\'' +
										"}";
					}
				}


			}


			public class Day implements Serializable{

				@SerializedName("avgvis_km")
				private double avgvisKm;

				@SerializedName("uv")
				private double uv;

				@SerializedName("avgtemp_f")
				private double avgtempF;

				@SerializedName("avgtemp_c")
				private double avgtempC;

				@SerializedName("daily_chance_of_snow")
				private int dailyChanceOfSnow;

				@SerializedName("maxtemp_c")
				private double maxtempC;

				@SerializedName("maxtemp_f")
				private double maxtempF;

				@SerializedName("mintemp_c")
				private double mintempC;

				@SerializedName("avgvis_miles")
				private double avgvisMiles;

				@SerializedName("daily_will_it_rain")
				private int dailyWillItRain;

				@SerializedName("mintemp_f")
				private double mintempF;

				@SerializedName("totalprecip_in")
				private double totalprecipIn;

				@SerializedName("totalsnow_cm")
				private double totalsnowCm;

				@SerializedName("avghumidity")
				private double avghumidity;

				@SerializedName("condition")
				private Condition condition;

				@SerializedName("maxwind_kph")
				private double maxwindKph;

				@SerializedName("maxwind_mph")
				private double maxwindMph;

				@SerializedName("daily_chance_of_rain")
				private int dailyChanceOfRain;

				@SerializedName("totalprecip_mm")
				private double totalprecipMm;

				@SerializedName("daily_will_it_snow")
				private int dailyWillItSnow;

				public void setAvgvisKm(double avgvisKm){
					this.avgvisKm = avgvisKm;
				}

				public double getAvgvisKm(){
					return avgvisKm;
				}

				public void setUv(double uv){
					this.uv = uv;
				}

				public double getUv(){
					return uv;
				}

				public void setAvgtempF(double avgtempF){
					this.avgtempF = avgtempF;
				}

				public double getAvgtempF(){
					return avgtempF;
				}

				public void setAvgtempC(double avgtempC){
					this.avgtempC = avgtempC;
				}

				public double getAvgtempC(){
					return avgtempC;
				}

				public void setDailyChanceOfSnow(int dailyChanceOfSnow){
					this.dailyChanceOfSnow = dailyChanceOfSnow;
				}

				public int getDailyChanceOfSnow(){
					return dailyChanceOfSnow;
				}

				public void setMaxtempC(double maxtempC){
					this.maxtempC = maxtempC;
				}

				public double getMaxtempC(){
					return maxtempC;
				}

				public void setMaxtempF(double maxtempF){
					this.maxtempF = maxtempF;
				}

				public double getMaxtempF(){
					return maxtempF;
				}

				public void setMintempC(double mintempC){
					this.mintempC = mintempC;
				}

				public double getMintempC(){
					return mintempC;
				}

				public void setAvgvisMiles(double avgvisMiles){
					this.avgvisMiles = avgvisMiles;
				}

				public double getAvgvisMiles(){
					return avgvisMiles;
				}

				public void setDailyWillItRain(int dailyWillItRain){
					this.dailyWillItRain = dailyWillItRain;
				}

				public int getDailyWillItRain(){
					return dailyWillItRain;
				}

				public void setMintempF(double mintempF){
					this.mintempF = mintempF;
				}

				public double getMintempF(){
					return mintempF;
				}

				public void setTotalprecipIn(double totalprecipIn){
					this.totalprecipIn = totalprecipIn;
				}

				public double getTotalprecipIn(){
					return totalprecipIn;
				}

				public void setTotalsnowCm(double totalsnowCm){
					this.totalsnowCm = totalsnowCm;
				}

				public double getTotalsnowCm(){
					return totalsnowCm;
				}

				public void setAvghumidity(double avghumidity){
					this.avghumidity = avghumidity;
				}

				public double getAvghumidity(){
					return avghumidity;
				}

				public void setCondition(Condition condition){
					this.condition = condition;
				}

				public Condition getCondition(){
					return condition;
				}

				public void setMaxwindKph(double maxwindKph){
					this.maxwindKph = maxwindKph;
				}

				public double getMaxwindKph(){
					return maxwindKph;
				}

				public void setMaxwindMph(double maxwindMph){
					this.maxwindMph = maxwindMph;
				}

				public double getMaxwindMph(){
					return maxwindMph;
				}

				public void setDailyChanceOfRain(int dailyChanceOfRain){
					this.dailyChanceOfRain = dailyChanceOfRain;
				}

				public int getDailyChanceOfRain(){
					return dailyChanceOfRain;
				}

				public void setTotalprecipMm(double totalprecipMm){
					this.totalprecipMm = totalprecipMm;
				}

				public double getTotalprecipMm(){
					return totalprecipMm;
				}

				public void setDailyWillItSnow(int dailyWillItSnow){
					this.dailyWillItSnow = dailyWillItSnow;
				}

				public int getDailyWillItSnow(){
					return dailyWillItSnow;
				}

				@Override
				public String toString(){
					return
							"Day{" +
									"avgvis_km = '" + avgvisKm + '\'' +
									",uv = '" + uv + '\'' +
									",avgtemp_f = '" + avgtempF + '\'' +
									",avgtemp_c = '" + avgtempC + '\'' +
									",daily_chance_of_snow = '" + dailyChanceOfSnow + '\'' +
									",maxtemp_c = '" + maxtempC + '\'' +
									",maxtemp_f = '" + maxtempF + '\'' +
									",mintemp_c = '" + mintempC + '\'' +
									",avgvis_miles = '" + avgvisMiles + '\'' +
									",daily_will_it_rain = '" + dailyWillItRain + '\'' +
									",mintemp_f = '" + mintempF + '\'' +
									",totalprecip_in = '" + totalprecipIn + '\'' +
									",totalsnow_cm = '" + totalsnowCm + '\'' +
									",avghumidity = '" + avghumidity + '\'' +
									",condition = '" + condition + '\'' +
									",maxwind_kph = '" + maxwindKph + '\'' +
									",maxwind_mph = '" + maxwindMph + '\'' +
									",daily_chance_of_rain = '" + dailyChanceOfRain + '\'' +
									",totalprecip_mm = '" + totalprecipMm + '\'' +
									",daily_will_it_snow = '" + dailyWillItSnow + '\'' +
									"}";
				}


				public class Condition implements Serializable{

					@SerializedName("code")
					private int code;

					@SerializedName("icon")
					private String icon;

					@SerializedName("text")
					private String text;

					public void setCode(int code){
						this.code = code;
					}

					public int getCode(){
						return code;
					}

					public void setIcon(String icon){
						this.icon = icon;
					}

					public String getIcon(){
						return icon;
					}

					public void setText(String text){
						this.text = text;
					}

					public String getText(){
						return text;
					}

					@Override
					public String toString(){
						return
								"Condition{" +
										"code = '" + code + '\'' +
										",icon = '" + icon + '\'' +
										",text = '" + text + '\'' +
										"}";
					}
				}
			}


		}


	}
}