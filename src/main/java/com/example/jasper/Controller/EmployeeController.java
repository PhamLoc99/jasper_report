package com.example.jasper.Controller;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jasper.Enity.Employee;
import com.example.jasper.Repository.EmployeeRepository;
import com.example.jasper.Service.EmployeeService;

import net.sf.jasperreports.engine.JRException;

@RestController
@RequestMapping(value = "/api")
public class EmployeeController {
 
   @Autowired
   private EmployeeRepository empRepository;
   
   @Autowired
   private EmployeeService empService;
   
   @GetMapping("/getEmployees")
   public List<Employee> getEmployees() {

       return empRepository.findAll();
   }
   
   @GetMapping("/report/{format}")
   public void generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
       empService.exportReport(format);
   }
}
