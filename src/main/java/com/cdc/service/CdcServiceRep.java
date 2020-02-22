package com.cdc.service;

import org.springframework.data.repository.CrudRepository;

import com.cdc.model.CdcModel;

public interface CdcServiceRep extends CrudRepository<CdcModel, Integer> {

}
