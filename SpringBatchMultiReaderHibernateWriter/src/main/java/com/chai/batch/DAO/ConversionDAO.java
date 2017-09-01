package com.chai.batch.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;

import com.chai.batch.domain.Claims;
import com.chai.batch.domain.Insurance;
import com.chai.batch.model.Provider;
import com.util.HibernateUtil;

public class ConversionDAO implements Tasklet {

  Claims claims = new Claims();

	
	public RepeatStatus execute(StepContribution contribution, ChunkContext chunkContext) throws Exception {

		List<Insurance> ins = fetchRecords();
		List<Provider> pro = fetchProviders();
		
	

		for (Insurance i : ins) {
			String a = i.getMembershipType();
			String b = i.getMetallicType();
			int d = i.getCopay();
			int out = i.getOutOfPocket();
			int f;
			int r;

			int ds;

			int c;

			for (Provider p : pro) {
				int cla = p.getClaim();
				String dv = p.getDoctorVisit();
				int j = p.getDeductible();

			
				claims.setProviderName(p.getProviderName());
				
				System.out.println("Name:                                  "+claims.getProviderName());
				
				claims.setDateOfService(p.getDateOfVisit());
				claims.setProcessedDate(p.getProcessedDate());
				claims.setBilledAmount(p.getTotalAmount());
				claims.setPid(p.getPid());

				if (a.equals(p.getMembershiptType()) && b.equals(p.getMettallicType())) {
					r = i.getDeductible();
					ds = r - j;
					r = ds;

					if (r == 0) {
						j = 0;
						c = (int) (p.getTotalAmount() - (j));
					} else {
						c = (int) (p.getTotalAmount() - (j));
					}

					float ab = (float) ((c) * (i.getCoInsurance() * 0.01));
					System.out.println(ab);

					int ca = (int) (ab + (j));

					System.out.println("dynamic deductible   :" + r);

					if (p.getDoctorVisit().equals("yes")) {

						f = ca + d;

						if (f > out) {
							int diff = f - out;
							System.out.println("Amount to be paid by Customer actually                     :" + f);
							System.out.println("Final Amount to be paid by Customer                        :" + out);
							claims.setPatientResponsibility(out);
							addRecord(claims);
							System.out.println("diff b/w OutOfPocket and Total Amount(insurance covered)   :" + diff);
							System.out.println();
						} else {
							System.out.println("Final Amount to be paid by Customer                        :" + f);
							claims.setPatientResponsibility(f);
							addRecord(claims);
							System.out.println();
							System.out.println();
						}
					} else {

						f = ca;

						if (f > out) {
							int diff = f - out;
							System.out.println("Amount to be paid by Customer actually                     :" + f);
							System.out.println("Final Amount to be paid by Customer                        :" + out);
							claims.setPatientResponsibility(out);
							addRecord(claims);
							System.out.println("diff b/w OutOfPocket and Total Amount(insurance covered)   :" + diff);
							System.out.println();
							System.out.println();
						} else {
							System.out.println("Final Amount to be paid by Customer                        :" + f);
							claims.setPatientResponsibility(f);
							addRecord(claims);
							System.out.println();
							System.out.println();
						}

					}

				}

				
				 
				//addRecord(claims);

			}
			
			//List<Claims> claim = new ArrayList<Claims>();
			

			
			
		}
		
		return RepeatStatus.FINISHED;
	}

	
	
					
	private boolean addRecord(Claims claims) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
		session.save(claims);
		
		transaction.commit();

		return true;
		
		

	}

	public static List<Insurance> fetchRecords() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("select i from Insurance i");

		List<Insurance> ins = query.list();
		return ins;
	}

	public static List<Provider> fetchProviders() {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Query query = session.createQuery("from Provider ");

		List<Provider> pro = query.list();
		return pro;

	}

}
