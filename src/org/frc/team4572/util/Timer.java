package org.frc.team4572.util;

public class Timer{
	/*
	 * thetime that start() was called
	 */
	public double startTime;
	
	/**
	 * starts the timer
	 */
	public void start() {
		startTime = System.currentTimeMillis();
	}
	/**
	 * Gets elapsed time since start() called
	 * @return elasped time
	 */
	public double getElapsedTime() {
		return (System.currentTimeMillis() - startTime);
	}	
}