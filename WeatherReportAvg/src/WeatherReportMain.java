import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mr. M
 *
 */
public class WeatherReportMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanConsole = new Scanner(System.in);

		System.out.println("Enter the input file name:");
		String inputFile = scanConsole.next();

		File file = new File(inputFile);
		Scanner scanFile = null;
		try {
			scanFile = new Scanner(file);
		} catch (FileNotFoundException exception) {
			System.out.print("ERROR: File not found for \"");
		}
		String cityName;
		double averageTemp;
		double averagePrecip;
		boolean firstLine = true;
		int count = 0;

		Weather [] weatherList = new Weather[10];

		if (scanFile != null) {
			// keeps looping if file has more lines..
			while (scanFile.hasNextLine()) {
				// get a line of text..
				String line = scanFile.nextLine();
				// display a line of text to screen..
				System.out.println(line);

				//Split the text
				if (!firstLine) {
					String[] weatherInfo = line.split(",");
					cityName = weatherInfo[0];
					averageTemp = Double.parseDouble(weatherInfo[1]);
					averagePrecip = Double.parseDouble(weatherInfo[2]);
					weatherList[count++] = new Weather(cityName, averageTemp, averagePrecip);
				}
				else {
					firstLine = false;
				}
			}
		}
		scanConsole.close();
		scanFile.close();
		
		double avgTemp = 0;
		double avgRain = 0;
		int numCities = 0;
		

		//Find the city with the average temperature and rainfall
		for (int i = 0; i < weatherList.length; i++) {
			if (weatherList[i] != null) {
				
				avgTemp += weatherList[i].getAverageTemp();			
				avgRain += weatherList[i].getAveragePrecip();
				numCities++;
				
			}
		}
		
		System.out.println("The average temp is " + avgTemp/numCities);
		
		//Find the city with the  average precipitation		
		System.out.println("The average precipitation is " + avgRain/numCities);
		
		//C:\Users\kmangipudi\Desktop\Data\weather.txt

	} //end main
}
