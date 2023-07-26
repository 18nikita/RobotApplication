package com.project.robot.robotRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.robot.robotEntity.RobotEntity;

public interface RobotRepository extends JpaRepository<RobotEntity, Long>{

}
