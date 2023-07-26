package com.project.robot.robotEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Robot")
public class RobotEntity {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	@Column(name="BatteryCapacity")
	    private double batteryCapacity;
	 	@Column(name="CurrentBatteryLevel")
	    private double currentBatteryLevel;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public double getBatteryCapacity() {
			return batteryCapacity;
		}
		public void setBatteryCapacity(double batteryCapacity) {
			this.batteryCapacity = batteryCapacity;
		}
		public double getCurrentBatteryLevel() {
			return currentBatteryLevel;
		}
		public void setCurrentBatteryLevel(double currentBatteryLevel) {
			this.currentBatteryLevel = currentBatteryLevel;
		}
		@Override
		public String toString() {
			return "RobotEntity [id=" + id + ", batteryCapacity=" + batteryCapacity + ", currentBatteryLevel="
					+ currentBatteryLevel + "]";
		}

}
