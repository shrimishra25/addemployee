package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import com.employee.model.User;

public class AddEmployeeController {
	private final String INSERT_SQL = "INSERT INTO EVENT(empid, empname, careerlevel, duname, worklocation) values(:empid,:empname,:careerlevel,:duname, :worklocation)";

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public User create(final User user) {
		KeyHolder holder = new GeneratedKeyHolder();
			SqlParameterSource parameters = new MapSqlParameterSource()
					.addValue("empid", user.getEmpid())
					.addValue("empname", user.getEmpname())
					.addValue("careerlevel", user.getCareerlevel())
					.addValue("duname", user.getDuname())
					.addValue("worklocation", user.getWorklocation());
			namedParameterJdbcTemplate.update(INSERT_SQL, parameters, holder);
			//user.setEmpid(holder.getKey().intValue());
			return user;
		}
}
