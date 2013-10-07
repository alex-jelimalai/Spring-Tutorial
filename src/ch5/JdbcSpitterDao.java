package ch5;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class JdbcSpitterDao implements SpitterDao {
	private static final String SQL_INSERT_SPITTER_OLD_WAY = "insert into spitter (username, password, fullname, email, updateByEmail) values (?, ?, ?, ?, ?)";
	private static final String SQL_INSERT_SPITTER_NEW_WAY = "insert into spitter (username, password, fullname, email, updateByEmail) values "
				+ "(:username, :password, :fullname, :email, :updateByEmail)";
	private static final String SQL_SELECT_SPITTER = "select id, username, password, fullname, email, updateByEmail from spitter where id=?";
	private SimpleJdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(SimpleJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@SuppressWarnings("deprecation")
	@Override
	public void addSpitterOldWay(Spitter spitter) {
		jdbcTemplate.update(SQL_INSERT_SPITTER_OLD_WAY, spitter.getUserName(), spitter.getPassword(), spitter
					.getFullName(), spitter.getEmail(), spitter.isUpdateByEmail());
	}

	@Override
	public void addSpitter(Spitter spitter){
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("username", spitter.getUserName());
		params.put("password", spitter.getPassword());
		params.put("fullname", spitter.getFullName());
		params.put("email", spitter.getEmail());
		params.put("updateByEmail", spitter.isUpdateByEmail());
		jdbcTemplate.update(SQL_INSERT_SPITTER_NEW_WAY, params);
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public Spitter getSpitterById(int id) {
		return jdbcTemplate.queryForObject(SQL_SELECT_SPITTER, new ParameterizedRowMapper<Spitter>() {

			@Override
			public Spitter mapRow(ResultSet rs, int rowNum) throws SQLException {
				Spitter spitter = new Spitter();
				spitter.setId(rs.getInt(1));
				spitter.setUserName(rs.getString(2));
				spitter.setPassword(rs.getString(3));
				spitter.setFullName(rs.getString(4));
				spitter.setEmail(rs.getString(5));
				spitter.setUpdateByEmail(rs.getBoolean(6));
				return spitter;
			}
		}, id);
	}

}
