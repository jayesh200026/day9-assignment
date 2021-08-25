package com.Logical;

import java.util.Scanner;

public class StopWatch {

private long startTime = 0;
private long stopTime = 0;
private boolean running = false;


public void start() {
    this.startTime = System.currentTimeMillis();
    this.running = true;
}


public void stop() {
    this.stopTime = System.currentTimeMillis();
    this.running = false;
}

/*public void reset() {
    this.startTime= this.startTime;
    this.running = false;
}*/


//elaspsed time in milliseconds
public long getElapsedTime() {
    long elapsed;
    if (running) {
         elapsed = (System.currentTimeMillis() - startTime);
    }
    else {
        elapsed = (stopTime - startTime);
    }
    return elapsed;
}


//elaspsed time in seconds
public long getElapsedTimeSecs() {
    long elapsed;
    if (running) {
        elapsed = ((System.currentTimeMillis() - startTime) / 1000);
    }
    else {
        elapsed = ((stopTime - startTime) / 1000);
    }
    return elapsed;
}




//sample usage
public static void stopWatch() {
	int choice;
	StopWatch s = new StopWatch();
	while(true) {
	Scanner r=new Scanner(System.in);
    
    System.out.println("1 to start\n2 to Stop\n3 Get Elapsed time");
    choice=r.nextInt();
    switch(choice) {
    case 1:s.start();
    		break;
    
    case 2:s.stop();
    		break;
    		
    case 3:	System.out.println("elapsed time in seconds: " + s.getElapsedTimeSecs());
    		break;
    default:return;
    }
	}
    

}
}
