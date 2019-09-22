package com.project.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.project.bean.Employee;

public class EmployeeDao implements EmployeeDaoInterface
{
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) 
	{
		this.template = template;
	}
	
	public int save(Employee e)
	{
		String sql = "insert into employee(username, password) values ('"+e.getUserName()+"','"+e.getPassword()+"')";
		return template.update(sql);
	}

	@Override
	public List<Employee> empList() 
	{
		List<Employee> list = template.query("select * from employee", new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee emp = new Employee();

				emp.setUserName(rs.getString("username"));
				emp.setPassword(rs.getString("password"));
			
				return emp;
			}
		});
		return list;
}

	/*public List<Employee> employeeList() 
	{
		List<Employee> list = template.query("select * from employee", new RowMapper<Employee>()
				
				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			Employee emp = new Employee();

			emp.setUserName(rs.getString("username"));
			emp.setPassword(rs.getString("password"));
			return emp;
		}
				)};
		return null;
	}*/
	
	

	
}
