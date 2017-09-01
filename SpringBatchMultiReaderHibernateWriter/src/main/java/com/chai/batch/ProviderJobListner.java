package com.chai.batch;

import org.joda.time.DateTime;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class ProviderJobListner  implements JobExecutionListener{
	
	
	private DateTime startTime, stopTime;

	
			
	public void beforeJob(JobExecution jE) {
		startTime = new DateTime();
		System.out.println("provider record  conversion starts at :"+startTime);
		}
	
	
	
	public void afterJob(JobExecution jE) {
		stopTime = new DateTime();
		System.out.println("provider record Job stops at :"+stopTime);
		System.out.println("Total time taken in millis :"+getTimeInMillis(startTime , stopTime));
		
		if(jE.getStatus() == BatchStatus.COMPLETED){
			System.out.println("provider record converted successfully");
			
		
		}else if(jE.getStatus() == BatchStatus.FAILED){
			System.out.println("provider record failed to convert ");
		}
	}

		private long getTimeInMillis(DateTime start, DateTime stop){
			return stop.getMillis() - start.getMillis();
		}
		
}
