package com.chai.batch.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

import com.chai.batch.domain.Insurance;

import com.chai.batch.model.Provider;
import com.util.HibernateUtil;

public class ProviderDAO implements Tasklet{

	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		 List<Provider> pro=fetchProviders();
		 for(Provider p : pro){
				
				System.out.println("Id                :"+ p.getId());
				System.out.println("FirstName         :"+ p.getFirstName());
				System.out.println("LastName          :"+ p.getLastName());
				System.out.println("membershipType    :"+ p.getMembershiptType());
				System.out.println("hospitalVisits    :"+ p.getHospitalVisits());
				System.out.println("totalAmount       :"+ p.getTotalAmount());
				System.out.println("metallicType      :"+ p.getMettallicType());
				System.out.println("doctorVisit       :"+ p.getDoctorVisit());
				System.out.println("operation         :"+ p.getOperation());
				System.out.println("claim             :"+ p.getClaim());
				System.out.println();
				System.out.println();
				}
		
		
		
		
		return RepeatStatus.FINISHED;
	}
	
	
	
	
	public static List<Provider> fetchProviders(){
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Provider ");

		List<Provider> pro = query.list();
		return pro;
		
	}

}
