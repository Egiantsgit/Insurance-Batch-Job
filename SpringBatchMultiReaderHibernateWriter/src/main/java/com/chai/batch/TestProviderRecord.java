package com.chai.batch;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chai.batch.DAO.InsuranceDAO;
import com.chai.batch.IDAO.IInsuranceDAO;
import com.chai.batch.domain.Insurance;
import com.util.HibernateUtil;

public class TestProviderRecord {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-batch-context.xml");

		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("patientRecordJob");

		try {
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			System.out.println("Job Exit Status : " + execution.getStatus());

		} catch (JobExecutionException e) {
			System.out.println("Job providerRecords not converted");
			e.printStackTrace();
		}

		

}
}