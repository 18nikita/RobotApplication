package com.project.robot.robotService;

import org.springframework.beans.factory.annotation.Autowired;

import com.project.robot.robotEntity.RobotEntity;

public class RobotService {
	
	@Autowired
	private RobotEntity robotEntity;

	public int getBatteryPercentage() {
		  return (int) ((robotEntity.getCurrentBatteryLevel() / robotEntity.getBatteryCapacity()) * 100);
	}

	 public void walkWithWeight(double distance, double weight) {
	        double requiredBattery = distance + (weight * 0.03);
	        double currentBatteryLevel = 0;
			if (requiredBattery <= robotEntity.getCurrentBatteryLevel()) {
	            currentBatteryLevel -= requiredBattery;
	        } else {
	            currentBatteryLevel = 0;
	        }
	    }

}
