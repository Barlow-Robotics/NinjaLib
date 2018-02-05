package LimeLight;

import org.frc.team4572.LimeLight.LimeLight;

public class limeLightExample {
	
	LimeLight limelight;
	public limeLightExample() {
		limelight = new LimeLight();
	}
	
	public void getLimelightData() {
		boolean hastarget = limelight.hasTarget;
		
		if(hastarget) {
			System.out.println("X-Offset: " + limelight.xOffset);
			System.out.println("Y-Offset: " + limelight.yOffset);
			System.out.println("Pipeline: " + limelight.pipeline);
		}
	}
}
