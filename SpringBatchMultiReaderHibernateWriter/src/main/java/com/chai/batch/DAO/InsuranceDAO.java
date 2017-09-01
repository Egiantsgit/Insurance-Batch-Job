package com.chai.batch.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import com.chai.batch.domain.Insurance;
import com.chai.batch.model.Retrieve;
import com.util.HibernateUtil;

public class InsuranceDAO implements Tasklet{

	@Autowired
	private Retrieve rt;
	
		
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {
		
		 List<Insurance> ins=fetchRecords();
		 for(Insurance i : ins){
				
				System.out.println("Id                :"+ i.getId());
				System.out.println("MembershipType    :"+ i.getMembershipType());
				System.out.println("MetallicType      :"+ i.getMetallicType());
				System.out.println("Premium           :"+ i.getPremium());
				System.out.println("Deductible        :"+ i.getDeductible());
				System.out.println("CoInsurance       :"+ i.getCoInsurance());
				System.out.println("Copay             :"+ i.getCopay());
				System.out.println("OutOfPocket       :"+ i.getOutOfPocket());
				System.out.println();
				System.out.println();
				
				
		 }
		return RepeatStatus.FINISHED;
	}



public static List<Insurance> fetchRecords(){
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	Session session = sessionFactory.openSession();

	Query query = session.createQuery("select i from Insurance i");

	List<Insurance> ins = query.list();

//	for(Insurance i : ins){
//		
//		System.out.println(i.getId());
//		System.out.println(i.getMembershipType());
//		System.out.println(i.getCoInsurance());
//		System.out.println(i.getCoInsurance());
//		System.out.println(i.getCoInsurance());
//		System.out.println(i.getCoInsurance());
//		System.out.println(i.getCoInsurance());
//	}
	
	return ins;
}
}




	


