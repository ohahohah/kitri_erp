package com.kitrierp.doc.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kitrierp.doc.model.dao.DocDao;

@Service
public class DocServiceImpl implements DocService {
	@Autowired
	private DocDao docDao;

	@Override
	public String doc_id(int doc_type_id) {
		return docDao.doc_id(doc_type_id);
	}
	
}
