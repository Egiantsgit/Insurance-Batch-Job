package com.chai.batch;
import com.chai.batch.model.*;

import org.joda.time.LocalDate;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;





//Interface that is used to map data
public class providerFieldSetMapper implements FieldSetMapper<Provider>{
	
	

	public Provider mapFieldSet(FieldSet fieldSet) throws BindException {
		
        Provider rec = new Provider();
		
		 rec.setFirstName(fieldSet.readString(0));
		 rec.setLastName(fieldSet.readString(1));
		 rec.setMembershiptType(fieldSet.readString(2));
		 rec.setHospitalVisits(fieldSet.readString(3));
		 rec.setTotalAmount(fieldSet.readInt(4));
		 rec.setMettallicType(fieldSet.readString(5));
		 rec.setServiceCovered(fieldSet.readString(6));
		 rec.setDoctorVisit(fieldSet.readString(7));
		 rec.setOperation(fieldSet.readString(8));
		 rec.setClaim(fieldSet.readInt(9));
		 rec.setDeductible(fieldSet.readInt(10));
		 rec.setProviderName(fieldSet.readString(11));
		 rec.setDateOfVisit(new LocalDate(fieldSet.readDate(12,"MM/dd/yyyy")));
		 rec.setProcessedDate(new LocalDate(fieldSet.readDate(13,"MM/dd/yyyy")));
		 rec.setPid(fieldSet.readInt(14));
		return rec;
	}


}
