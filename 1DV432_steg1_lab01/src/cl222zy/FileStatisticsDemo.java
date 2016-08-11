package cl222zy;

public class FileStatisticsDemo {

	public static void main(String[] args) {
		FileStatistics fileStatistics = new FileStatistics("heltal.txt");
		fileStatistics.openFile();
		fileStatistics.analyzeIntegersInFileAndCloseStream();
		fileStatistics.writeReport();
	}

}