package com.kitrierp.doc.model.service;

import java.util.List;

import com.kitrierp.doc.model.DocumentDto;

public interface DocService {

	String doc_id(int doc_type_id);
	
	List<DocumentDto> dep_docBoxList();

	int signAppr(int emp_id, String doc_id);
	
	int signRe(int emp_id, String doc_id);
	
}
