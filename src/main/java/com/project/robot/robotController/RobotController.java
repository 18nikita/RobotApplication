package com.project.robot.robotController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.robot.robotService.RobotService;

@RestController
@RequestMapping("/")
public class RobotController {
	
	private RobotService robotService;
	
	
	@PostMapping("/calculateBattery")
    public String calculateBattery(@RequestParam("distance") double distance, @RequestParam("weight") double weight) {
		robotService.walkWithWeight(distance, weight);
        int batteryPercentage = robotService.getBatteryPercentage();
        return "Robot Battery Balance: " + batteryPercentage + "%";
    }

}
