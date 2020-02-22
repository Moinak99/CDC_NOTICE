package com.cdc.service;

import org.springframework.data.repository.CrudRepository;

import com.cdc.model.StudentApplyModel;

public interface StudentApplyServiceRep extends CrudRepository<StudentApplyModel, Long>{
	

}
