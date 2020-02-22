package com.cdc.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdc.model.CdcModel;

@Service
public class CdcService {

	
	@Autowired
	private CdcServiceRep csr;



public CdcModel addCdcModel(CdcModel cm)
{
	System.out.println("INSIDE THE EMPLOYEEREGMOdel in SERVICE CLASS");
	cm=csr.save(cm);
	return cm;
	
	
}


public ArrayList<CdcModel> getAllNotices()
{
	ArrayList<CdcModel> cm = new ArrayList<CdcModel>();
	csr.findAll().forEach(cm :: add);
	return cm;

}


}
