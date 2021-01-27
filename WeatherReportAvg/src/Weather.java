/**
 * 
 */

/**
 * @author itadmin
 *
 */
public class Weather {
	private String cityName;
	private double averageTemp;
	private double averagePrecip;
	
	
	/**
	 * 
	 */
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	/**
	 * @param cityName
	 * @param averageTemp
	 * @param averagePrecip
	 */
	public Weather(String cityName, double averageTemp, double averagePrecip) {
		super();
		this.cityName = cityName;
		this.averageTemp = averageTemp;
		this.averagePrecip = averagePrecip;
	}







	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * @return the averageTemp
	 */
	public double getAverageTemp() {
		return averageTemp;
	}
	/**
	 * @param averageTemp the averageTemp to set
	 */
	public void setAverageTemp(double averageTemp) {
		this.averageTemp = averageTemp;
	}
	/**
	 * @return the averagePrecip
	 */
	public double getAveragePrecip() {
		return averagePrecip;
	}
	/**
	 * @param averagePrecip the averagePrecip to set
	 */
	public void setAveragePrecip(double averagePrecip) {
		this.averagePrecip = averagePrecip;
	}

	
	

}
