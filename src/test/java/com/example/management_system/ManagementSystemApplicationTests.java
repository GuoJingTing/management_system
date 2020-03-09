package com.example.management_system;

import com.example.management_system.bean.Employee;
import com.example.management_system.mapper.EmployeeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManagementSystemApplicationTests {

	@Autowired
	EmployeeMapper employeeMapper;

	@Test
	void contextLoads() {
		Employee employee = employeeMapper.getEmpById(1);
		System.out.println(employee);
	}

}
