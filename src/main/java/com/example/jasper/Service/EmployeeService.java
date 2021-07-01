package com.example.jasper.Service;

import java.io.FileNotFoundException;

import net.sf.jasperreports.engine.JRException;

public interface EmployeeService {
	void exportReport(String reportFormat) throws FileNotFoundException, JRException;
}
