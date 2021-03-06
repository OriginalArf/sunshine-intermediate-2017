package cf.awidiyadew.sunshine_intermediate_class.model;

import com.google.gson.annotations.SerializedName;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class ListForecast {

	@SerializedName("dt")
	private Long dt;

	@SerializedName("rain")
	private double rain;

	@SerializedName("temp")
	private Temp temp;

	@SerializedName("deg")
	private int deg;

	@SerializedName("weather")
	private List<WeatherItem> weather;

	@SerializedName("humidity")
	private int humidity;

	@SerializedName("pressure")
	private double pressure;

	@SerializedName("clouds")
	private int clouds;

	@SerializedName("speed")
	private double speed;

	public void setDt(Long dt){
		this.dt = dt;
	}

	public Long getDt(){
		return dt;
	}

	public void setRain(double rain){
		this.rain = rain;
	}

	public double getRain(){
		return rain;
	}

	public void setTemp(Temp temp){
		this.temp = temp;
	}

	public Temp getTemp(){
		return temp;
	}

	public void setDeg(int deg){
		this.deg = deg;
	}

	public int getDeg(){
		return deg;
	}

	public void setWeather(List<WeatherItem> weather){
		this.weather = weather;
	}

	public List<WeatherItem> getWeather(){
		return weather;
	}

	public void setHumidity(int humidity){
		this.humidity = humidity;
	}

	public int getHumidity(){
		return humidity;
	}

	public void setPressure(double pressure){
		this.pressure = pressure;
	}

	public double getPressure(){
		return pressure;
	}

	public void setClouds(int clouds){
		this.clouds = clouds;
	}

	public int getClouds(){
		return clouds;
	}

	public void setSpeed(double speed){
		this.speed = speed;
	}

	public double getSpeed(){
		return speed;
	}

	@Override
 	public String toString(){
		return 
			"ListForecast{" +
			"dt = '" + dt + '\'' + 
			",rain = '" + rain + '\'' + 
			",temp = '" + temp + '\'' + 
			",deg = '" + deg + '\'' + 
			",weather = '" + weather + '\'' + 
			",humidity = '" + humidity + '\'' + 
			",pressure = '" + pressure + '\'' + 
			",clouds = '" + clouds + '\'' + 
			",speed = '" + speed + '\'' + 
			"}";
		}

	public String getReadableTime(int pos){
		if(pos == 1){
			return "Tomorrow";
		}else{
			Date date = new Date(dt * 1000L);
			DateFormat format = new SimpleDateFormat("EEEE");
			format.setTimeZone(TimeZone.getTimeZone("Etc/UTC"));
			return format.format(date);
		}
	}

	public String getTodayReadableTime(){
		Date date = new Date(dt * 1000L);
		DateFormat format = new SimpleDateFormat("MMM dd");
		return "Today, "+format.format(date);
	}

	public String getReadableHumidity() {
		return humidity + " %";
	}

	public String getReadablePressure() {
		return Math.round(pressure) + " hPa";
	}

	public String getReadableWindSpeed() {
		return Math.round(speed) + " m/sec";
	}
}