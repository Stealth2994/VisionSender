package org.usfirst.frc.team2706.robot.vision;
//import TrackerBox2;

import java.util.ArrayList;

import org.usfirst.frc.team2706.robot.vision.TrackerBox2.TargetObject;

public class TestMain {

	public static void main(String[] args) {
		TrackerBox2 tb = new TrackerBox2(TrackerBox2.CAMERA_IP);
//		tb.changeProfile(3);
		while(true) {
			try {
				ArrayList<TargetObject> pr = tb.getVisionData();
				Thread.sleep(20);
			} catch(InterruptedException e){ }
		}
//		if (pr != null)
//			System.out.println(pr);
//		else
//			System.out.println("Communication Error");
			
//		tb.changeProfile(3);
	}
	

}
