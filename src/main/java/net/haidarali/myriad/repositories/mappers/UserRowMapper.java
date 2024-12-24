package net.haidarali.myriad.repositories.mappers;

import net.haidarali.myriad.models.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        var user = new User();
        user.setUsername(rs.getString("username"));
        return user;
    }
}
