package LIDAR;

import org.frc.team4572.LIDAR.Lidar;

public class lidarExample {

	private static final int LIDAR_PORT = 0;
	private static final int CALABRATION_OFFSET = 0;
	
	Lidar lidar;
	public lidarExample() {
		lidar = new Lidar(LIDAR_PORT);
		lidar.setCalibrationOffset(CALABRATION_OFFSET);
		lidar.enablePrintWarnings(false);
	}
	
	public void lidarGetDistance() {
		lidar.getDistanceCm(true); //Get the distance that the LIDAR reads in Cm as a rounded value
		//lidar.getDistanceIn(true); use this to get the distance as inches
	}
}
