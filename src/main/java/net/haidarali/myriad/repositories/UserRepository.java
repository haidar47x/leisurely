package net.haidarali.myriad.repositories;

import net.haidarali.myriad.models.User;
import net.haidarali.myriad.repositories.mappers.UserRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    JdbcTemplate jdbcTemplate;

    // Use the default JDBC Template
    public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public User getUser() {
        String sql = "SELECT * FROM users WHERE id = 1";
        return jdbcTemplate.queryForObject(sql, new UserRowMapper());
    }

    public void updateUser(User user) {
        String sql = "UPDATE user SET username = ? WHERE id = 1";
        jdbcTemplate.update(sql, user.getUsername());
    }
}
